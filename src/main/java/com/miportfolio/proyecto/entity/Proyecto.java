package com.miportfolio.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;

@Entity
public class Proyecto {
       @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
    private String titulo;
    @Temporal(TemporalType.DATE)
    private Date inicio;
     @Temporal(TemporalType.DATE)
    private Date fin;
    private String logoProyecto;
    private String descripcion;

    public Proyecto() {
    }

    public Proyecto(String titulo, Date inicio, Date fin, String logoProyecto, String descripcion) {
        this.titulo = titulo;
        this.inicio = inicio;
        this.fin = fin;
        this.logoProyecto = logoProyecto;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public String getLogoProyecto() {
        return logoProyecto;
    }

    public void setLogoProyecto(String logoProyecto) {
        this.logoProyecto = logoProyecto;
    }
      public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
