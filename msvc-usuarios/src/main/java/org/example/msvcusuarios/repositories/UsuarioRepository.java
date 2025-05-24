package org.example.msvcusuarios.repositories;

import org.example.msvcusuarios.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    @Override
    Optional<Usuario> findById(Long id);

    Optional<Usuario>findByEmail(String email);

    //Otra forma 1 de buscar por mail
    @Query("select  u from Usuario u where u.email=?1")
    Optional<Usuario>porEmail(String email);

    //Otra forma 2 de buscar por mail
    boolean existsByEmail(String email);

}

