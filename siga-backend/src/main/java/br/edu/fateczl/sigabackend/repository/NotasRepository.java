package br.edu.fateczl.sigabackend.repository;

import br.edu.fateczl.sigabackend.model.Notas;
import br.edu.fateczl.sigabackend.model.compositeIdClasses.NotasId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NotasRepository extends JpaRepository<Notas, NotasId> {
    @Procedure(name = "Notas.spInsertNotas")
    void spInsertNotas(@Param("ra_aluno") Integer raAluno,
                       @Param("codigo_disciplina") String codigoDisciplina,
                       @Param("codigo_avaliacao") Integer codigoAvaliacao,
                       @Param("nota") Float nota);
}
