
package com.miportfolio.proyecto.repository;

import com.miportfolio.proyecto.entity.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RHabilidad extends JpaRepository <Habilidad, Integer> {
    
}
