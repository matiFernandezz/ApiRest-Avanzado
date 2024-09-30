package com.example.inicial1.controllers;

import com.example.inicial1.entities.Localidad;
import com.example.inicial1.services.LocalidadServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {

    @GetMapping("/searchPaged")
    public ResponseEntity<?> search(@RequestBody String filtro, Pageable pageable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro, pageable));
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente más tarde\"}");
        }
    }
}