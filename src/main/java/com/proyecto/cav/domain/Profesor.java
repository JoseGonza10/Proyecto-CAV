
package com.proyecto.cav.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Entity
@Data
@Table(name = "profesor")
public class Profesor implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_profesor;
    

    private int id_especializacion;
    private String nombre;
    private String apellidoA;
    private String apellidoB;
    private String telefono;
    private String correo;
    private String clave;

    public Profesor() {
    }

    public Profesor(int id_especializacion, String nombre, String apellidoA, String apellidoB, String telefono, String correo, String clave) {
        this.id_especializacion = id_especializacion;
        this.nombre = nombre;
        this.apellidoA = apellidoA;
        this.apellidoB = apellidoB;
        this.telefono = telefono;
        this.correo = correo;
        this.clave = clave;
    }
    
    
    
    
    
}
