/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriestv;
import java.sql.*;
import java.io.PrintWriter;


public class datos {
    
    private int codigo;
    private String titulo;
    private String fecha;
    private String tempo;
    private String actor;
    private String sinopsis;
    private String genero;
  

    public datos(int codigo, String titulo, String fecha, String tempo,String genero, String actor, String sinopsis) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.fecha = fecha;
        this.tempo = tempo;
        this.genero = genero; 
        this.actor = actor;
        this.sinopsis = sinopsis;
      
    }

  

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    void guardar(PrintWriter escribe) {
       escribe.println(codigo);
        escribe.println(titulo);
         escribe.println(fecha);
          escribe.println(tempo);
           escribe.println(actor);
            escribe.println(sinopsis);
             escribe.println(genero);
    }

    
    
    
  
}
