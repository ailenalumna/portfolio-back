
package com.miportfolio.proyecto.controller;

import com.miportfolio.proyecto.entity.Experiencia;
import com.miportfolio.proyecto.service.SExperiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("experiencia") //localhost:8080/experiencia
@CrossOrigin(origins = "https://portfolio-back-8y7e.onrender.com")

public class CExperiencia {
    @Autowired    
    SExperiencia expServ;

@GetMapping ("/lista")
@ResponseBody
public List <Experiencia> verExperiencia(){
    return expServ.verExperiencia();
}
  
@GetMapping ("/ver/{id}")
@ResponseBody
   public Experiencia verExperiencia(@PathVariable int id){
      return expServ.buscarExperiencia(id);
    }
   
 @PostMapping("/crear")
  public String agregarExperiencia (@RequestBody Experiencia exp) {
      expServ.crearExperiencia(exp);
      return "La experiencia fue creada correctamente";
  }
   @DeleteMapping ("/borrar/{id}")
    public String eliminarExperiencia (@PathVariable int id) {
        expServ.borrarExperiencia(id);
        return "La experiencia fue borrada correctamente";
     }
    
    @PutMapping("/editar")
    public void updateExperienciaa(@RequestBody Experiencia exp) {
        expServ.editarExperiencia(exp);
    }
}
