/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.tallerchapuzas;

/**
 *
 * @author mint
 */
public class Coche extends Vehiculo {
      
    public Coche( String cliente, String dniCliente, String modelo, String matricula, String fechaEntrada, int horaEntrada, float cobro){
        super( cliente, dniCliente, modelo, matricula, fechaEntrada, horaEntrada, cobro);
       
    }
    
    /*
    @Override
    public float getPrecioHora(){
        return 25.0f;
    }
    
    @Override
    public float getCobroTrabajo(TrabajoTaller tt) {
        return  tt.getHorasRealizadas()*getPrecioHora();
    }
    */
}
