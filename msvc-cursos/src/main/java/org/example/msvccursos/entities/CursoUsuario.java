package org.example.msvccursos.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "cursos_usuarios")
@Data
public class CursoUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(name = "usuario_id", unique = true)
    private Long usuarioId;


    @Override
    public boolean equals (Object obj){
        if(this == obj){
            return true;
        }
        if(!(obj instanceof CursoUsuario)){
            return false;
        }
        CursoUsuario o = (CursoUsuario) obj;
        return this.usuarioId != null && this.usuarioId.equals(o.usuarioId);
    }
}
