package com.curso.appbiblioteca.controller;

import com.curso.appbiblioteca.model.Libro;
import com.curso.appbiblioteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {
    @Autowired
    private LibroService libroService;

    @GetMapping("/getLibros")
    public List<Libro> getLibros(){
        return libroService.getLibros();
    }

    @GetMapping("/getLibroById/{id}")
    public Libro getLibroById(@PathVariable Long id){
        return libroService.getLibroById(id);
    }
    @PostMapping("/registrarLibro")
    public Libro registrarLibro(@RequestBody Libro libro){
        return libroService.insertUpdateLibro(libro);
    }
    @PutMapping("/actualizarLibro")
    public Libro actualizarLibro(@RequestBody Libro libro){
        return libroService.insertUpdateLibro(libro);
    }
    @DeleteMapping("/deleteLibro/{id}")
    public void eliminarLibro(@PathVariable Long id){
        libroService.deleteLibro(id);
    }
}
