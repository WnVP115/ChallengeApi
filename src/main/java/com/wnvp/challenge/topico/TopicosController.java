package com.wnvp.challenge.topico;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topico")
public class TopicosController {

    @Autowired
    private TopicosRepository topicosRepository;

    @PostMapping
    public ResponseEntity<Topicos> crearTopico(@Valid @RequestBody Topicos nuevoTopico){
        Topicos topicoGuardado = topicosRepository.save(nuevoTopico);
        return ResponseEntity.ok(topicoGuardado);
    }
}
