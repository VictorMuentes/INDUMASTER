/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesPOCO;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Isaac
 */
public class calcular {
    public double obtenerIva(double costo)
    { 
        
        double iva=costo*0.12;
        BigDecimal ivaRedondeado=new BigDecimal(iva);
        ivaRedondeado=ivaRedondeado.setScale(2 , RoundingMode.HALF_UP);
        iva=ivaRedondeado.doubleValue();
        return iva;
   }
    public double  ObtenerPrecio(double costo, double iva)
    {
        
        double precio=costo+iva;
        
        return precio;
    }
}
