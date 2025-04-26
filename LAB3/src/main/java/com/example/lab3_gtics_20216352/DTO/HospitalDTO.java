package com.example.lab3_gtics_20216352.DTO;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HospitalDTO {
    private Long id;
    private String hospitalName;
    private String direccion;
    private String telefono;

    public HospitalDTO(Long id, String nombre, String direccion, String telefono) {
    }
}