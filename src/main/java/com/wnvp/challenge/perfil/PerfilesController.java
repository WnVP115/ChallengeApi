package com.wnvp.challenge.perfil;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
@RequestMapping("/perfil")
public class PerfilesController {

    @Autowired
    private PerfilesRepository perfilesRepository;

    @PostMapping
    public ResponseEntity<Perfiles> crearPerfil(@Valid @RequestBody Perfiles nuevoPerfil){
        Perfiles perfilGuardado = perfilesRepository.save(nuevoPerfil);
        return ResponseEntity.ok(perfilGuardado);
    }
}
