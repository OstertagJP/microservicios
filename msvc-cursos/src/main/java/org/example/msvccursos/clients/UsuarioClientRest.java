package org.example.msvccursos.clients;

import org.example.msvccursos.models.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "msvc-usuarios", url = "http://localhost:8001")
public interface UsuarioClientRest {

    @GetMapping("/api/usuarios/{id}")
    Usuario detalle(@PathVariable Long id);

    @PostMapping("/api/usuarios/")
    Usuario crear(@RequestBody Usuario usuario);
}
