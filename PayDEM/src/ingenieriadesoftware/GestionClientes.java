package ingenieriadesoftware;


import ingenieriadesoftware.UICliente;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Clase
 */
public class GestionClientes {
    private ArrayList<UICliente> listaClientes;
    private int beneficios;

    public GestionClientes() {
        listaClientes = new ArrayList<UICliente>();
    }
    public boolean anadirCliente(){
        return true;
    }
    public boolean eliminarCliente(){
      return true;  
    }
    public void modificarBeneficio(int beneficio){
        beneficios = beneficio;
    }
    
    public boolean autenticarSocio(String dni){
        return true;
    }
    public boolean autenticarSocio(int dni){
        return true;
    }
    
    
    
    
    
    
    
}
