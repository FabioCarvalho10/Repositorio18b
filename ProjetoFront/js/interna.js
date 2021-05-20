function validaLogin() {
    let userTxt = localStorage.getItem("userLogged")

    if (!userTxt) {
        window.location = "index.html"
    }

    const user = JSON.parse(userTxt)

    // document.getElementById("user").innerHTML = user.nome + " <b>( " + user.cpf + " )</b>"
    // document.getElementById("user").innerHTML = user.nome + ' <b>( ' + user.cpf + ' )</b>'
    document.getElementById("user").innerHTML = `${user.nome} <b>( ${user.racf} )</b>`
}

function logout() {
    localStorage.removeItem("userLogged")
    window.location = "index.html"
}

function listarParceiros() {
    fetch("http://localhost:8080/user/all")
        .then(res => tratarRetorno(res))
}

function tratarRetorno(resposta) {
    if (resposta.status == 200) {
        document.getElementById("tabela").innerHTML = "Parceiro(s) Entrontrado(s)"
        resposta.json().then(res => exibirParceiros(res))
    } else {
        document.getElementById("tabela").innerHTML = "Nenhum Parceiro encontrado"
    }
}

function exibirParceiros(listarParceiros) {
    let tabela = "<table> <tr> <th>Parceiro</th> <th>Valor Transacional</th></tr>"

    for (let index = 0; index < listarParceiros.length; index++) {
        tabela = tabela + ` <tr><td>${listarParceiros[index].parceiro}</td> 
                                <td>${listarParceiros[index].volumeTransacional}</td> </tr>`;

    }

    tabela = tabela + " </table>"
    document.getElementById("tabela").innerHTML = tabela

    montarSelecao(listarParceiros);
}

function montarSelecao(listarParceiros) {
    let selecao = "<select>"

    for (let index = 0; index < listaParceiros.length; index++) {
        selecao = selecao + ` <option>${listaParceiros[index].nome}</option>`
    }
    selecao + selecao + "<select>"
    document.getElementById("selecao").innerHTML = selecao

}
