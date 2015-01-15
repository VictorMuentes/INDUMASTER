/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesPOCO;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Isaac
 */
public class OrdenProduccion {

    public OrdenProduccion(String fechaPedido, String fechaEntrega, int cantidad, List<Producto> ListaProducto, int idOrdenProduccion, bodega idBodega, Empleado idEmpleado, int numeroOrdenProduccion) {
        this.fechaPedido = fechaPedido;
        this.fechaEntrega = fechaEntrega;
        this.cantidad = cantidad;
        this.ListaProducto = ListaProducto;
        this.idOrdenProduccion = idOrdenProduccion;
        this.idBodega = idBodega;
        this.idEmpleado = idEmpleado;
        this.numeroOrdenProduccion = numeroOrdenProduccion;
    }

   
    
    
    
        private String fechaPedido;

    /**
     * Get the value of fechaPedido
     *
     * @return the value of fechaPedido
     */
    public String getFechaPedido() {
        return fechaPedido;
    }

    /**
     * Set the value of fechaPedido
     *
     * @param fechaPedido new value of fechaPedido
     */
    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    private String fechaEntrega;

    /**
     * Get the value of fechaEntrega
     *
     * @return the value of fechaEntrega
     */
    public String getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * Set the value of fechaEntrega
     *
     * @param fechaEntrega new value of fechaEntrega
     */
    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    private int cantidad;

    /**
     * Get the value of cantidad
     *
     * @return the value of cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Set the value of cantidad
     *
     * @param cantidad new value of cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    private List<Producto> ListaProducto;

    /**
     * Get the value of ListaProducto
     *
     * @return the value of ListaProducto
     */
    public List<Producto> getListaProducto() {
        return ListaProducto;
    }

    /**
     * Set the value of ListaProducto
     *
     * @param ListaProducto new value of ListaProducto
     */
    public void setListaProducto(List<Producto> ListaProducto) {
        this.ListaProducto = ListaProducto;
    }


        int idOrdenProduccion;

    /**
     * Get the value of idOrdenProduccion
     *
     * @return the value of idOrdenProduccion
     */
    public int getIdOrdenProduccion() {
        return idOrdenProduccion;
    }

    /**
     * Set the value of idOrdenProduccion
     *
     * @param idOrdenProduccion new value of idOrdenProduccion
     */
    public void setIdOrdenProduccion(int idOrdenProduccion) {
        this.idOrdenProduccion = idOrdenProduccion;
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

    private int numeroOrdenProduccion;

    /**
     * Get the value of numeroOrdenProduccion
     *
     * @return the value of numeroOrdenProduccion
     */
    public int getNumeroOrdenProduccion() {
        return numeroOrdenProduccion;
    }

    /**
     * Set the value of numeroOrdenProduccion
     *
     * @param numeroOrdenProduccion new value of numeroOrdenProduccion
     */
    public void setNumeroOrdenProduccion(int numeroOrdenProduccion) {
        this.numeroOrdenProduccion = numeroOrdenProduccion;
    }


}
