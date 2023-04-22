
package com.miportfolio.proyecto.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Entity
//@Table(name= "Persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nombre;
    private String apellido;
    
    @Lob
    @Column(name = "acerca", length=1000)
    private String acerca;
    private String tituloAcerca;
    
    private String imagenPerfil;
    private String tituloPerfil;
    private String imagenFondo;
    private String imagenLogoAP;
    private String imagenTitulo;
    
    //@NotBlank
    private String clave;

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Lob
    private String email;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String acerca, String tituloAcerca, String imagenPerfil, String tituloPerfil,String imagenFondo,String imagenLogoAP,String imagenTitulo, String clave, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.imagenPerfil = imagenPerfil;
        this.tituloPerfil = tituloPerfil;
        this.acerca = acerca;
        this.tituloAcerca= tituloAcerca;
        this.imagenFondo = imagenFondo;
        this.imagenLogoAP = imagenLogoAP;
        this.imagenTitulo = imagenTitulo;
        this.clave = clave;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getAcerca() {
        return acerca;
    }

    public void setAcerca(String acerca) {
        this.acerca = acerca;
    }
    public String getTituloAcerca() {
        return tituloAcerca;
    }

    public void setTituloAcerca(String tituloAcerca) {
        this.tituloAcerca = tituloAcerca;
    }

    public String getImagenPerfil() {
        return imagenPerfil;
    }

    public void setImagenPerfil(String imagenPerfil) {
        this.imagenPerfil = imagenPerfil;
    }

    public String getTituloPerfil() {
        return tituloPerfil;
    }

    public void setTituloPerfil(String tituloPerfil) {
        this.tituloPerfil = tituloPerfil;
    }
      public String getImagenFondo() {
        return imagenFondo;
    }

    public void setImagenFondo(String imagenFondo) {
        this.imagenFondo = imagenFondo;
    }
      public String getImagenLogoAP() {
        return imagenLogoAP;
    }

    public void setImagenLogoAP(String imagenLogoAP) {
        this.imagenLogoAP = imagenLogoAP;
    }
      public String getImagenTitulo() {
        return imagenTitulo;
    }

    public void setImagenTitulo(String imagenTitulo) {
        this.imagenTitulo = imagenTitulo;
    }
            
}
