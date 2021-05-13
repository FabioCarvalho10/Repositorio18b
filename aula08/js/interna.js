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