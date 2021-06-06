package br.edu.fateczl.sigabackend.service;

import br.edu.fateczl.sigabackend.repository.FaltasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FaltasService {

    @Autowired
    FaltasRepository repository;

    public void adicionarFaltas(Integer raAluno, String codigoDisciplina, Integer presenca) {
        repository.spInsertFaltas(raAluno, codigoDisciplina, presenca);
    }
}
