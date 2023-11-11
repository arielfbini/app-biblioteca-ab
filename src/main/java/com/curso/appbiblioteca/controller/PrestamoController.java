package com.curso.appbiblioteca.controller;

import com.curso.appbiblioteca.model.Prestamo;
import com.curso.appbiblioteca.service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contratos")
public class PrestamoController {

    @Autowired
    private PrestamoService prestamoService;

    @GetMapping("/getPrestamos")
    public List<Prestamo> getPrestamos(){
        List<Prestamo> prestamos;
        prestamos = (List<Prestamo>) prestamoService.getPrestamos();
        return prestamos;
    }
    @GetMapping("/getPrestamoById")
    public Prestamo getPrestamoById(Long id){
        return prestamoService.getPrestamoById(id);
    }
    @PostMapping("/registrarPrestamo")
    public Prestamo registrarPrestamo(@RequestBody Prestamo prestamo){
        return prestamoService.insertarUpdatePrestamo(prestamo);
    }

    @PutMapping("/actualizarPrestamo")
    public Prestamo actualizarPrestamo(@RequestBody Prestamo prestamo){
        return prestamoService.insertarUpdatePrestamo(prestamo);
    }
    @DeleteMapping("/deleteLibro/{id}")
    public void eliminarPrestamo(@PathVariable Long id){
        prestamoService.deletePrestamo(id);
    }

    @PutMapping("/registrarDevolucionMulta")
    public Prestamo registrarDevolucionMulta(@PathVariable Long id){
        return prestamoService.registrarDevolucionCalcularMulta(id);
    };
}
