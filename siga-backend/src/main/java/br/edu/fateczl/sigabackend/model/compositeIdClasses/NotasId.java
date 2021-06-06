package br.edu.fateczl.sigabackend.model.compositeIdClasses;

import br.edu.fateczl.sigabackend.model.Aluno;
import br.edu.fateczl.sigabackend.model.Avaliacao;
import br.edu.fateczl.sigabackend.model.Disciplina;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

//@Embeddable
public class NotasId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "ra_aluno")
    private Aluno raAluno;

    @ManyToOne
    @JoinColumn(name = "codigo_disciplina")
    private Disciplina codigoDisciplina;

    @ManyToOne
    @JoinColumn(name = "codigo_avaliacao")
    private Avaliacao codigoAvaliacao;

    public NotasId() { }

    public NotasId(Aluno raAluno, Disciplina codigoDisciplina, Avaliacao codigoAvaliacao) {
        this.raAluno = raAluno;
        this.codigoDisciplina = codigoDisciplina;
        this.codigoAvaliacao = codigoAvaliacao;
    }

    public Aluno getRaAluno() {
        return raAluno;
    }

    public Disciplina getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public Avaliacao getCodigoAvaliacao() {
        return codigoAvaliacao;
    }
}
