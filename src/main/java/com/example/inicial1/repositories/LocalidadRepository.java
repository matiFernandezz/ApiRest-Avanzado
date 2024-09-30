package com.example.inicial1.repositories;


import com.example.inicial1.entities.Localidad;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadRepository extends BaseRepository<Localidad,Long>{

    @Query(
            value = "SELECT * FROM Localidad l WHERE l.nombre LIKE %:filtro%",
            countQuery = "SELECT COUNT(*) FROM localidad",
            nativeQuery = true
    )
    Page<Localidad> searchNativo(@Param("filtro") String filtro, Pageable pageable);

}