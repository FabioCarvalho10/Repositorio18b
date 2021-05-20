function logout() {
    localStorage.removeItem("userLogged")
    window.location = "index.html"
}