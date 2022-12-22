
package com.transporte.modelo;

/**
 *
 * @author Abel Díaz
 */
public class Usuario {
    
    private int idAcceso;
    private String nombre;
    private String contraseña;

    public Usuario() {
    }

    public Usuario(int idAcceso, String nombre, String contraseña) {
        this.idAcceso = idAcceso;
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public int getIdAcceso() {
        return idAcceso;
    }

    public void setIdAcceso(int idAcceso) {
        this.idAcceso = idAcceso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
        
}
