package com.example.inicial1.services;

import com.example.inicial1.entities.Autor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AutorService extends BaseService<Autor, Long> {

    Page<Autor> search(String filtro,Pageable pageable) throws Exception;
}