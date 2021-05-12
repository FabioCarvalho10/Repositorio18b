package br.carvalho.spring02.repo;

import org.springframework.data.repository.CrudRepository;
import br.carvalho.spring02.model.Conta;

//CRUD = Create, Read, Update, Delete
public interface ContaRepo extends CrudRepository<Conta, Integer> {
    public Conta findByContaAndSaldo(int conta, double saldo);

}
