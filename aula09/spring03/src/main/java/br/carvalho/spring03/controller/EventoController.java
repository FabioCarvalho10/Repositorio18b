package br.carvalho.spring03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.carvalho.spring03.model.Evento;
import br.carvalho.spring03.repo.EventoRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/event")
public class EventoController {
    
    @Autowired
    private EventoRepo repo;

    @GetMapping("/id/{id}")
    public Evento getEvento(@PathVariable int id){
        Evento evento = repo.findById(id).orElse(null);

        return evento;
    }
}

