/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author FELIPE
 */
public class Usuario extends Persona{
    private int puntos;
    private String correo;
    private int doc;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Usuario(String u,String pas){
        super(u,pas);
    }
    
    public String getCorreo(){
        return this.correo;
    }
    
    public int getPuntos(){
        return this.puntos;
    }
    
    public int getDoc(){
        return this.doc;
    }
        
    public void setCorreo(String c){
        this.correo=c;
    }
    
    public void setPuntos(int puntos){
        this.puntos=puntos;
    }
    
    public void setDoc(int doc){
        this.doc=doc;
    }
    
    public void sumarPuntos(int puntos){
        this.puntos=this.puntos+puntos;
    }
    
}

