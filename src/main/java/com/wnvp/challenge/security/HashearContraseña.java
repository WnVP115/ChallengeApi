package com.wnvp.challenge.security;

import com.wnvp.challenge.usuario.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class HashearContraseña {

    @Autowired
    public BCryptPasswordEncoder passwordEncoder;

    public Usuarios crearContraseñaHash(Usuarios usuario) {
        String contraseñaHasheada = passwordEncoder.encode(usuario.getContraseña());
        usuario.setContraseña(contraseñaHasheada);
        return usuario;
    }
}
