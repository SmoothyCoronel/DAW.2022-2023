/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.tallerchapuzas;

/**
 *
 * @author mint
 */

public class TrabajoTaller {
    private String descripcionProblema;
    private String solucionPrevista;
    private int horasRealizadas;
    private int horasPrevistas;
    private boolean cobrado;
  
    
    public TrabajoTaller(String descripcionProblema, String solucionPrevista, int horasRealizadas, int horasPrevistas, boolean cobrado){
        this.descripcionProblema = descripcionProblema;
        this.solucionPrevista = solucionPrevista;
        this.horasRealizadas = horasRealizadas;
        this.horasPrevistas = horasPrevistas;
        this.cobrado = false;
        
    }
    
    public String getDescripcionProblema(){
        return descripcionProblema;
    }
    public void setDescripcionProblema(String descripcionProblema){
        this.descripcionProblema = descripcionProblema;
    }
            
    public String getSolucionPrevia(){
        return solucionPrevista;
    }
    public void setSolucionPrevia(String solucionPrevista){
        this.solucionPrevista = solucionPrevista;
    }
    
    public int getHorasRealizadas(){
        return horasRealizadas;
    }
    public void setHorasRealizadas(int horasRealizadas){
        this.horasRealizadas = horasRealizadas;
    }
    
    public int getHorasPrevistas(){
        return horasPrevistas;
    }
    public void setHorasPrevistas(int horasPrevistas){
        this.horasPrevistas = horasPrevistas;
    }
    
    public void addHorasRealizadas(int horasRealizadas){
            this.horasRealizadas += horasRealizadas;
    }
    public boolean isCobrado(){
        return cobrado;
    }
    public void asignarCobrado(){
        this.cobrado = true;
    }
    
    
    public float Problema(int horasRealizadas, String modelo, float costeFijo, float cobro){
       /* 
        Motos: 20€/hora
        . Coches: 25€/hora
        · Furgones:30€/hora + un fijo de dificultad de 30€
        · Camiones: 40€/hora + un fijo de dificultad de 50€
       */
       float problema = horasRealizadas * cobro + costeFijo;
       return problema;
    }
   
    
}
