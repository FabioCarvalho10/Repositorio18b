package br.carvalho.spring02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.carvalho.spring02.dto.UserDTO;
import br.carvalho.spring02.model.User;
import br.carvalho.spring02.repo.UserRepo;

@RestController
@CrossOrigin("*") // aceita requisições de outras origens
@RequestMapping("/user")
public class UserController {

    @Autowired // injeção de dependência
    private UserRepo repo;

    @GetMapping("/id/{id}") // { nome do parâmetro }
    public ResponseEntity<UserDTO> getUser(@PathVariable int id) {
        User usuario = repo.findById(id).orElse(null);

        if (usuario != null) {
            // usuario.setSenha("******");
            UserDTO usuarioDTO = new UserDTO(usuario);
            return ResponseEntity.ok(usuarioDTO); // ok = 200
        }
        return ResponseEntity.notFound().build(); // notFound = 404
    }

    @GetMapping("/all")
    public List<User> getAll() {
        List<User> lista = (List<User>) repo.findAll();

        return lista;
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User userParam) {
        //User user = repo.findByEmailAndSenha(userParam.getEmail(), userParam.getSenha());
        User user = repo.findByEmailOrCpf(userParam.getEmail(), userParam.getCpf());

        if (user != null) {
            if(userParam.getSenha().equals(user.getSenha()) ) {
                return ResponseEntity.ok(user);
            }
        }
        return ResponseEntity.status(401).build();
    }

    @PostMapping("/new")
    public User insertUser(@RequestBody User newUser) {
        if (newUser.getId() == 0) {
            User user = repo.save(newUser);
            return user;
        }
        return null;
    }

    @PutMapping()
    public ResponseEntity<Void> atualizar(@RequestBody User user) {
        User userBd = repo.findById(user.getId()).orElse(null);

        if (userBd != null) {
            repo.save(user);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        User userBd = repo.findById(id).orElse(null);

        if(userBd != null) {
            repo.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/id2/{id}") // { nome do parâmetro }
    public ResponseEntity<User> getUser2(@PathVariable int id) {
        User usuario = repo.buscaPorId(id);

        if (usuario != null) {
            return ResponseEntity.ok(usuario); 
        }
        return ResponseEntity.notFound().build(); 
    }

    @GetMapping("/id3/{id}") // { nome do parâmetro }
    public ResponseEntity<Object> getUser3(@PathVariable int id) {
        Object usuario = repo.buscaPorIdNativo(id);

        if (usuario != null) {
            return ResponseEntity.ok(usuario); 
        }
        return ResponseEntity.notFound().build(); 
    }
}