
package com.miportfolio.proyecto.service;

import com.miportfolio.proyecto.entity.Educacion;
import com.miportfolio.proyecto.repository.REducacion;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducacion {
    @Autowired
    public REducacion educRepo;
     
 
    public List<Educacion> verEducacion() {
       return  educRepo.findAll();
    }

   
    public void crearEducacion(Educacion edu) {
        educRepo.save(edu);
    }

    
    public void borrarEducacion(int id) {
       educRepo.deleteById(id);
    }

    
    public Educacion buscarEducacion(int id) {
     return educRepo.findById(id).orElse(null);
    }
    
      public void editarEducacion(Educacion edu) {
        educRepo.save(edu);
    }
    
}
