/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesPOCO;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author V1C70R MU3N735
 */
public class Empleado extends Persona{

    public Empleado(int idEmpleado, String fechaNacimiento, String fechaIngreso, String cargo, String usuario, String pass, String direccion, String sexo, String telefono, String correo, String apellidos, String nombres, String cedula) {
        super(direccion, sexo, telefono, correo, apellidos, nombres, cedula);
        this.idEmpleado = idEmpleado;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.cargo = cargo;
        this.usuario = usuario;
        this.pass = pass;
    }

   
    
    private bodega idBodega;

    /**
     * Get the value of idBodega
     *
     * @return the value of idBodega
     */
    public bodega getIdBodega() {
        return idBodega;
    }

    /**
     * Set the value of idBodega
     *
     * @param idBodega new value of idBodega
     */
    public void setIdBodega(bodega idBodega) {
        this.idBodega = idBodega;
    }

      private List<Factura> idFactura;

    /**
     * Get the value of idFactura
     *
     * @return the value of idFactura
     */
    public List<Factura> getIdFactura() {
        return idFactura;
    }

    /**
     * Set the value of idFactura
     *
     * @param idFactura new value of idFactura
     */
    public void setIdFactura(List<Factura> idFactura) {
        this.idFactura = idFactura;
    }

   
    private int idEmpleado;

    /**
     * Get the value of idEmpleado
     *
     * @return the value of idEmpleado
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * Set the value of idEmpleado
     *
     * @param idEmpleado new value of idEmpleado
     */
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    private String fechaNacimiento;

    /**
     * Get the value of fechaNacimiento
     *
     * @return the value of fechaNacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Set the value of fechaNacimiento
     *
     * @param fechaNacimiento new value of fechaNacimiento
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    private String fechaIngreso;

    /**
     * Get the value of fechaIngreso
     *
     * @return the value of fechaIngreso
     */
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Set the value of fechaIngreso
     *
     * @param fechaIngreso new value of fechaIngreso
     */
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    private String cargo;

    /**
     * Get the value of cargo
     *
     * @return the value of cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Set the value of cargo
     *
     * @param cargo new value of cargo
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

        private String usuario;

    /**
     * Get the value of usuario
     *
     * @return the value of usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Set the value of usuario
     *
     * @param usuario new value of usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
        private String pass;

    /**
     * Get the value of pass
     *
     * @return the value of pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * Set the value of pass
     *
     * @param pass new value of pass
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

}
