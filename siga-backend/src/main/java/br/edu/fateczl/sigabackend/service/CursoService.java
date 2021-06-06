package br.edu.fateczl.sigabackend.service;

import br.edu.fateczl.sigabackend.model.Curso;
import br.edu.fateczl.sigabackend.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    CursoRepository repository;

    List<Curso> selectCursos() { return repository.findAll(); }
}
