package br.edu.fateczl.sigabackend.model;

import br.edu.fateczl.sigabackend.model.compositeIdClasses.FaltasId;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Faltas")
@IdClass(FaltasId.class)
@NamedStoredProcedureQuery(
        name = "Faltas.spInsertFaltas",
        procedureName = "sp_insertFaltas",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "ra_aluno", type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "codigo_disciplina", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "presenca", type = Integer.class)
        }
)
public class Faltas implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "ra_aluno")
    private Aluno raAluno;

    @Id
    @ManyToOne
    @JoinColumn(name = "codigo_disciplina")
    private Disciplina codigoDisciplina;

    @Id
    @Column(name = "data_falta")
    private String dataFalta;

    @Column
    private Integer presenca;

    public Faltas() { }

    public Aluno getRaAluno() { return raAluno; }
    public void setRaAluno(Aluno raAluno) { this.raAluno = raAluno; }

    public Disciplina getCodigoDisciplina() { return codigoDisciplina; }
    public void setCodigoDisciplina(Disciplina codigoDisciplina) { this.codigoDisciplina = codigoDisciplina; }

    public String getDataFalta() {
        return dataFalta;
    }
    public void setDataFalta(String dataFalta) {
        this.dataFalta = dataFalta;
    }

    public Integer getPresenca() {
        return presenca;
    }
    public void setPresenca(Integer presenca) {
        this.presenca = presenca;
    }

    @Override
    public String toString() {
        return "Faltas{" +
                "raAluno=" + raAluno +
                ", codigoDisciplina=" + codigoDisciplina +
                ", dataFalta='" + dataFalta + '\'' +
                ", presenca=" + presenca +
                '}';
    }
}
