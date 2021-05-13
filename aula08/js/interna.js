function validaLogin() {
    let userTxt = localStorage.getItem("userLogged")

    if (!userTxt) {
        window.location = "index.html"
    }

    const user = JSON.parse(userTxt)

    // document.getElementById("user").innerHTML = user.nome + " <b>( " + user.cpf + " )</b>"
    // document.getElementById("user").innerHTML = user.nome + ' <b>( ' + user.cpf + ' )</b>'
    document.getElementById("user").innerHTML = `${user.nome} <b>( ${user.cpf} )</b>`
}

function logout() {
    localStorage.removeItem("userLogged")
    window.location = "index.html"
}

function listarUsuarios() {
    fetch("http://localhost:8080/user/all")
        .then(res => tratarRetorno(res))
}

function tratarRetorno(resposta) {
    if (resposta.status == 200) {
        document.getElementById("tabela").innerHTML = "Usuário(s) Entrontrado(s)"
        resposta.json().then(res => exibirUsuarios(res))
    } else {
        document.getElementById("tabela").innerHTML = "Nenhum usuario encontrado"
    }
}

function exibirUsuarios(listarUsuarios) {
    let tabela = "<table> <tr> <th>Nome</th> <th>Email</th> <th>CPF</th> </tr>"

    for (let index = 0; index < listarUsuarios.length; index++) {
        tabela = tabela + ` <tr> <td>${listarUsuarios[index].nome}</td> 
                                <td>${listarUsuarios[index].email}</td> 
                                <td>${listarUsuarios[index].cpf}</td> </tr>`;

    }

    tabela = tabela + " </table>"
    document.getElementById("tabela").innerHTML = tabela

    montarSelecao(listarUsuarios);
}

function montarSelecao(listaUsuarios) {
    let selecao = "<select>"

    for (let index = 0; index < listaUsuarios.length; index++) {
        selecao = selecao + ` <option>${listaUsuarios[index].nome}</option>`
    }
    selecao + selecao + "<select>"
    document.getElementById("selecao").innerHTML = selecao

}
