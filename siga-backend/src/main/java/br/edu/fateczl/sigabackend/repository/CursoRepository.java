package br.edu.fateczl.sigabackend.repository;

import br.edu.fateczl.sigabackend.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
