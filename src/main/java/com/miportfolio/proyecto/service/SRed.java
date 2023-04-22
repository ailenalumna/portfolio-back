
package com.miportfolio.proyecto.service;

import com.miportfolio.proyecto.entity.Red;
import com.miportfolio.proyecto.repository.RRed;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SRed {
       @Autowired
    public RRed redesRepo;
     
 
    public List<Red> verRedes() {
       return  redesRepo.findAll();
    }

   
    public void crearRedes(Red reds) {
        redesRepo.save(reds);
    }

    
    public void borrarRedes(int id) {
        redesRepo.deleteById(id);
    }

    
    public Red buscarRedes(int id) {
     return redesRepo.findById(id).orElse(null);
    }
    
      public void editarRedes(Red reds) {
        redesRepo.save(reds);
    }
}
