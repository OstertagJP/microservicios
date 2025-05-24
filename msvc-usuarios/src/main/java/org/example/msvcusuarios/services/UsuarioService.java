package org.example.msvcusuarios.services;

import org.example.msvcusuarios.entities.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    List<Usuario> listar();

    Optional<Usuario> obtenerPorId(Long id);

    Usuario guardar(Usuario usuario);

    Optional<Usuario> porEmail(String email);

    void eliminarPorId(Long id);
}
