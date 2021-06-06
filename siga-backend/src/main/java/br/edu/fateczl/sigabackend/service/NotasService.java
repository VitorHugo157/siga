package br.edu.fateczl.sigabackend.service;

import br.edu.fateczl.sigabackend.repository.NotasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotasService {

    @Autowired
    NotasRepository repository;

    public void adicionarNotas(Integer raAluno, String codigoDisciplina, Integer codigoAvaliacao, Float nota) {
        repository.spInsertNotas(raAluno, codigoDisciplina, codigoAvaliacao, nota);
    }
}
