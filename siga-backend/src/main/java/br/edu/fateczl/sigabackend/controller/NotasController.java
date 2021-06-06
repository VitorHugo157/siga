package br.edu.fateczl.sigabackend.controller;

import br.edu.fateczl.sigabackend.model.Notas;
import br.edu.fateczl.sigabackend.service.NotasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notas")
public class NotasController {

    @Autowired
    NotasService service;

    @PostMapping("/add")
    public String adicionarNota(@RequestBody Notas n) {
        service.adicionarNotas(
                n.getRaAluno().getRa(),
                n.getCodigoDisciplina().getCodigo(),
                n.getCodigoAvaliacao().getCodigo(),
                n.getNota()
        );
        return "Nota adicionada com sucesso";
    }
}
