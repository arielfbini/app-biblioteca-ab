package com.curso.appbiblioteca.repository;
import com.curso.appbiblioteca.model.Lector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LectorRepository extends JpaRepository <Lector, Long> {
    Lector findByDni(Long dni);
}
