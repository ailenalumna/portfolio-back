
package com.miportfolio.proyecto.repository;

import com.miportfolio.proyecto.entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion extends JpaRepository <Educacion, Integer> {
    
}
