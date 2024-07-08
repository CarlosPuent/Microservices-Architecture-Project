package org.puente.springcloud.msvc.cursos.msvc_cursos.service.interfaz;

import org.puente.springcloud.msvc.cursos.msvc_cursos.model.Usuario;
import org.puente.springcloud.msvc.cursos.msvc_cursos.model.entity.Curso;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;
import java.util.Optional;

public interface CursoService {
    List<Curso> listar();
    Optional<Curso> porId(Long id);
    Optional<Curso> porIdConUsuarios(Long id);
    Curso guardar(Curso curso);
    void eliminar(Long id);

    Optional<Usuario> asignarUsuario(Usuario usuario, Long cursoId);
    Optional<Usuario> crearUsuario(Usuario usuario, Long cursoId);
    Optional<Usuario> eliminarUsuario(Usuario usuario, Long cursoId);
}


