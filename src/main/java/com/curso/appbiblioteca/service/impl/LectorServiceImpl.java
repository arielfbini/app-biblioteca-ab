package com.curso.appbiblioteca.service.impl;

import com.curso.appbiblioteca.model.Lector;
import com.curso.appbiblioteca.repository.LectorRepository;
import com.curso.appbiblioteca.service.LectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LectorServiceImpl implements LectorService {
    //Inyección de dependencia
    @Autowired
    private LectorRepository lectorRepository;

    @Override
    public Lector getLectorById(Long id) {
        return lectorRepository.getReferenceById(id);
    }


    @Override
    public Lector findByDni(Long dni) {
        return lectorRepository.getReferenceById(dni);
    }

    @Override
    public List<Lector> getLectores() {
        return lectorRepository.findAll();
    }

    @Override
    public Lector insertUpdateLector(Lector lector) {
        return lectorRepository.save(lector);
    }

    @Override
    public Lector deleteLector(Long id) {
        lectorRepository.deleteById(id);
        return null;
    }


}
