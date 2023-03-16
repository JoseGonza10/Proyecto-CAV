
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
@Table(name = "estudiante")
public class Estudiante implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_estudiante;
    private String nombre;
    private String apellidoA;
    private String apellidoB;
    private String telefono;
    private String correo;
    private String clave;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellidoA, String apellidoB, String telefono, String correo, String clave) {
        this.nombre = nombre;
        this.apellidoA = apellidoA;
        this.apellidoB = apellidoB;
        this.telefono = telefono;
        this.correo = correo;
        this.clave = clave;
    }
    
    
    
}
