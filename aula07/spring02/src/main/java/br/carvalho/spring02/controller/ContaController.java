package br.carvalho.spring02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.carvalho.spring02.model.Conta;
import br.carvalho.spring02.repo.ContaRepo;

@RestController
@CrossOrigin("*") // Aceita requisições de outras origens
@RequestMapping("/conta")
public class ContaController {

    @Autowired // Injeção de dependência
    private ContaRepo repo;

    @GetMapping("/numero/{numero}") // {nome do parâmetro}
    public ResponseEntity<Conta> getConta(@PathVariable int numero) {
        Conta conta = repo.findById(numero).orElse(null);

        if (conta != null) {
            return ResponseEntity.ok(conta); // ok = status 200
        }
        return ResponseEntity.notFound().build(); // notFound = Erro 404
    }

    @GetMapping("/all")
    public List<Conta> getAll() {
        List<Conta> lista = (List<Conta>) repo.findAll();

        return lista;
    }

    /*
     * @PostMapping("/new") public Conta insertConta(@RequestBody User newConta) {
     * User conta = repo.save(newConta);
     * 
     * return conta;
     * 
     * }
     */

}
