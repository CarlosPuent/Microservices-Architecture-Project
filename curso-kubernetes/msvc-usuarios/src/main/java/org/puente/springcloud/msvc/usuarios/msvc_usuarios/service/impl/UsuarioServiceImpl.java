package org.puente.springcloud.msvc.usuarios.msvc_usuarios.service.impl;

import lombok.RequiredArgsConstructor;
import org.puente.springcloud.msvc.usuarios.msvc_usuarios.client.CursoClienteRest;
import org.puente.springcloud.msvc.usuarios.msvc_usuarios.model.entity.Usuario;
import org.puente.springcloud.msvc.usuarios.msvc_usuarios.repository.UsuarioRepository;
import org.puente.springcloud.msvc.usuarios.msvc_usuarios.service.interfaz.UsuarioService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final CursoClienteRest client;

    @Transactional(readOnly = true)
    @Override
    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Usuario> porId(Long id) {
        return usuarioRepository.findById(id);
    }

    @Transactional
    @Override
    public Usuario guardar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Transactional
    @Override
    public void eliminar(Long id) {
        usuarioRepository.deleteById(id);
        client.eliminarCursoUsuarioPorId(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> listarPorIds(Iterable<Long> ids) {
        return (List<Usuario>) usuarioRepository.findAllById(ids);
    }

    @Override
    public Optional<Usuario> buscarPorEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }

    @Override
    public boolean existePorEmail(String email) {
        return usuarioRepository.existsByEmail(email);
    }
}
