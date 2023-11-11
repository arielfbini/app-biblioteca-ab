package com.curso.appbiblioteca.controller;

import com.curso.appbiblioteca.model.Lector;
import com.curso.appbiblioteca.service.LectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lectores")
public class LectorController {
    @Autowired
    private LectorService lectorService;

    @GetMapping("/getLectores")
    public List<Lector> getLectores(){
        return lectorService.getLectores();
    }

    @GetMapping("/getLectorById/{id}")
    public Lector getLectorById(@PathVariable Long id){
        return lectorService.getLectorById(id);
    }

    @GetMapping("/getLectorByDni/{dni}")
    public Lector getLectorByDni(@PathVariable Long dni){
        return lectorService.findByDni(dni);
    }

    @PostMapping("/registrarLector")
    public Lector registrarLector(@RequestBody Lector lector){
        return lectorService.insertUpdateLector(lector);
    }

    @PutMapping("/actualizarLector")
    public Lector actualizarLector(@RequestBody Lector lector){
        return lectorService.insertUpdateLector(lector);
    }

    @DeleteMapping("/delete/{id}")
    public void eliminarLector(@PathVariable Long id){
        //Lector lector = new Lector();
        //lector.setId(id);
        lectorService.deleteLector(id);
    }
}
