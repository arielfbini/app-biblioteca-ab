package com.curso.appbiblioteca.repository;

import com.curso.appbiblioteca.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository <Libro, Long> {

}
