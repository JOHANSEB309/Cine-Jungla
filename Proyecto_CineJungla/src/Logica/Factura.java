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
public class Factura {
   private Snack[] productos;
   private Boleta[] boletos;
   private int total;
   private boolean pago;

    public Snack[] getProductos() {
        return productos;
    }

    public void setProductos(Snack[] productos) {
        this.productos = productos;
    }

    public Boleta[] getBoletos() {
        return boletos;
    }

    public void setBoletos(Boleta[] boletos) {
        this.boletos = boletos;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
    
    public void calcpago(){
//        
    }
}
