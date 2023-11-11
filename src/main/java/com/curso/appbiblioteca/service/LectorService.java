package com.curso.appbiblioteca.service;
import com.curso.appbiblioteca.model.Lector;

import java.util.List;

public interface LectorService {

    Lector getLectorById(Long id);

    Lector findByDni(Long dni);

    List<Lector> getLectores();

    //registrar nuevo lector o actualizar
    Lector insertUpdateLector(Lector lector);

    Lector deleteLector (Long id);

}
