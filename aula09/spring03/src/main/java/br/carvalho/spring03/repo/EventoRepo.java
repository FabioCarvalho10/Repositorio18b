package br.carvalho.spring03.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.carvalho.spring03.dto.ContagemAlarme;
import br.carvalho.spring03.model.Evento;

public interface EventoRepo extends CrudRepository<Evento, Integer> {
    public List<Evento> findByDataEvtBetween (LocalDate ini, LocalDate fim);

    @Query("Select new br.carvalho.spring03.dto.ContagemAlarme(e.alarme.nome, Count(e.alarme.nome)) From Evento as e where e.dataEvt = ?1 group by e.alarme.nome")
    public List<ContagemAlarme> countAlarmePorTipo(LocalDate data);

}