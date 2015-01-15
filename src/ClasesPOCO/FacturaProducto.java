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
public class FacturaProducto {

    public FacturaProducto(Producto productos, double precio, double iva, int cantidad) {
        this.productos = productos;
        this.precio = precio;
        this.iva = iva;
        this.cantidad = cantidad;
    }

    public FacturaProducto() {
    }
   
    private Producto productos;

    /**
     * Get the value of productos
     *
     * @return the value of productos
     */
    public Producto getProductos() {
        return productos;
    }

    /**
     * Set the value of productos
     *
     * @param productos new value of productos
     */
    public void setProductos(Producto productos) {
        this.productos = productos;
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
        this.precio = precio;
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
        this.iva = iva;
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
        
         try{
             if (cantidad>0) this.cantidad = cantidad;                      
        }
          catch (Exception ex)
          {
         System.out.println(ex); 
    }
    
    finally
    {
       System.out.println("Bloque Finally");
      
    }
    }

    
}
