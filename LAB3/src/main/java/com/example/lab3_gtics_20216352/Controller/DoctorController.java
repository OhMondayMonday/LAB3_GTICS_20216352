package com.example.lab3_gtics_20216352.Controller;

import com.example.lab3_gtics_20216352.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("")
public class DoctorController {

    @Autowired
    private DoctorRepository doctorRepository;

    @GetMapping(value = {"hospitales", "/hospitales"})
    public String getAllHospitals(Model model) {
        Doctor doctor = new Doctor();
        model.addAttribute("listaHospitales", doctorRepository.findByHospitalId());
        return "hospitalList";
    }

}
