package br.carvalho.spring03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.carvalho.spring03.model.Usuario;
import br.carvalho.spring03.repo.UsuarioRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UsuarioController {

    @Autowired
    private UsuarioRepo repo;

    //@GetMapping("/login")
    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario userParam) {
        Usuario user = repo.findByEmailOrRacf(userParam.getEmail(), userParam.getRacf());

        if (user != null) {
            if(userParam.getSenha().equals(user.getSenha()) ) {
                return ResponseEntity.ok(user);
            }
        }
        return ResponseEntity.status(401).build();
    }
}
