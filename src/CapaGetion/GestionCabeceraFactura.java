/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CapaGetion;

import CapaDatos.Conexion;
import ClasesPOCO.Cliente;
import ClasesPOCO.Factura;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ClasesPOCO.Producto;

/**
 *
 * @author V1C70R MU3N735
 */
public class GestionCabeceraFactura implements IGestiones{

    public GestionCabeceraFactura() {
        try {
            Conexion.GetInstancia().Enlace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestionCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private Factura fact;

    /**
     * Get the value of fact
     *
     * @return the value of fact
     */
    public Factura getFact() {
        return fact;
    }

    /**
     * Set the value of fact
     *
     * @param fact new value of fact
     */
    public void setFact(Factura fact) {
        this.fact = fact;
    }

    private Cliente client;

    /**
     * Get the value of client
     *
     * @return the value of client
     */
    public Cliente getClient() {
        return client;
    }

    /**
     * Set the value of client
     *
     * @param client new value of client
     */
    public void setClient(Cliente client) {
        this.client = client;
    }
    
        private Producto prod;

    /**
     * Get the value of prod
     *
     * @return the value of prod
     */
    public Producto getProd() {
        return prod;
    }

    /**
     * Set the value of prod
     *
     * @param prod new value of prod
     */
    public void setProd(Producto prod) {
        this.prod = prod;
    }

    
    
    @Override
    public void Grabar() throws SQLException {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    try{
    Conexion.GetInstancia().Conectar();
    Conexion.GetInstancia().Ejecutar("insert into cliente(cedula,nombres,direccion) values ('"+this.client.getCedula()+"','"+this.client.getNombres()+"','"+this.client.getDireccion()+"')");
     Conexion.GetInstancia().Ejecutar("insert into factura(codigo,fechaFactura) values ('"+this.fact.getCodigo()+"','"+this.fact.getFechaFactura()+"')");
    
    Conexion.GetInstancia().Desconectar();
    }
    catch(SQLException e)
    {
    throw e;
    }
    
    }

    @Override
    public void Modificar() throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Nuevo() throws SQLException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Eliminar() throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Consultar() throws SQLException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    try{
    Conexion.GetInstancia().Conectar();
        ResultSet consulta=Conexion.GetInstancia().EjectConsulta("select cedula,nombres,direccion FROM cliente WHERE Cedula = "+client.getCedula());
   while(consulta.next())
   {
    this.client.setCedula(consulta.getString(2));
    this.client.setNombres(consulta.getString(3));
    this.client.setDireccion(consulta.getString(5));
    
   }
        Conexion.GetInstancia().Desconectar();
    }
    catch(SQLException e)
    {
    throw e;
    }
    }    
        
}
