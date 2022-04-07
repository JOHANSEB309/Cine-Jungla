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
public class Persona {
    protected String Nombre;
    protected String password; 
    
    public Persona(String nom,String pas){
        this.Nombre=nom;
        this.password=pas;
    }
    
    public String getNombre(){
        return this.Nombre;
    }
}
