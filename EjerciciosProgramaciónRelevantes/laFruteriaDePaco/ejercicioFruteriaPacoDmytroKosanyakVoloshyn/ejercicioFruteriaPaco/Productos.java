package ejercicioFruteriaPaco;

import java.io.Serializable;

class Productos implements Serializable {
    private String nombre;
    private int precio;
    private int cantidad;
    private int codigoProducto;

    public Productos(String nombre, int precio, int cantidad, int codigoProducto) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.codigoProducto = codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }
}
