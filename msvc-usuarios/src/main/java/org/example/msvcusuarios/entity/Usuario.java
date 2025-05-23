package org.example.msvcusuarios.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    @NotEmpty(message = "El campo nombre no puede ser vacío")
    private String nombre;

    @Column(unique = true)
    @NotEmpty(message = "El campo email no puede ser vacío")
    @Email
    private String email;

    @NotBlank //NotBlank es un poco mas completo que NotEmpty
    private String password;

}