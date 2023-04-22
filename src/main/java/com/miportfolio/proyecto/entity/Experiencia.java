
package com.miportfolio.proyecto.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
//import jakarta.persistence.ManyToOne;
//import org.hibernate.annotations.OnDelete;
//import org.hibernate.annotations.OnDeleteAction;

@Entity
public class Experiencia {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
   @Lob
   @Column(name = "descripcion", length=1000)
   private String descripcion;

   
   //relacion
   //@ManyToOne
   //creacion de columna con llave foranea
   //@JoinColumn(name = "personaid", insertable=false, updatable=false)
   //para que se borre si se borra la persona
   //@OnDelete(action = OnDeleteAction.CASCADE)
   //private Persona persona;
   //private Long personaid;
   
    public Experiencia() {
    }

    public Experiencia(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   
}
