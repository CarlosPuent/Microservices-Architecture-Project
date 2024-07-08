package org.puente.springcloud.msvc.usuarios.msvc_usuarios.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "msvc-cursos", url = "${msvc.cursos.url}")
//@FeignClient(name = "msvc-cursos", url = "msvc-cursos:8002/api/v1/cursos")
public interface CursoClienteRest {

    @DeleteMapping("/eliminar-curso-usuario/{id}")
    void eliminarCursoUsuarioPorId(@PathVariable Long id);
}



