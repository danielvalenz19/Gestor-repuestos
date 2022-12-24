
package com.transporte.modelo;

/**
 *
 * @author Abel Díaz
 */
public class Repuesto {
    
    private int id;
    private String cod;
    private String nombre;
    private int cantidad;
    private String descripcion;
    

    public Repuesto() {
    }
    
    


    public Repuesto(int id, String cod, String nombre, int cantidad, String descripcion) {
        this.id = id;
        this.cod = cod;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
    
    
    
}
