/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesPOCO;

/**
 *
 * @author Isaac
 */
public class OrdenCompra {

    public OrdenCompra(int numeroOrdenCompra, String nombreMateriaPrima, int cantidad, String fechaCompra, int idBodega, int stringidProveedor) {
        this.numeroOrdenCompra = numeroOrdenCompra;
        this.nombreMateriaPrima = nombreMateriaPrima;
        this.cantidad = cantidad;
        this.fechaCompra = fechaCompra;
        this.idBodega = idBodega;
        this.idProveedor = stringidProveedor;
    }
    
    
    
    private int numeroOrdenCompra;

    /**
     * Get the value of numeroOrdenCompra
     *
     * @return the value of numeroOrdenCompra
     */
    public int getNumeroOrdenCompra() {
        return numeroOrdenCompra;
    }

    /**
     * Set the value of numeroOrdenCompra
     *
     * @param numeroOrdenCompra new value of numeroOrdenCompra
     */
    public void setNumeroOrdenCompra(int numeroOrdenCompra) {
        this.numeroOrdenCompra = numeroOrdenCompra;
    }

    private String nombreMateriaPrima;

    /**
     * Get the value of nombreMateriaPrima
     *
     * @return the value of nombreMateriaPrima
     */
    public String getNombreMateriaPrima() {
        return nombreMateriaPrima;
    }

    /**
     * Set the value of nombreMateriaPrima
     *
     * @param nombreMateriaPrima new value of nombreMateriaPrima
     */
    public void setNombreMateriaPrima(String nombreMateriaPrima) {
        this.nombreMateriaPrima = nombreMateriaPrima;
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

    private String fechaCompra;

    /**
     * Get the value of fechaCompra
     *
     * @return the value of fechaCompra
     */
    public String getFechaCompra() {
        return fechaCompra;
    }

    /**
     * Set the value of fechaCompra
     *
     * @param fechaCompra new value of fechaCompra
     */
    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
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

    private int idProveedor;

    /**
     * Get the value of stringidProveedor
     *
     * @return the value of stringidProveedor
     */
    public int getIdProveedor() {
        return idProveedor;
    }

    /**
     * Set the value of stringidProveedor
     *
     * @param idProveedor new value of stringidProveedor
     */
    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

}
