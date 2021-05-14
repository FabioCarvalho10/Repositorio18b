package br.carvalho.spring03.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
    

@Entity // entidade mapeada no BD
@Table(name = "itmn_usuario")
public class Usuario {

    @Id  // indica chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-numerado (1, 2...)
    @Column(name = "id")
    private int id;

    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name = "linkfoto", length = 200, nullable = false)
    private String linkfoto;

    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "racf", length = 7, nullable = false, unique = true)
    private String racf;

    @Column(name = "senha", length = 30)
    private String senha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLinkfoto() {
        return linkfoto;
    }

    public void setLinkFoto(String linkfoto) {
        this.linkfoto = linkfoto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRacf() {
        return racf;
    }

    public void setRacf(String racf) {
        this.racf = racf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    } 
}
