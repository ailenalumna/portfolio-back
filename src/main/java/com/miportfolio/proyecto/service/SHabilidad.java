
package com.miportfolio.proyecto.service;
import com.miportfolio.proyecto.entity.Habilidad;
import com.miportfolio.proyecto.repository.RHabilidad;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SHabilidad {
    @Autowired
    public RHabilidad habRepo;
     
 
    public List <Habilidad> verHabilidad() {
       return  habRepo.findAll();
    }

   
    public void crearHabilidad(Habilidad hab) {
        habRepo.save(hab);
    }

    
    public void borrarHabilidad(int id) {
        habRepo.deleteById(id);
    }

    
    public Habilidad buscarHabilidad(int id) {
     return habRepo.findById(id).orElse(null);
    }
    
      public void editarHabilidad(Habilidad hab) {
       habRepo.save(hab);
    }
}
