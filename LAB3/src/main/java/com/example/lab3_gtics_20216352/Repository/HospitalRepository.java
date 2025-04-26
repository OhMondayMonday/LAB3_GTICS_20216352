package com.example.lab3_gtics_20216352.Repository;

import com.example.lab3_gtics_20216352.DTO.HospitalDTO;
import com.example.lab3_gtics_20216352.Model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {
    @Query(nativeQuery = true, value = "Select * FROM hospital")
    List<HospitalDTO> buscarTodos();
}

