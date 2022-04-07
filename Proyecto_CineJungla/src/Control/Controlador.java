/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Logica.*;
import Vista.frmAdmFunciones;
import Vista.frmAdmin;
import Vista.frmBienvenida;
import Vista.frmCaliPelicula;
import Vista.frmCliente;
import Vista.frmFinal;
import Vista.frmLogIn;
import Vista.frmLogInCliente;
import Vista.frmRegistroEmp;
import Vista.frmSillas;
import Vista.frmSnacks;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Controlador {


    private Usuario per;
    private Empleado em;
    private Database db;
    private Pelicula[] cartelera;
    private int[] ids;
    private int[] ids2;
    private Multiplex franquicia;
    private Funcion actual;
    private ArrayList<Boleta> boletas;
    private int redimis;
    private Resena reseña;
    private Factura venta;
    
    public Controlador(){
        db=Database.getInstance();
        cartelera=new Pelicula[5];
        boletas=new ArrayList<Boleta>();
    }

   


    public Usuario getPer(){
        return this.per;
    }
    
    public void setPer(Usuario p){
        this.per=p;
    }
    
    public Empleado getEm(){
        return this.em;
    }
    
    public void newPeli(){
        frmCliente peli=new frmCliente(this);
    }
    
    public void initSesion(){
        frmLogInCliente Sesion=new frmLogInCliente(this);
    }
    
    public void calPeli(){
        frmCaliPelicula cali=new frmCaliPelicula(this);
    }
    
    public void adminLog(){
        frmLogIn log= new frmLogIn(this);
    }
    
    public void admin(String o){
        frmAdmin admin=new frmAdmin(this,o);
    }
    
    public void snacks(){
        frmSnacks snack=new frmSnacks(this);
    }
    
    public void addFun(){
        frmAdmFunciones funs=new frmAdmFunciones(this);
    }
    
    public void selectSilla(){
        frmSillas sillas=new frmSillas(this);
    }
    
    public void resEmpl(){
        frmRegistroEmp emp=new frmRegistroEmp(this);
    }
    
    public void setFinal(){
        frmFinal fnal=new frmFinal(this);
    }
    public void registro(){
        frmRegistroEmp res=new frmRegistroEmp(this);
    }
    
    public boolean getUsuario(String u,char[] p){
        ResultSet rs=db.getUsuario(u,String.copyValueOf(p));
        
        try {
            rs.next();
            this.per= new Usuario(u,String.copyValueOf(p));
            this.per.setCorreo(rs.getString("correo"));
            this.per.setPuntos(rs.getInt("puntos"));
            this.per.setDoc(rs.getInt("doc"));
            this.per.setId(rs.getInt("idCliente"));
            return true;
            
        } catch (SQLException ex) {
            System.out.println("se ha presentado un error en la base de datos: "
            +ex);
        return false;
        }
    }
    
    public boolean getUsuario(int code){
        ResultSet rs=db.buscarUsuario(code);
        try {
            rs.next();
            this.per= new Usuario(rs.getString("nombre"),"");
            this.per.setCorreo(rs.getString("correo"));
            this.per.setPuntos(rs.getInt("puntos"));
            this.per.setDoc(rs.getInt("doc"));
            this.per.setId(rs.getInt("idCliente"));
            return true;
            
        } catch (SQLException ex) {
            System.out.println("se ha presentado un error en la base de datos: "
            +ex);
        return false;
        }
    }
    
    public boolean getAdmin(String u,char[]p){
        ResultSet rs=db.getAdmin(u,String.copyValueOf(p));
                try {
            rs.next();
            this.em= new Empleado(u,String.copyValueOf(p));
            this.em.setTelefono(rs.getInt("telefono"));
            this.em.setCargo(rs.getString("rol"));
            this.em.setCedula(rs.getInt("cedula"));
            this.em.setFecha_con(rs.getDate("fechainicio"));
            this.em.setSalario(rs.getInt("salario"));
            this.em.setCod(rs.getInt("idEmpleado"));
            this.franquicia=new Multiplex();
            this.franquicia.setId(rs.getInt("multiplex_idmultiplex"));
            this.franquicia.setNombre(rs.getString("lugar"));
            this.em.setFranquicia(franquicia);
            return true;
            
        } catch (SQLException ex) {
            System.out.println("se ha presentado un error en la base de datos: "
            +ex);
        return false;
        }
    }
    public void getpeliculas(){
        ResultSet rs=db.getMovies();
        int x=0;
        
        try{
            while(rs.next()){
                this.cartelera[x]=new Pelicula();
                this.cartelera[x].setNom(rs.getString("nombre"));
                this.cartelera[x].setAnio(rs.getInt("año"));
                this.cartelera[x].setDur(rs.getInt("duracion"));
                this.cartelera[x].setGenero(rs.getString("genero"));
                this.cartelera[x].setSinop(rs.getString("sinopsis"));
                this.cartelera[x].setId(rs.getInt("idPelicula"));
                x=x+1;
             }
            
        } catch (SQLException ex) {
            System.out.println("se ha presentado un error en la base de datos: "
            +ex);
        }
    }
    
    public String[] getFunciones(int id,String multi){
        ResultSet rs=db.getFunciones(id, multi);
        ResultSet rs1=db.getFunciones(id, multi);
        int x=0;

        String[] funcion=null;
        
        try{
            while(rs1.next()){
                x=x+1;
            }
            funcion=new String[x+1];
            this.ids=new int[x];
            funcion[0]="-- --";
            x=1;
            while(rs.next()){
                funcion[x]=rs.getString(2);
                this.ids[x-1]=rs.getInt(1);
                x=x+1;
            }
        }catch(SQLException ex){
            System.out.println("se ha presentado un error en la base de datos: "
            +ex);
        }
        return funcion;
    }
    
    public String[] getSalas(){
        ResultSet rs=db.getSalas(this.franquicia.getId());
        ResultSet rs1=db.getSalas(this.franquicia.getId());
        int x=0;

        String[] salas=null;
        
        try{
            while(rs1.next()){
                x=x+1;
            }
            salas=new String[x+1];
            this.ids2=new int[x];
            salas[0]="-- --";
            x=1;
            while(rs.next()){
                salas[x]=rs.getString(2);
                this.ids2[x-1]=rs.getInt(1);
                x=x+1;
            }
        }catch(SQLException ex){
            System.out.println("se ha presentado un error en la base de datos: "
            +ex);
        }
        return salas;
    }
    
    public void addFuncion(Date d,int id1,int peli){
        Funcion n=new Funcion();
        n.setFecha(d);
        n.setFranquicia(this.franquicia);
        n.setNumero_sala(this.ids2[id1-1]);
        n.setPelicula(this.cartelera[peli]);
        db.addFuncion(n);
        
    }
    
    public void setFuncion(int id,int idpeli){
        System.out.println(this.ids[id-1]+"id de la pelicula "+this.cartelera[idpeli].getNombre());
        ResultSet rs=this.db.getfuncion(this.ids[id-1]);
        ResultSet rs1=this.db.getsillas(this.ids[id-1]);
        Boleta[][] bs=new Boleta[6][10];
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        int x=0;
        int y=0;
        String filas="ABCDEF";
        
        try{
            rs.next();
            this.actual=new Funcion();
            this.actual.setPelicula(this.cartelera[idpeli-1]);
            this.actual.setCodigo(rs.getInt("idfuncion"));
            this.actual.setFecha(format.parse(rs.getString("fecha")));
            this.actual.setNumero_sala(rs.getInt("sala.idsala"));
            this.actual.setNum(rs.getInt("numero"));
            this.franquicia=new Multiplex();
            this.franquicia.setId(rs.getInt("idmultiplex"));
            this.franquicia.setNombre(rs.getString("lugar"));
            this.actual.setFranquicia(franquicia);
            while(rs1.next()){
                bs[y][x]=new Boleta();
                bs[y][x].setCod_funcion(this.actual.getCodigo());
                bs[y][x].setFila(filas.indexOf(rs1.getString("asiento_fila")));
                bs[y][x].setNumero(rs1.getInt("asiento_num"));
                bs[y][x].setPrecio(rs1.getInt("precio"));
                bs[y][x].setId(rs1.getInt(1));
                if(rs1.getString("tipo").equals("preferencial")){
                    bs[y][x].setPreferencial(false);
                }else{
                    bs[y][x].setPreferencial(true);
                }
                if(rs1.getString("ticket")==null){
                    bs[y][x].setDisponible(true);
                }else{
                    bs[y][x].setDisponible(false);
                }
                System.out.println(bs[y][x].getFila()+" - "+bs[y][x].getNumero());
                if(x==9){
                    x=0;
                    y=y+1;
                }else{
                    x=x+1;
                }
            }
            this.actual.setAsientos(bs);
        }catch(SQLException ex){
            System.out.println("ha ocurrido un error"+ ex);
        } catch (ParseException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addSilla(int y,int x){
        boletas.add(this.actual.getSilla(y,x));
    }
    
    public String getBoletos(){
        String mensaje="";
        String filas="ABCDEF";
        int total=0;
        Boleta b;
        for(int i=0;i<this.boletas.size();i++){
            b=this.boletas.get(i);
        mensaje+="boleta para la silla "+filas.charAt(b.getFila())+" - "
                +b.getNumero()+" =  "+b.getPrecio()+"\n";
        total=total+b.getPrecio();
        }
        mensaje=mensaje+"\nBoletas para la pelicula "+this.actual.getPeliNombre()
                +" a las "+this.actual.getFecha()+" en la sala "
                +this.actual.getNum();
        mensaje=mensaje+"\nel total a pagar en el multiplex es de : "+total;
        this.venta=new Factura();
        this.venta.setTotal(total);
        return mensaje;
    }
    
    public void calif(int nota){
        this.reseña=new Resena();
        this.reseña.setCalificacion(nota);
        this.reseña.setEvaluacion(this.franquicia.getId());
        db.addCalif(this.reseña);
        
    }
    
    public void comprarBoletos(){
        Boleta[] bs=new Boleta[this.boletas.size()];
        for(int i=0;i<bs.length;i++){
            bs[i]=this.boletas.get(i);
        }
        this.venta.setBoletos(bs);
        String x;
        if(this.em==null){
            x="pago Virtual";
        }else{
            x="pago en el multiplex";
        }
        if(this.per!=null){
        db.setPagos(this.venta,this.per.getId(),x);
        }else{
            db.setPagos(this.venta,2,x);
        }
    }
    
    public void redimir(int x){
        this.redimis=x;
        
    }
    
    public String getPeliNombre(int x){
        return this.cartelera[x].getNombre();
    }
    
    public int getPeliAnio(int x){
        return this.cartelera[x].getAnio();
    }
    
    public String getPeliSinop(int x){
        return this.cartelera[x].getSinop();
    }
    
    public String getPeliGenero(int x){
        return this.cartelera[x].getGenero();
    }
    
    public int getPeliDur(int x){
        return this.cartelera[x].getdur();
    }
    
    public String getNombre(){
        return this.per.getNombre();
    }
    
    public String getCargo(){
        return this.em.getCargo();
    }
    
    public int getPuntos(){
        return this.per.getPuntos();
    }
    
    public String getAdNombre(){
        return this.em.getNombre();
    }
    
    public int getCedula(){
        return this.em.getCedula();
    }
    
    public int getSalario(){
        return this.em.getSalario();
    }
    
    public int getTel(){
        return this.em.getTelefono();
    }
    
    public int getCodAdmin(){
        return this.em.getCod();
    }
    
    public String getFecha(){
        return this.em.getFecha_con().toString();
    }
    
    public String getMulti(){
        return this.em.getMulti();
    }
    
    public int getIdMult(){
        return this.franquicia.getId();
    }
    
    public void setEmpleado(Empleado n){
        this.em=n;
    }
    
    public boolean getEstado(int y,int x){
        return this.actual.getEstado(y,x);
    }
    

    
    public static void main(String []args){
        Controlador c=new Controlador();
        frmBienvenida bn=new frmBienvenida(c);
        
    }
}
