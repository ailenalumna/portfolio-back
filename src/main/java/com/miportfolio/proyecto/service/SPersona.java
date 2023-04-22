
package com.miportfolio.proyecto.service;

import com.miportfolio.proyecto.entity.Persona;
import com.miportfolio.proyecto.repository.RPersona;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SPersona {
    @Autowired
    public RPersona persoRepo;
    

    public Persona loginPersona(String email, String clave) {
List <Persona> personas = persoRepo.findByEmailAndClave(email, clave);
if(!personas.isEmpty()){
return personas.get(0); //si la lista no esta vacia me devuelve la de la posicion 0
}
return null;
}
    
    
    public List<Persona> verPersonas() {
      
        return   persoRepo.findAll();
    }

   
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }

    
    public void borrarPersona(int id) {
        persoRepo.deleteById(id);
    }

    
    public Persona buscarPersona(int id) {
     return persoRepo.findById(id).orElse(null);
    }
    
      public void editarPersona(Persona per) {
        persoRepo.save(per);
    }




}

  
 