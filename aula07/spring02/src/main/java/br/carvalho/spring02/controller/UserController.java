package br.carvalho.spring02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.carvalho.spring02.model.User;
import br.carvalho.spring02.repo.UserRepo;

@RestController
@CrossOrigin("*") // Aceita requisições de outras origens
@RequestMapping("/user")
public class UserController {

    @Autowired // Injeção de dependência
    private UserRepo repo;

    @GetMapping("/id/{id}") // {nome do parâmetro}
    public ResponseEntity<User> getUser(@PathVariable int id) {
        User usuario = repo.findById(id).orElse(null);

        if (usuario != null) {
            usuario.setSenha("***********");
            return ResponseEntity.ok(usuario); // ok = status 200
        }
        return ResponseEntity.notFound().build(); // notFound = Erro 404
    }

    @GetMapping("/all")
    public List<User> getAll() {
        List<User> lista = (List<User>) repo.findAll();

        return lista;
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User userParam) {
        User user = repo.findByEmailAndSenha(userParam.getEmail(), userParam.getSenha());

        if (user != null) {
            return ResponseEntity.ok(user); // ok = status 200
        }
        // return ResponseEntity.notFound().build(); // notFound = Erro 404
        return ResponseEntity.status(401).build();

    }

    @PostMapping("/new")
    public User insertUser(@RequestBody User newUser) {
        User user = repo.save(newUser);

        return user;

    }

}
