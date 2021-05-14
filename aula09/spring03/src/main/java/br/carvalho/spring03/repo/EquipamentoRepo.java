package br.carvalho.spring03.repo;

import org.springframework.data.repository.CrudRepository;
import br.carvalho.spring03.model.Equipamento;

public interface EquipamentoRepo extends CrudRepository<Equipamento, Integer> {

}
