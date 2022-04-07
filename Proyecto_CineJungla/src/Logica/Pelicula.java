/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Date;

/**
 *
 * @author FELIPE
 */
public class Pelicula {
    private String nombre;
    private int anio;
    private String sinopsis;
    private int duracion;
    private String genero;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Pelicula(){
        
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getAnio(){
        return this.anio;        
    }
    
    public String getSinop(){
        return this.sinopsis;
    }
    
    public int getdur(){
        return this.duracion;
    }
    
    public String getGenero(){
        return this.genero;
    }
    
    public void setNom(String nom){
        this.nombre=nom;
    }
    
    public void setAnio(int a){
        this.anio=a;
    }
    
    public void setSinop(String s){
        this.sinopsis=s;
    }
    
    public void setDur(int d){
        this.duracion=d;
    }
    
    public void setGenero(String g){
        this.genero=g;
    }
    
}
