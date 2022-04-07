/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FELIPE
 */
public class Database {
    private static Database Instance;
    private String db;
    private Connection con;
    
    private Database(){
        this.db="cine1";
    }
    
    public static Database getInstance(){
        if(Instance==null){
            Instance=new Database();
            Instance.init();
        }
        return Instance;
    }
    
    public boolean init(){
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db,
                    "root","03072002Andres");
            System.out.println("conectado");

        }catch(Exception e){
            System.out.print("no se ha podido conectar\n"+e);
            return false;
        }
        return true;
    }
    
    public ResultSet getUsuario(String usu,String pas){
        PreparedStatement stmt;
        ResultSet rs=null;
        String comando;
        
        try {
            
            comando="select nombre,puntos,correo,doc,idCliente from cliente where nombre=? "
                    + "and contraseña=? ";
            stmt = this.con.prepareStatement(comando);
            stmt.setString(1, usu);
            stmt.setString(2, pas);
            rs=stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public ResultSet buscarUsuario(int code){
        PreparedStatement stmt;
        ResultSet rs=null;
        String comando;
        
        try {
            
            comando="select nombre,puntos,correo,doc,idCliente from cliente where doc=?";
            stmt = this.con.prepareStatement(comando);
            stmt.setInt(1,code );
            rs=stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet getAdmin(String nom,String pas){
        PreparedStatement stmt;
        ResultSet rs=null;
        String comando;
        
        try {
            
            comando="select * from empleado "
                    + "INNER JOIN multiplex on multiplex_idmultiplex=idmultiplex "
                    + "where nombreEmp=? and passwords=? ";
            stmt = this.con.prepareStatement(comando);
            stmt.setString(1, nom);
            stmt.setString(2, pas);
            rs=stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet getMovies(){
        Statement stmt;
        ResultSet rs=null;
        
        try{
            stmt=this.con.createStatement();
            rs=stmt.executeQuery("select * from pelicula;");
        }catch(SQLException ex){
            System.out.println("hubo un error en acceder las peliculas: "+ex);
        }
        
        return rs;
    }
    
    public ResultSet getFunciones(int id,String mult){
        PreparedStatement stmt;
        ResultSet rs=null;
        String comando="select idfuncion,fecha from funcion "
            + "INNER JOIN sala on funcion.sala_idsala=sala.idsala "
            + "INNER JOIN multiplex on sala.multiplex_idmultiplex=multiplex.idmultiplex "
            + "where funcion.pelicula_idpelicula = ? and multiplex.lugar = ?";
        try{
            stmt=this.con.prepareStatement(comando);
            stmt.setInt(1,id);
            stmt.setString(2, mult);
            rs=stmt.executeQuery();
        }catch(SQLException ex){
            System.out.println("ocurrio un error en la carga de datos: "+ex);
        }
        return rs;
    }
    
    public ResultSet getfuncion(int id){
        PreparedStatement stmt;
        ResultSet rs=null;
        String comando="select idfuncion,fecha,sala.idsala, idmultiplex,lugar, numero from funcion "
            + "INNER JOIN sala on funcion.sala_idsala=sala.idsala "
            + "INNER JOIN multiplex on sala.multiplex_idmultiplex=multiplex.idmultiplex "
            + "where idfuncion= ? ";
        try{
            stmt=this.con.prepareStatement(comando);
            stmt.setInt(1,id);
            rs=stmt.executeQuery();
        }catch(SQLException ex){
            System.out.println("ocurrio un error en la carga de datos: "+ex);
        }
        return rs;
    }
    
        public ResultSet getsillas(int id){
        PreparedStatement stmt;
        ResultSet rs=null;
        String comando="select asiento.idasiento , asiento.asiento_fila, asiento.asiento_num, asiento.tipo, asiento.precio, ticket from (select asiento.idasiento as id,idticket as ticket from asiento INNER JOIN ticket on asiento.idasiento=ticket.asiento_idasiento where ticket.funcion_idfuncion= ? )as t1 right Join asiento on id=asiento.idasiento";
        try{
            stmt=this.con.prepareStatement(comando);
            stmt.setInt(1,id);
            rs=stmt.executeQuery();
        }catch(SQLException ex){
            System.out.println("ocurrio un error en la carga de datos: "+ex);
        }
        return rs;
    }
        
    public ResultSet getBoleto(){
        return null;
    }
    
    public ResultSet getSalas(int m){
        PreparedStatement stmt;
        ResultSet rs=null;
        String comando="select idsala,numero from sala "
            + "where multiplex_idmultiplex= ? ";
        try{
            stmt=this.con.prepareStatement(comando);
            stmt.setInt(1,m);
            rs=stmt.executeQuery();
        }catch(SQLException ex){
            System.out.println("ocurrio un error en la carga de datos: "+ex);
        }
        return rs;
        
    }
    
    public void addFuncion(Funcion f){
         PreparedStatement stmt;
        String comando="INSERT INTO funcion(fecha,pelicula_idpelicula, "
                + "sala_idsala) values(?,?,?)";
        
        try{
            
            stmt=this.con.prepareStatement(comando);
            stmt.setString(1,f.getFecha());
            stmt.setInt(2, f.getPeliId());
            stmt.setInt(3,f.getNumero_sala());
            stmt.executeUpdate();
            
        }catch(SQLException ex){
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ocurrio un error en la carga de datos: "+ex);
        }
        
    }
    
    public void addCalif(Resena r){
        PreparedStatement stmt;
        String comando="INSERT INTO calificaciones(valoracion,"
                + "multiplex_idmultiplex ) values(?,?)";
        
        try{
            
            stmt=this.con.prepareStatement(comando);
            stmt.setInt(1,r.getCalificacion());
            stmt.setInt(2, r.getEvaluacion());
            stmt.executeUpdate();
            
        }catch(SQLException ex){
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ocurrio un error en la carga de datos: "+ex);
        }
    }
    
    public void setPagos(Factura f,int id, String p){
        PreparedStatement stmt,stmt2;
        String hoy;
        ResultSet ultimo;
        Statement stmt1;
        Boleta[] bs=f.getBoletos();
        String comando="INSERT INTO venta(medio_pago,cliente_idCliente,"
                + "fecha ) values(?,?,?)";
        String comando2="Insert INTO ticket(asiento_idasiento,funcion_idfuncion,"
                + "venta_idventa) values(?,?,?)";
        try{
            
            stmt=this.con.prepareStatement(comando,Statement.RETURN_GENERATED_KEYS);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
            hoy=dtf.format(LocalDateTime.now());
            stmt.setString(1,p);
            stmt.setInt(2, id);
            stmt.setString(3,hoy);
            stmt.executeUpdate();
            ultimo=stmt.getGeneratedKeys();
            ultimo.next();
            System.out.println(ultimo.getInt(1));
            System.out.println("id silla:"+bs[0].getId()+"funcion :"+bs[0].getCod_funcion()+" ultimo: "+ultimo.getInt(1));
            for (Boleta b : bs) {
                stmt=this.con.prepareStatement(comando2);
                stmt.setInt(1,b.getId());
                stmt.setInt(2, b.getCod_funcion());
                stmt.setInt(3,ultimo.getInt(1));
                stmt.executeUpdate();
            }
            
        }catch(SQLException ex){
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ocurrio un error en la carga de datos: "+ex);
        }
    }
}
