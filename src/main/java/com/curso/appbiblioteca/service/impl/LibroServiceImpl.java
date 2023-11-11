package com.curso.appbiblioteca.service.impl;

import com.curso.appbiblioteca.model.Libro;
import com.curso.appbiblioteca.repository.LibroRepository;
import com.curso.appbiblioteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServiceImpl implements LibroService {
    @Autowired
    private LibroRepository libroRepository;


    @Override
    public Libro getLibroById(Long id){
        return libroRepository.getReferenceById(id);
    }
    @Override
    public Libro insertUpdateLibro(Libro libro) {
        return libroRepository.save(libro);
    }
    @Override
    public Libro deleteLibro(Long id) {
        libroRepository.deleteById(id);
        return null;
    }

    @Override
    public List<Libro> getLibros() {
        return libroRepository.findAll();
    }


}
