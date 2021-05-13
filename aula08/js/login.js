function fazerLogin() {
    let userTxt = document.getElementById("user").value
    let passwordTxt = document.getElementById("password").value

    //console.log(userTxt, passwordTxt)

    let user = {//Objeto user
        email: userTxt,
        cpf: userTxt,
        senha: passwordTxt
    }

    console.log(user)

    let msg = {//mensagem a ser enviada ao Backend
        method: 'POST',
        body: JSON.stringify(user),//transforma o objeto user em string para enviar
        headers: {
            'Content-type': 'application/json'
        }
    }
    fetch("http://localhost:8080/user/login", msg)
        .then(res => tratarRetorno(res)) // quando voltar a resposta do fetch
}

function tratarRetorno(retorno) {
    if (retorno == 200) {
        retorno.json().then(res => acessoPermitido(res))//extrai o objeto json de dentro do retorno
    } else {
        document.getElementById("msgErro").innerHTML = "Falha no login"
    }
}
function acessoPermitido(user) {
    localStorage.setItem("userLogged", JSON.stringify(user))
    window.location = "interna.html"//vá para esta página

}

