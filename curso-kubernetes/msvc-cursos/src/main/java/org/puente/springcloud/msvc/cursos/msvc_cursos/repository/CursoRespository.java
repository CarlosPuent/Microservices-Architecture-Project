package org.puente.springcloud.msvc.cursos.msvc_cursos.repository;

import org.puente.springcloud.msvc.cursos.msvc_cursos.model.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface CursoRespository extends JpaRepository<Curso, Long> {

    @Modifying
    @Query("delete from CursoUsuario cu where cu.usuarioId=?1")
    void eliminarCursoUsuarioPorId(Long id);
}
