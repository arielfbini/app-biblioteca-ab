package com.curso.appbiblioteca.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate fechaInicioPrestamo;
    private LocalDate fechaDevolucion;
    private LocalDate fechaVencimiento;
    private Double importeMulta;
    @OneToOne
    private Libro libro;
    @OneToOne
    private Lector lector;

    //getters y setters


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getFechaInicioPrestamo() {
        return fechaInicioPrestamo;
    }

    public void setFechaInicioPrestamo(LocalDate fechaInicioPrestamo) {
        this.fechaInicioPrestamo = fechaInicioPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Double getImporteMulta() {
        return importeMulta;
    }

    public void setImporteMulta(Double importeMulta) {
        this.importeMulta = importeMulta;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }
}
