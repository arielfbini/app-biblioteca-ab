package com.curso.appbiblioteca.service.impl;

import com.curso.appbiblioteca.model.Prestamo;
import com.curso.appbiblioteca.repository.PrestamoRepository;
import com.curso.appbiblioteca.service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

public class PrestamoServiceImpl implements PrestamoService {

    @Autowired
    private PrestamoRepository prestamoRepository;

    @Override
    public Prestamo getPrestamoById(Long id) {
        return prestamoRepository.getReferenceById(id);
    }

    @Override
    public <List>Prestamo getPrestamos() {
        return (Prestamo)prestamoRepository.findAll();
    }

    @Override
    public Prestamo insertarUpdatePrestamo(Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }

    @Override
    public Prestamo deletePrestamo(Long id) {
        prestamoRepository.deleteById(id);
        return null;
    }

    @Override
    public Prestamo registrarDevolucionCalcularMulta(Long id) {
        Prestamo prestamo = new Prestamo();
        prestamo = getPrestamoById(id);
        if(prestamo.getFechaDevolucion() == null){
            prestamo.setFechaDevolucion(LocalDate.now());
        }
        if(prestamo.getFechaDevolucion().isEqual(prestamo.getFechaVencimiento())||prestamo.getFechaDevolucion().isBefore(prestamo.getFechaVencimiento())){
            prestamo.setImporteMulta(0D);//sin multa
        }else {
            //COMPLETAR: lógica para calcular la multa por días vencidos
            prestamo.setImporteMulta(5000D);//ejemplo
        }
        //actualizamos registro
        insertarUpdatePrestamo(prestamo);
        return prestamo;
    }

}
