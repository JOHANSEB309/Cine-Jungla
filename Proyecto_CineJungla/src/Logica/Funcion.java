/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author FELIPE
 */
public class Funcion {
    private Multiplex franquicia;
    private int numero_sala;
    private Pelicula pelicula;
    private Boleta[][] asientos;
    private Date fecha;
    private int codigo;
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    
    public Multiplex getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(Multiplex franquicia) {
        this.franquicia = franquicia;
    }

    public int getNumero_sala() {
        return numero_sala;
    }

    public void setNumero_sala(int numero_sala) {
        this.numero_sala = numero_sala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Boleta[][] getAsientos() {
        return asientos;
    }
    
    public boolean getEstado(int y,int x ){
        return this.asientos[y][x].isDisponible();
    }

    public void setAsientos(Boleta[][] asientos) {
        this.asientos = asientos;
    }

    public String getFecha() {
        SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd HH:mm");
        return format.format(this.fecha);
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public int getPeliId(){
        return this.pelicula.getId();
    }

    
    public Boleta getSilla(int y,int x){
        return this.asientos[y][x];
    }
    
    public String getPeliNombre(){
        return this.pelicula.getNombre();
    }
}
