package br.carvalho.spring02.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.carvalho.spring02.model.User;

// CRUD = Create, Read, Update, Delete
public interface UserRepo extends CrudRepository<User, Integer> {
    public User findByEmailAndSenha(String email, String senha);
    public User findByEmailOrCpf(String email, String cpf);

    @Query(value = "Select new User(u.nome, u.email) from User u where u.id = :cod")
    public User buscaPorId(@Param("cod") int codigo);

    @Query(value = "Select nome, email from usuario where id = :cod", nativeQuery = true)
    public Object buscaPorIdNativo(@Param("cod") int codigo);
}
