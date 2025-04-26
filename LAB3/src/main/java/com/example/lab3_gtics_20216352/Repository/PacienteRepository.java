package com.example.lab3_gtics_20216352.Repository;

import com.example.hospitalapp.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PacienteRepository extends JpaRepository<Paciente, Integer> {

    @Query("SELECT p FROM Patient p WHERE p.hospital.id = :hospitalId")
    List<Paciente> findByHospitalId(Integer hospitalId);
}
