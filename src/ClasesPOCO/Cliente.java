/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesPOCO;

import java.util.List;

/**
 *
 * @author V1C70R MU3N735
 */
public class Cliente extends Persona{

    public Cliente(String direccion, String sexo, String telefono, String correo, String apellidos, String nombres, String cedula) {
        super(direccion, sexo, telefono, correo, apellidos, nombres, cedula);
    }
    private int idCliente;
    
    private List<Factura> ListaFactura;

    /**
     * Get the value of ListaFactura
     *
     * @return the value of ListaFactura
     */
    public List<Factura> getListaFactura() {
        return ListaFactura;
    }

    /**
     * Set the value of ListaFactura
     *
     * @param ListaFactura new value of ListaFactura
     */
    public void setListaFactura(List<Factura> ListaFactura) {
        this.ListaFactura = ListaFactura;
    }

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
  

    

  
    
}
