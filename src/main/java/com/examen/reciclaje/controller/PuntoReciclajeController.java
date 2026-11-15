package com.examen.reciclaje.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.examen.reciclaje.entity.PuntoReciclaje;
import com.examen.reciclaje.repository.PuntoReciclajeRepository;

import java.util.List;

@RestController
@RequestMapping("/api/puntos")
@CrossOrigin(origins = "*") 
public class PuntoReciclajeController {

    @Autowired
    private PuntoReciclajeRepository puntoReciclajeRepository;

    @GetMapping
    public List<PuntoReciclaje> listarPuntos() {
        return puntoReciclajeRepository.findAll();
    }

    @PostMapping
    public PuntoReciclaje guardarPunto(@RequestBody PuntoReciclaje punto) {
        return puntoReciclajeRepository.save(punto);
    }
}