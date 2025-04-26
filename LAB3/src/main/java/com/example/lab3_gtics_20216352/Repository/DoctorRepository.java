package com.example.lab3_gtics_20216352.Repository;

import com.example.lab3_gtics_20216352.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

    @Query("SELECT d FROM Doctor d WHERE d.hospital.id = :hospitalId")
    List<DoctorDTO> findByHospitalId(Integer hospitalId);
}