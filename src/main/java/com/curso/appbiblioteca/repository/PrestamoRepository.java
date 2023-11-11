package com.curso.appbiblioteca.repository;

import com.curso.appbiblioteca.model.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {

}
