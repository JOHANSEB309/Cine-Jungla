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
public class Empleado extends Persona{
    private int telefono;
    private int cedula;
    private Multiplex franquicia;
    private Date fecha_con;
    private int salario;
    private String cargo;
    private int codigo;
    
    public Empleado(String nom,String pas){
        super(nom,pas);
    }

    public int getTelefono() {
        return telefono;
    }

    public int getCedula() {
        return cedula;
    }

    public Multiplex getFranquicia() {
        return franquicia;
    }

    public Date getFecha_con() {
        return fecha_con;
    }

    public int getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }
    
    public int getCod(){
        return this.codigo;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setFranquicia(Multiplex franquicia) {
        this.franquicia = franquicia;
    }

    public void setFecha_con(Date fecha_con) {
        this.fecha_con = fecha_con;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void setCod(int cod){
        this.codigo=cod;
    }
    
    public String getMulti(){
        return this.franquicia.getNombre();
    }
    
}
