package br.edu.fateczl.sigabackend.repository;

import br.edu.fateczl.sigabackend.model.Faltas;
import br.edu.fateczl.sigabackend.model.compositeIdClasses.FaltasId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FaltasRepository extends JpaRepository<Faltas, FaltasId> {
    @Procedure(name = "Faltas.spInsertFaltas")
    void spInsertFaltas(@Param("ra_aluno") Integer raAluno,
                        @Param("codigo_disciplina") String codigoDisciplina,
                        @Param("presenca") Integer presenca);
}
