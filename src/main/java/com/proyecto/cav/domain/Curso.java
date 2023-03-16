
package com.proyecto.cav.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Entity
@Data
@Table(name = "curso")
public class Curso implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_curso;
    private String descripcion;
    private String dia;
    private String hora_inicial;
    private String hora_final;
    private String activo;

    public Curso() {
    }

    public Curso(String descripcion, String dia, String hora_inicial, String hora_final, String activo) {
        this.descripcion = descripcion;
        this.dia = dia;
        this.hora_inicial = hora_inicial;
        this.hora_final = hora_final;
        this.activo = activo;
    }


    
    
    
}
