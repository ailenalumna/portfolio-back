
package com.miportfolio.proyecto.repository;

import com.miportfolio.proyecto.entity.Red;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RRed extends JpaRepository <Red, Integer>{
    
}
