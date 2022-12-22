
package com.transporte.modelo;

/**
 *
 * @author Abel Díaz
 */
public class Camion {
    int id;
    String matricula;
    String color;

    public Camion () {
    }

    public Camion(int id, String matricula, String color) {
        this.id = id;
        this.matricula = matricula;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
