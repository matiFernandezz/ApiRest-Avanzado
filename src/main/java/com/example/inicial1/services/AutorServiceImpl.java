package com.example.inicial1.services;

import com.example.inicial1.entities.Autor;
import com.example.inicial1.repositories.AutorRepository;
import com.example.inicial1.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public Page<Autor> search(String filtro, Pageable pageable) throws Exception {
        try {
            Page<Autor> autores = autorRepository.searchNativo(filtro, pageable);
            return autores;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}