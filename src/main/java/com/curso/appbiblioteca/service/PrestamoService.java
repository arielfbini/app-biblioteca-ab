package com.curso.appbiblioteca.service;

import com.curso.appbiblioteca.model.Prestamo;

public interface PrestamoService {

    Prestamo getPrestamoById (Long id);
    <List>Prestamo getPrestamos ();
    Prestamo insertarUpdatePrestamo(Prestamo prestamo);
    Prestamo deletePrestamo(Long id);

    Prestamo registrarDevolucionCalcularMulta(Long id);
}
