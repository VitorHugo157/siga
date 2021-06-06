package br.edu.fateczl.sigabackend.repository;

import br.edu.fateczl.sigabackend.model.AlunoNotas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoNotasRepository extends JpaRepository<AlunoNotas, Integer> {
    List<AlunoNotas> selectNotas(String codigoDisciplina);
}
