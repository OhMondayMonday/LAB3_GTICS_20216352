package com.example.lab3_gtics_20216352.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "nombre" , length=50, nullable = false)
    private String nombre;

    @Column (name= "especialidad" , length=50, nullable = false)
    private String especialidad;
}



