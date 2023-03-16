
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
@Table(name = "administrador")
public class Admin implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_admin;
    private String nombre;
    private String apellidoA;
    private String apellidoB;
    private String clave;

    public Admin() {
    }

    public Admin(String nombre, String apellidoA, String apellidoB, String clave) {
        this.nombre = nombre;
        this.apellidoA = apellidoA;
        this.apellidoB = apellidoB;
        this.clave = clave;
    }
    
    
    
    
    
}
