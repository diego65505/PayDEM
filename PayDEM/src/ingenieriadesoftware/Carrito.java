/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingenieriadesoftware;

import java.util.ArrayList;

/**
 *
 * @author Clase
 */
public class Carrito {
    private ArrayList<Producto> listaProductos;
    private double total;

    public Carrito() {
        listaProductos = new ArrayList<>();
        total = 0;
    }
    
    public void anadirProducto(Producto p){
        listaProductos.add(p);
        for (int i = 0; i < listaProductos.size(); i++) {
            System.out.println(listaProductos.get(i)+"  "+listaProductos.get(i).getPrecio());
            
        }
        
    }
    public void cambiarCantidad(int id, int newCantidad){
        
    }
    public void sacarArticulo(int id){
        
    }
    public double importeTotal(){
        return total;
    }
}
