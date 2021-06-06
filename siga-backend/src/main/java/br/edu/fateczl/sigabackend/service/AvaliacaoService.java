package br.edu.fateczl.sigabackend.service;

import br.edu.fateczl.sigabackend.model.Avaliacao;
import br.edu.fateczl.sigabackend.repository.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoService {

    @Autowired
    AvaliacaoRepository repository;

    List<Avaliacao> selectAvaliacoes() { return repository.findAll(); }
}
