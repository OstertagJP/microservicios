package org.example.msvcusuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients  // Habilita el uso de FeignClient
public class MsvcUsuariosApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsvcUsuariosApplication.class, args);
    }

}
