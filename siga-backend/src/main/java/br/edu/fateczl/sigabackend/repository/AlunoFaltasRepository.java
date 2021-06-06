package br.edu.fateczl.sigabackend.repository;

import br.edu.fateczl.sigabackend.model.AlunoFaltas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoFaltasRepository extends JpaRepository<AlunoFaltas, Integer> {
    List<AlunoFaltas> selectFaltas(String codigoDisciplina);
}
