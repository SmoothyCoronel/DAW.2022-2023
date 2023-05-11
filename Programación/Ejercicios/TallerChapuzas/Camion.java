/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.tallerchapuzas;

/**
 *
 * @author mint
 */
public class Camion extends VehiculoIndustrial {
      
    public Camion(float costeFijo, String cliente, String dniCliente, String modelo, String matricula, String fechaEntrada, int horaEntrada, float cobro){
        super(costeFijo, cliente, dniCliente, modelo, matricula, fechaEntrada, horaEntrada, cobro);
        costeFijo = 50.0f;
    }
    
    /*
    @Override
    public float getPrecioHora(){
        return 40.0f;
    }
    
    @Override
    public float getCobroTrabajo(TrabajoTaller tt) {
        return costeFijo + tt.getHorasRealizadas()*getPrecioHora();
    }
    */
}
