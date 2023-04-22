
package com.miportfolio.proyecto.service;

import com.miportfolio.proyecto.entity.Proyecto;
import com.miportfolio.proyecto.repository.RProyecto;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyecto {
      
    @Autowired
    public RProyecto proyRepo;
     
 
    public List<Proyecto> verProyecto() {
       return  proyRepo.findAll();
    }

   
    public void crearProyecto(Proyecto proy) {
        proyRepo.save(proy);
    }

    
    public void borrarProyecto(int id) {
        proyRepo.deleteById(id);
    }

    
    public Proyecto buscarProyecto(int id) {
     return proyRepo.findById(id).orElse(null);
    }
    
      public void editarProyecto(Proyecto proy) {
        proyRepo.save(proy);
    }
}
