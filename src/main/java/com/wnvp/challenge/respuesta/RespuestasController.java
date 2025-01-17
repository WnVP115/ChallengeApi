package com.wnvp.challenge.respuesta;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/respuesta")
public class RespuestasController {

    @Autowired
    private RespuestasRepository respuestasRepository;

    @PostMapping
    public ResponseEntity<Respuestas> crearRespuesta (@Valid @RequestBody Respuestas nuevaRespuesta){
        Respuestas respuestaGuardada = respuestasRepository.save(nuevaRespuesta);
        return ResponseEntity.ok(respuestaGuardada);
    }
}
