package com.example.lab3_gtics_20216352.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name= "nombre" , length=50, nullable = false)
    private String nombre;

    @Column (name= "direccion" , length=10, nullable = false)
    private String direccion;

    @Column (name= "telefono" , length=45, nullable = false)
    private String telefono;
}
