package com.example.inicial1.services;

import com.example.inicial1.entities.Localidad;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface LocalidadService extends BaseService<Localidad, Long> {

    Page<Localidad> search(String filtro,Pageable pageable) throws Exception;
}