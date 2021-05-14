package br.carvalho.spring03.repo;

import org.springframework.data.repository.CrudRepository;
import br.carvalho.spring03.model.Evento;

public interface EventoRepo extends CrudRepository<Evento, Integer> {

}