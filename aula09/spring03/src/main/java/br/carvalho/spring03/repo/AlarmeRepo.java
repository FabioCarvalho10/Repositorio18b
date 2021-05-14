package br.carvalho.spring03.repo;

import org.springframework.data.repository.CrudRepository;
import br.carvalho.spring03.model.Alarme;

public interface AlarmeRepo extends CrudRepository<Alarme, Integer> {

}
