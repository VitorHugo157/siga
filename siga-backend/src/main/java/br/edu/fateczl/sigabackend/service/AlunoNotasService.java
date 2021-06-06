package br.edu.fateczl.sigabackend.service;

import br.edu.fateczl.sigabackend.model.AlunoNotas;
import br.edu.fateczl.sigabackend.repository.AlunoNotasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoNotasService {

    @Autowired
    AlunoNotasRepository repository;

    public List<AlunoNotas> listarNotas(String codigoDisciplina) {
        return repository.selectNotas(codigoDisciplina);
    }
}
