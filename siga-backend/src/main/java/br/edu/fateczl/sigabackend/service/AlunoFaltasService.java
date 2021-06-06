package br.edu.fateczl.sigabackend.service;

import br.edu.fateczl.sigabackend.model.AlunoFaltas;
import br.edu.fateczl.sigabackend.repository.AlunoFaltasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoFaltasService {

    @Autowired
    AlunoFaltasRepository repository;

    public List<AlunoFaltas> listarFaltas(String codigoDisciplina) { return repository.selectFaltas(codigoDisciplina); }
}
