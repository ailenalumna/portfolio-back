
package com.miportfolio.proyecto.service;

import com.miportfolio.proyecto.entity.Experiencia;
import com.miportfolio.proyecto.repository.RExperiencia;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SExperiencia {
    @Autowired
    public RExperiencia expRepo;
     
 
    public List <Experiencia> verExperiencia() {
       return  expRepo.findAll();
    }

   
    public void crearExperiencia(Experiencia exp) {
         expRepo.save(exp);
    }

    
    public void borrarExperiencia(int id) {
         expRepo.deleteById(id);
    }

    
    public Experiencia buscarExperiencia(int id) {
     return  expRepo.findById(id).orElse(null);
    }
    
      public void editarExperiencia(Experiencia exp) {
         expRepo.save(exp);
    }
    
}
