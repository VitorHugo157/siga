package br.edu.fateczl.sigabackend.model;

import javax.persistence.*;

@Entity
@Table(name = "Avaliacao")
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer codigo;

    @Column
    private String tipo;

    public Avaliacao() { }

    public Avaliacao(Integer codigo, String tipo) {
        this.codigo = codigo;
        this.tipo = tipo;
    }

    public Integer getCodigo() { return codigo; }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "codigo=" + codigo +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
