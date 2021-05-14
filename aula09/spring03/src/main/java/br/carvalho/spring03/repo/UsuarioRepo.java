package br.carvalho.spring03.repo;

import org.springframework.data.repository.CrudRepository;
import br.carvalho.spring03.model.Usuario;

// CRUD = Create, Read, Update, Delete
public interface UsuarioRepo extends CrudRepository<Usuario, Integer> {
    public Usuario findByEmailOrRacf(String email, String racf);


}
