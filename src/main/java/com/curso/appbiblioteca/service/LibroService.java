package com.curso.appbiblioteca.service;

import com.curso.appbiblioteca.model.Lector;
import com.curso.appbiblioteca.model.Libro;

import java.util.List;

public interface LibroService {

    Libro getLibroById(Long id);

    Libro insertUpdateLibro(Libro libro);

    Libro deleteLibro (Long id);
    List<Libro> getLibros();

    //List<Libro> findByGenero(String genero);
}
