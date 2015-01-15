/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesPOCO;

import java.util.List;

/**
 *
 * @author Isaac
 */
public class Producto {

    public Producto(String descripcion, String nombre, int id, double costo, double iva, String numSerie, double precio, double precioEspecial, int cantidad) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.id = id;
        this.costo = costo;
        this.iva = iva;
        this.numSerie = numSerie;
        this.precio = precio;
        this.precioEspecial = precioEspecial;
        this.cantidad=cantidad;
    }

    private int cantidad;

        private String descripcion;

    /**
     * Get the value of descripcion
     *
     * @return the value of descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Set the value of descripcion
     *
     * @param descripcion new value of descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
        private String nombre;

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    private int id;

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        this.id = id;
    }

    private double costo;

    /**
     * Get the value of costo
     *
     * @return the value of costo
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Set the value of costo
     *
     * @param costo new value of costo
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    private double iva;

    /**
     * Get the value of iva
     *
     * @return the value of iva
     */
    public double getIva() {
        
        return iva;
    }

    /**
     * Set the value of iva
     *
     * @param iva new value of iva
     */
    public void setIva(double iva) {
       //iva=costo*0.12;
        this.iva = iva;
    }

    private String numSerie;

    /**
     * Get the value of numSerie
     *
     * @return the value of numSerie
     */
    public String getNumSerie() {
        return numSerie;
    }

    /**
     * Set the value of numSerie
     *
     * @param numSerie new value of numSerie
     */
    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }
    
        private double precio;

    /**
     * Get the value of precio
     *
     * @return the value of precio
     */
    public double getPrecio() {
       
        return precio;
    }

    /**
     * Set the value of precio
     *
     * @param precio new value of precio
     */
    public void setPrecio(double precio) {
        //precio=costo+iva;
        this.precio = precio;
    }

    private double precioEspecial;

    /**
     * Get the value of precioEspecial
     *
     * @return the value of precioEspecial
     */
    public double getPrecioEspecial() {
        return precioEspecial;
    }

    /**
     * Set the value of precioEspecial
     *
     * @param precioEspecial new value of precioEspecial
     */
    public void setPrecioEspecial(double precioEspecial) {
        this.precioEspecial = precioEspecial;
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

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
