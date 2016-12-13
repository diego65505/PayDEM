/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingenieriadesoftware;

import java.io.File;

/**
 *
 * @author Clase
 */
public class Reporte {
    private File fichero;
    private double total;
    
    public Reporte(){
        
    }
    public void anadirTotal(double suma){
        total+=suma;
    }
    public void anadirPagoAFichero(Pago p){
        
    }
}
