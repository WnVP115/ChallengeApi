package com.wnvp.challenge.cursos;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
@RequestMapping("/curso")
public class CursosController {

    @Autowired
    private CursosRepository cursosRepository;

    @PostMapping
    public ResponseEntity<Cursos> crearCurso(@Valid @RequestBody Cursos nuevoCurso){
        Cursos cursoGuardado = cursosRepository.save(nuevoCurso);
        return ResponseEntity.ok(cursoGuardado);
    }
}
