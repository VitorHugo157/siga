package br.edu.fateczl.sigabackend.service;

import br.edu.fateczl.sigabackend.model.Disciplina;
import br.edu.fateczl.sigabackend.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaService {

    @Autowired
    DisciplinaRepository repository;

    List<Disciplina> selectDisciplinas() { return repository.findAll(); }
}
