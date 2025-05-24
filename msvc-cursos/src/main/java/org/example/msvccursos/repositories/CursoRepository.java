package org.example.msvccursos.repositories;

import micro.example.springcloud.msvc.cursos.msvccursos.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso,Long> {
}
