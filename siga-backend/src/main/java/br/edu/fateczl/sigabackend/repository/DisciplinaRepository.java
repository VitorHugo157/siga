package br.edu.fateczl.sigabackend.repository;

import br.edu.fateczl.sigabackend.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, String> {
}
