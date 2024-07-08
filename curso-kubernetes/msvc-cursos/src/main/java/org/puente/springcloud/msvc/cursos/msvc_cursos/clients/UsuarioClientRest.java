package org.puente.springcloud.msvc.cursos.msvc_cursos.clients;

import org.puente.springcloud.msvc.cursos.msvc_cursos.model.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@FeignClient(name = "msvc-usuarios", url = "${msvc.usuarios.url}")
//@FeignClient(name = "msvc-usuarios", url = "msvc-usuarios:8001/api/v1/usuarios")
public interface UsuarioClientRest {

    @GetMapping("/{id}")
    Usuario detalle(@PathVariable Long id);

    @PostMapping
    Usuario crear(@RequestBody Usuario usuario);

    @GetMapping("/usuarios-por-curso")
    List<Usuario> obtenerAlumnosPorCurso(@RequestParam Iterable<Long> ids);

}
