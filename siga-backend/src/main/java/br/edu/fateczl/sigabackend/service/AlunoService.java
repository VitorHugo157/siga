package br.edu.fateczl.sigabackend.service;

import br.edu.fateczl.sigabackend.model.Aluno;
import br.edu.fateczl.sigabackend.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository repository;

    List<Aluno> selectAlunos() { return repository.findAll(); }
}
