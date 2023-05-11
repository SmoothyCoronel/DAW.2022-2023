/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.tallerchapuzas;

/**
 *
 * @author mint
 */
public class Furgoneta extends VehiculoIndustrial {
      
    public Furgoneta(float costeFijo, String cliente, String dniCliente, String modelo, String matricula, String fechaEntrada, int horaEntrada, float cobro){
        super(costeFijo, cliente, dniCliente, modelo, matricula, fechaEntrada, horaEntrada, cobro);
        costeFijo = 30.0f;
    }
    
    /*
    @Override
    public float getPrecioHora(){
        return 30.0f;
    }
    
    @Override
    public float getCobroTrabajo(TrabajoTaller tt) {
        return costeFijo + tt.getHorasRealizadas()*getPrecioHora();
    }
    */
}
