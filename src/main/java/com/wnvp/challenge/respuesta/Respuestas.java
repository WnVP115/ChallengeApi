package com.wnvp.challenge.respuesta;

import com.wnvp.challenge.topico.Topicos;
import com.wnvp.challenge.usuario.Usuarios;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "respuesta")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Respuestas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String mensaje;

    @ManyToOne
    @JoinColumn(name = "topico", nullable = false)
    private Topicos topico;

    @NotNull
    private LocalDateTime fechaCreacion;

    @ManyToOne
    @JoinColumn(name = "autor", nullable = false)
    private Usuarios autor;

    @NotBlank
    private String solucion;
}
