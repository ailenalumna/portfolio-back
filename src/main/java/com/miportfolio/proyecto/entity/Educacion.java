
package com.miportfolio.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Educacion {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
   
  
   private String inicio;

   private String fin;
   private String tituloCurso;
   private String imagen;
   private String descripcionCurso;

    public Educacion() {
    }

    public Educacion(String inicio, String fin, String tituloCurso, String imagen, String descripcionCurso) {
        this.inicio = inicio;
        this.fin = fin;
        this.tituloCurso = tituloCurso;
        this.imagen = imagen;
        this.descripcionCurso = descripcionCurso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getTituloCurso() {
        return tituloCurso;
    }

    public void setTituloCurso(String tituloCurso) {
        this.tituloCurso = tituloCurso;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
   public String getDescripcionCurso() {
        return descripcionCurso;
    }

    public void setDescripcionCurso(String descripcionCurso) {
        this.descripcionCurso = descripcionCurso;
    }

}
