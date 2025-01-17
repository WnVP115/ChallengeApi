package com.wnvp.challenge.usuario;

import com.wnvp.challenge.security.HashearContraseña;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuariosController {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @Autowired
    private HashearContraseña hashearContraseña;

    @PostMapping
    public ResponseEntity<Usuarios> crearUsuario (@Valid @RequestBody Usuarios nuevoUsuario){
        Usuarios usuarioContraseña = hashearContraseña.crearContraseñaHash(nuevoUsuario);
        Usuarios usuarioGuardado = usuariosRepository.save(usuarioContraseña);
        return ResponseEntity.ok(usuarioGuardado);
    }
}
