/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesPOCO;

/**
 *
 * @authores: Muentes Sabando Victor; Delgado Mero Jaime; Indacochea Maria Belen; Bravo Toala Luis.
 */
public class ProductoBodega {

    public ProductoBodega(bodega bodegas, Producto productosBod, int cantidad) {
        this.bodegas = bodegas;
        this.productosBod = productosBod;
        this.cantidad = cantidad;
    }

    public ProductoBodega() {
    }

    

    private bodega bodegas;

    /**
     * Get the value of bodegas
     *
     * @return the value of bodegas
     */
    public bodega getBodegas() {
        return bodegas;
    }

    /**
     * Set the value of bodegas
     *
     * @param bodegas new value of bodegas
     */
    public void setBodegas(bodega bodegas) {
        this.bodegas = bodegas;
    }

    private Producto productosBod;

    /**
     * Get the value of productosBod
     *
     * @return the value of productosBod
     */
    public Producto getProductosBod() {
        return productosBod;
    }

    /**
     * Set the value of productosBod
     *
     * @param productosBod new value of productosBod
     */
    public void setProductosBod(Producto productosBod) {
        this.productosBod = productosBod;
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

}
