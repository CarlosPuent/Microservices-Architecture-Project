package org.puente.springcloud.msvc.cursos.msvc_cursos.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {

    private Long id;

    private String nombre;

    private String email;

    private String password;
}
