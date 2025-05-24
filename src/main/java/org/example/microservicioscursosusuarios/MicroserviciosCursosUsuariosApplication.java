package org.example.microservicioscursosusuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients  // Habilita el uso de FeignClient
public class MicroserviciosCursosUsuariosApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviciosCursosUsuariosApplication.class, args);
    }

}
