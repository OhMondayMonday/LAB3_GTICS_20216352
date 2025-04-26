package com.example.lab3_gtics_20216352.Controller;

import com.example.lab3_gtics_20216352.DTO.HospitalDTO;
import com.example.lab3_gtics_20216352.Model.Hospital;
import com.example.lab3_gtics_20216352.Repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("")
public class HospitalController {

    @Autowired
    private HospitalRepository hospitalRepository;

    @GetMapping(value = {"hospitales", "/hospitales"})
    public String getAllHospitals(Model model) {
        Hospital hospital = new Hospital();
        model.addAttribute("listaHospitales", hospitalRepository.buscarTodos());
        return "hospitalList";
    }

}

