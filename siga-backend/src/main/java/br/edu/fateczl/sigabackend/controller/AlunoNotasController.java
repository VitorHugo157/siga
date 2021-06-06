package br.edu.fateczl.sigabackend.controller;

import br.edu.fateczl.sigabackend.model.AlunoNotas;
import br.edu.fateczl.sigabackend.service.AlunoNotasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("notas")
public class AlunoNotasController {

    @Autowired
    AlunoNotasService service;

    @GetMapping("/{codigoDisciplina}")
    public ResponseEntity<List<AlunoNotas>> listarNotas(@PathVariable(value = "codigoDisciplina") String codigoDisciplina) {
        List<AlunoNotas> notas = service.listarNotas(codigoDisciplina);
        return ResponseEntity.ok().body(notas);
    }
}
