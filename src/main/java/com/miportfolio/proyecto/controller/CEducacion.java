package com.miportfolio.proyecto.controller;

import com.miportfolio.proyecto.entity.Educacion;
import com.miportfolio.proyecto.service.SEducacion;
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
@RequestMapping("educacion") //localhost:8080/educacion
@CrossOrigin(origins = "http://localhost:4200")
public class CEducacion {
    @Autowired    
    SEducacion educServ;

@GetMapping ("/lista")
@ResponseBody
public List <Educacion> verEducacion(){
    return educServ.verEducacion();
}
  
@GetMapping ("/ver/{id}")
@ResponseBody
   public Educacion verEducacion(@PathVariable int id){
      return educServ.buscarEducacion(id);
    }
   
 @PostMapping("/crear")
  public String agregarEducacion (@RequestBody Educacion educ) {
      educServ.crearEducacion(educ);
      return "La educación fue creada correctamente";
  }
   @DeleteMapping ("/borrar/{id}")
    public String eliminarEducacion (@PathVariable int id) {
        educServ.borrarEducacion(id);
        return "La educación fue borrada correctamente";
     }
   
    @PutMapping("/editar")
    public void updateEducacion(@RequestBody Educacion educ) {
        educServ.editarEducacion(educ);
    }
    
}
