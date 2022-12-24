/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.transporte.modelo;

public class Movimientos {
    int id;
    int idRepuesto;
    String repuesto;
    int repUtilizado;
    int idCamion;
    String matricula;
    String fecha;
    String motivo;
    

    public Movimientos() {
    }

    public Movimientos(int id, int idRepuesto, String repuesto, int repUtilizado, int idCamion, String matricula, String fecha, String motivo) {
        this.id = id;
        this.idRepuesto = idRepuesto;
        this.repuesto = repuesto;
        this.repUtilizado = repUtilizado;
        this.idCamion = idCamion;
        this.matricula = matricula;
        this.fecha = fecha;
        this.motivo = motivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdRepuesto() {
        return idRepuesto;
    }

    public void setIdRepuesto(int idRepuesto) {
        this.idRepuesto = idRepuesto;
    }

    public int getIdCamion() {
        return idCamion;
    }

    public void setIdCamion(int idCamion) {
        this.idCamion = idCamion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getRepuesto() {
        return repuesto;
    }

    public void setRepuesto(String repuesto) {
        this.repuesto = repuesto;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getRepUtilizado() {
        return repUtilizado;
    }

    public void setRepUtilizado(int repUtilizado) {
        this.repUtilizado = repUtilizado;
    }
    
    
    
    
    
}
