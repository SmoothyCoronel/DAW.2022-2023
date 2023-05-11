/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.tallerchapuzas;

/**
 *
 * @author mint
 */
public abstract class VehiculoIndustrial extends Vehiculo{
        int numVehIndustriales = 0;
        Vehiculo listaVehIndustriales[] = new Vehiculo[numVehIndustriales];
     protected float costeFijo;

     public VehiculoIndustrial(float costeFijo, String cliente, String DniCliente, String matricula, String modelo, String fechaEntrada, int horaEntrada, float cobro) {
        super(cliente, DniCliente, matricula, modelo, fechaEntrada, horaEntrada, cobro);
       costeFijo = 0;
    }
     
     public void DarAlta(float costeFijo, String cliente, String DNI, String matricula, String modelo, String fecha,
             int hora, float cobro){
         
         switch (modelo) {
          case "Camion":
                listaVehiculo[numVehiculos] = new Camion(50.0f, cliente, DNI,modelo, matricula, fecha, hora, 40.0f);
                numVehiculos++; 
                break;
            case "Furgoneta":
                listaVehiculo[numVehiculos] = new Furgoneta(30.0f, cliente, DNI,modelo, matricula, fecha, hora, 30.0f);
                numVehiculos++;
                break;
            default:
                System.out.println("No has escrito correctamente el tipo de vehiculo "
                        + "(Camion, Furgoneta)");
                break;
        }
     }
    /* 
    @Override
    public abstract float getPrecioHora();

    @Override
    public abstract float getCobroTrabajo(TrabajoTaller tt) ;
    */
}
