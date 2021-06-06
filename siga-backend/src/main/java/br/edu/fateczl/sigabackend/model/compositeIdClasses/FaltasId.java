package br.edu.fateczl.sigabackend.model.compositeIdClasses;

import br.edu.fateczl.sigabackend.model.Aluno;
import br.edu.fateczl.sigabackend.model.Disciplina;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

public class FaltasId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "ra_aluno")
    private Aluno raAluno;

    @ManyToOne
    @JoinColumn(name = "codigo_disciplina")
    private Disciplina codigoDisciplina;

    @Column(name = "data_falta")
    private String dataFalta;

    public FaltasId() { }

    public FaltasId(Aluno raAluno, Disciplina codigoDisciplina, String dataFalta) {
        this.raAluno = raAluno;
        this.codigoDisciplina = codigoDisciplina;
        this.dataFalta = dataFalta;
    }

    public Aluno getRaAluno() {
        return raAluno;
    }

    public Disciplina getCodigoDisciplina() {
        return codigoDisciplina;
    }
}
