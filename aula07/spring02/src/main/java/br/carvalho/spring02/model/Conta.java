package br.carvalho.spring02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "conta")
public class Conta {

    @Id // Indica chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autonumerado/Autoincremento (1,2,3...)
    @Column(name = "numero")
    private int numero;

    @Column(name = "saldo")
    private double saldo;

    @OneToOne
    @JoinColumn(name = "id_user")
    private User usuario;

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}