package com.wnvp.challenge.topico;

import com.wnvp.challenge.cursos.Cursos;
import com.wnvp.challenge.usuario.Usuarios;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "topico")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topicos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String titulo;

    @NotBlank
    private String mensaje;

    @NotNull
    @Column(updatable = false)
    private LocalDateTime fechaCreacion;

    private boolean estatus;

    @ManyToOne
    @JoinColumn(name = "autor", nullable = false)
    private Usuarios autor;

    @ManyToOne
    @JoinColumn(name = "curso", nullable = false)
    private Cursos curso;

    @PrePersist
    public void asignarFechaCreacion(){
        this.fechaCreacion = LocalDateTime.now();
    }
}
