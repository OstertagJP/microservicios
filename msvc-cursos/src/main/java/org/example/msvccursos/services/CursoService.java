package org.example.msvccursos.services;

import micro.example.springcloud.msvc.cursos.msvccursos.entities.Curso;
import micro.example.springcloud.msvc.cursos.msvccursos.models.Usuario;

import java.util.List;
import java.util.Optional;

public interface CursoService {
    /**
     * métodos que persisten dentro de la base de datos msvc-cursos
     */
    List<Curso> listar();
    Optional<Curso>porId(Long id);
    Curso guardar(Curso curso);
    void eliminar(Long id);

    /**
     * métodos donde los datos se obtienen desde otro microservicio msvc-usuarios
     */
    Optional<Usuario> asignarUsuario(Usuario usuario, Long cursoId);
    Optional<Usuario> crearUsuario(Usuario usuario, Long cursoId);
    Optional<Usuario> des_asignarUsuario(Usuario usuario, Long cursoId);
}
