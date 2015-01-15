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
public class bodega {

    public bodega(String fechaSalida, String fechaIngreso, String area, int idBodega,String Descripcion) {
        this.fechaSalida = fechaSalida;
        this.fechaIngreso = fechaIngreso;
        this.area = area;
        this.idBodega = idBodega;
        this.Descripcion=Descripcion;
    }

   
        private List<Producto> idProducto;

    /**
     * Get the value of idProducto
     *
     * @return the value of idProducto
     */
    public List<Producto> getIdProducto() {
        return idProducto;
    }

    /**
     * Set the value of idProducto
     *
     * @param idProducto new value of idProducto
     */
    public void setIdProducto(List<Producto> idProducto) {
        this.idProducto = idProducto;
    }

    private Empleado idEmpleado;

    /**
     * Get the value of idEmpleado
     *
     * @return the value of idEmpleado
     */
    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * Set the value of idEmpleado
     *
     * @param idEmpleado new value of idEmpleado
     */
    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    
    private String fechaSalida;

    /**
     * Get the value of fechaSalida
     *
     * @return the value of fechaSalida
     */
    public String getFechaSalida() {
        return fechaSalida;
    }

    /**
     * Set the value of fechaSalida
     *
     * @param fechaSalida new value of fechaSalida
     */
    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
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

    private String area;

    /**
     * Get the value of area
     *
     * @return the value of area
     */
    public String getArea() {
        return area;
    }

    /**
     * Set the value of area
     *
     * @param area new value of area
     */
    public void setArea(String area) {
        this.area = area;
    }

    
    private int idBodega;

    /**
     * Get the value of idBodega
     *
     * @return the value of idBodega
     */
    public int getIdBodega() {
        return idBodega;
    }

    /**
     * Set the value of idBodega
     *
     * @param idBodega new value of idBodega
     */
    public void setIdBodega(int idBodega) {
        this.idBodega = idBodega;
    }
    
    private String Descripcion;

    /**
     * Get the value of Descripcion
     *
     * @return the value of Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * Set the value of Descripcion
     *
     * @param Descripcion new value of Descripcion
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    private Empleado nombreEmpleado;

    /**
     * Get the value of nombreEmpleado
     *
     * @return the value of nombreEmpleado
     */
    public Empleado getNombreEmpleado() {
        return nombreEmpleado;
    }

    /**
     * Set the value of nombreEmpleado
     *
     * @param nombreEmpleado new value of nombreEmpleado
     */
    public void setNombreEmpleado(Empleado nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

}
