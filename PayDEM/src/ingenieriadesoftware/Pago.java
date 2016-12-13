/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingenieriadesoftware;

/**
 *
 * @author Clase
 */
public class Pago {
    private double precioCompra;
    private int id;

    public Pago(double precioCompra, int id) {
        this.precioCompra = precioCompra;
        this.id = id;
    }
    
    public double getPrecioCompra() {
        return precioCompra;
    }
    
    public int getId() {
        return id;
    }

   
    
}
