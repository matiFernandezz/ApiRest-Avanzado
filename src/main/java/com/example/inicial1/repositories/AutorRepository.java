package com.example.inicial1.repositories;

import com.example.inicial1.entities.Autor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends BaseRepository<Autor, Long> {

    @Query(
            value = "SELECT * FROM autor WHERE autor.nombre LIKE %:filtro%",
            countQuery = "SELECT COUNT(*) FROM autor",
            nativeQuery = true
    )
    Page<Autor> searchNativo(@Param("filtro") String filtro, Pageable pageable);
}