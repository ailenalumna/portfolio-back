
package com.miportfolio.proyecto.controller;

import com.miportfolio.proyecto.entity.Red;
import com.miportfolio.proyecto.service.SRed;
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
@RequestMapping("red") //localhost:8080/red
@CrossOrigin(origins = "http://localhost:4200")
public class CRed {
    @Autowired    
    SRed redServ;

@GetMapping ("/lista")
@ResponseBody
public List <Red> verRedes(){
    return redServ.verRedes();
}
  
@GetMapping ("/ver/{id}")
@ResponseBody
   public Red verRedes(@PathVariable int id){
      return redServ.buscarRedes(id);
    }
   
 @PostMapping("/crear")
  public String agregarRedes (@RequestBody Red reds) {
     redServ.crearRedes(reds);
      return "La red fue creada correctamente";
  }
   @DeleteMapping ("/borrar/{id}")
    public String eliminarRedes (@PathVariable int id) {
        redServ.borrarRedes(id);
        return "La red fue borrada correctamente";
     }
    //otra forma de editar persona
    @PutMapping("/editar")
    public void updateRedes(@RequestBody Red reds) {
        redServ.editarRedes(reds);
    }
}
