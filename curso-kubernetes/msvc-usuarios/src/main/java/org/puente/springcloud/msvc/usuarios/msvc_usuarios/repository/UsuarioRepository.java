package org.puente.springcloud.msvc.usuarios.msvc_usuarios.repository;

import org.puente.springcloud.msvc.usuarios.msvc_usuarios.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByEmail(String email);

    boolean existsByEmail(String email);
}
