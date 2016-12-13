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
public class GestionProductos {
    private ArrayList<Producto> listaProductos;

    public GestionProductos() {
        this.listaProductos = new ArrayList<Producto>();
    }
    
    public void anadirProducto(Producto p){
        listaProductos.add(p);
    }
    
    public void eliminarProducto(int id){
        for (int i = 0;i< listaProductos.size();i++) {
            if(listaProductos.get(i).getId() == id){
                listaProductos.remove(i);
            }
        }
        //Mostrar mensaje de eliminado.
    }    
    
    public void modificarProducto(int id){
        //recopilar datos de la base de datos
        
        
        //Mostrar datos del producto para poder modificarlos
        
        
        //Cambiarlos datos del producto
     
        
    } 
    
    public void modificarPrecio(int id, double precio){
        
    } 
    
    public Producto getArticulo(int id, double precio){
        return new Producto(2,"d",2);
    } 
    public boolean compruebaID(int id){
        return true;
    }
    
}
