/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CapaGetion;

import CapaDatos.Conexion;

import ClasesPOCO.Empleado;
import static Interfaces.menu.jDPEscritorio;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Interfaces.menuEmpleado;
import Interfaces.menuAdmin;
import Interfaces.loginMenu;
import javax.swing.JOptionPane;

/**
 *
 * @author V1C70R MU3N735
 */
public class GestionEmpleado implements IGestiones{

    public GestionEmpleado() {
         try {
            Conexion.GetInstancia().Enlace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestionCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
     private Empleado empleado=new Empleado(0, null, null, null, null, null, null, null, null, null, null,null,null);
    public Empleado getEmpleado()
    {
    return empleado;
    }
    public void setEmpleado(Empleado empleado)
    {
    this.empleado=empleado;
    }

    @Override
    public void Grabar() throws SQLException {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    try{
    Conexion.GetInstancia().Conectar();
    Conexion.GetInstancia().Ejecutar("insert into empleado(cedula,nombres,apellidos,direccion,telefono,correo,sexo,cargo,fechaIngreso,fechaNacimiento,usuario,pass) values ('"+this.empleado.getCedula()+"','"+this.empleado.getNombres()+"','"+this.empleado.getApellidos()+"','"+this.empleado.getDireccion()+"','"+this.empleado.getTelefono()+"','"+this.empleado.getCorreo()+"','"+this.empleado.getSexo()+"','"+this.empleado.getCargo()+"','"+this.empleado.getFechaIngreso()+"','"+this.empleado.getFechaNacimiento()+"','"+this.empleado.getUsuario()+"','"+this.empleado.getPass()+"')");
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
     try{
    Conexion.GetInstancia().Conectar();
    Conexion.GetInstancia().Ejecutar("update empleado SET nombres='"+this.empleado.getNombres()+"',apellidos='"+this.empleado.getApellidos()+"', direccion = '"+this.empleado.getDireccion()+"',telefono='"+this.empleado.getTelefono()+"',correo='"+this.empleado.getCorreo()+"', sexo = '"+this.empleado.getSexo()+"',cargo='"+this.empleado.getCargo()+"',fechaIngreso='"+this.empleado.getFechaIngreso()+"',fechaNacimiento='"+this.empleado.getFechaNacimiento()+"' , usuario='"+this.empleado.getUsuario()+"' , pass= '"+this.empleado.getPass()+"' WHERE cedula = "+this.empleado.getCedula());
    Conexion.GetInstancia().Desconectar();
    }
    catch(SQLException e)
    {
    throw e;
    }
    }

    @Override
    public void Nuevo() throws SQLException {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    this.empleado.setCedula("");
    this.empleado.setNombres("");
    this.empleado.setApellidos("");
    this.empleado.setDireccion("");
    this.empleado.setTelefono("");
    this.empleado.setCorreo("");
    this.empleado.setSexo("");
    this.empleado.setCargo("");
    this.empleado.setFechaIngreso("");
    this.empleado.setFechaNacimiento("");
    this.empleado.setUsuario("");
    this.empleado.setPass("");
    }

    @Override
    public void Eliminar() throws SQLException {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     try{
    Conexion.GetInstancia().Conectar();
    Conexion.GetInstancia().Ejecutar("delete FROM empleado WHERE cedula = "+empleado.getCedula());
    Conexion.GetInstancia().Desconectar();

    }
    catch(SQLException e)
    {
    throw e;
    }
    }

    @Override
    public void Consultar() throws SQLException {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    try{
    Conexion.GetInstancia().Conectar();
        ResultSet consulta=Conexion.GetInstancia().EjectConsulta("select * FROM empleado WHERE Cedula = "+empleado.getCedula());
   while(consulta.next())
   {
    this.empleado.setCedula(consulta.getString(2));
    this.empleado.setNombres(consulta.getString(3));
    this.empleado.setApellidos(consulta.getString(4));
    this.empleado.setDireccion(consulta.getString(5));
    this.empleado.setTelefono(consulta.getString(6));
    this.empleado.setCorreo(consulta.getString(7));
    this.empleado.setSexo(consulta.getString(8));
    this.empleado.setCargo(consulta.getString(9));
    this.empleado.setFechaIngreso(consulta.getString(10));
    this.empleado.setFechaNacimiento(consulta.getString(11));
    this.empleado.setUsuario(consulta.getString(12));
    this.empleado.setPass(consulta.getString(13));
    
   }
        Conexion.GetInstancia().Desconectar();
    }
    catch(SQLException e)
    {
    throw e;
    }
    }
    
    
    public void ConsultarEP(String user, String clave) throws SQLException {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try{
        Conexion.GetInstancia().Conectar();
            ResultSet consulta=Conexion.GetInstancia().EjectConsulta("select usuario,pass,cargo FROM empleado WHERE pass = '"+empleado.getPass()+"' and usuario='"+empleado.getUsuario()+"'");      
            if(consulta.next())
            {
                if((consulta.getString("cargo") .equals("vendedor")))
                {
                     menuEmpleado ir= new menuEmpleado();
                     jDPEscritorio.add(ir);
                     ir.show();
                }
                
            }
            Conexion.GetInstancia().Desconectar();
        }
        catch(SQLException e)
        {
            throw e;
        }
    }
    
    
    public void ConsultarAdmin(String user, String clave) throws SQLException {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try{
        Conexion.GetInstancia().Conectar();
            ResultSet consulta=Conexion.GetInstancia().EjectConsulta("select usuario,pass,cargo FROM empleado WHERE pass = '"+empleado.getPass()+"' and usuario='"+empleado.getUsuario()+"'");      
            if(consulta.next())
            {
                if((consulta.getString("cargo").equals("administrador")))
                {
                      menuAdmin ir= new menuAdmin();
                        jDPEscritorio.add(ir);
                        ir.show();
                }
            }
            Conexion.GetInstancia().Desconectar();
        }
        catch(SQLException e)
        {
            throw e;
        }
    }
    
    
    }
    

