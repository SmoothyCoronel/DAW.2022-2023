/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.tallerchapuzas;

/**
 *
 * @author mint
 */
public abstract class Vehiculo {
    //Atributos
    private String matricula;
    private String modelo;
    private String cliente;
    private String DniCliente;
    private String fechaEntrada;
    private int horaEntrada;
    private float cobro;
      int numVehiculos = 0;
    Vehiculo listaVehiculo[] = new Vehiculo[numVehiculos];
   
    //Comportamientos
    
  // private ArrayList<TrabajoTaller> misTrabajos;

    public Vehiculo(String cliente, String DniCliente, String matricula, String modelo, String fechaEntrada, int horaEntrada, float cobro) {
        this.cliente = cliente;
        this.DniCliente = DniCliente;
        this.matricula = matricula;
        this.modelo = modelo;
        this.fechaEntrada = fechaEntrada;
        this.horaEntrada = horaEntrada;
        this.cobro = cobro;
       // misTrabajos = new ArrayList
    }
    
    

    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo) {
            this.modelo = modelo;
        }

    public String getCliente(){
        return this.cliente;
    }
    public void setCliente(String cliente) {
            this.cliente = cliente;
        }

    public String getDNICliente(){
        return this.cliente;
    }
    public void setDNICliente(String DNICliente){
        this.DniCliente = DNICliente;
    }

    public String getFechaEntrega(){
        return this.fechaEntrada;
    }
    public void setFechaEntrada(String fechaEntrada){
        this.fechaEntrada = fechaEntrada;
    }

    public int getHoraEntrada(){
        return this.horaEntrada;
    }
    public void setHoraEntrada(int horaEntrada){
        this.horaEntrada = horaEntrada;
    }

    public float getCobro() {
        return cobro;
    }

    public void setCobro(float cobro) {
        this.cobro = cobro;
    }

    
    
    public void DarAlta(String cliente, String DNI, String matricula, String modelo, String fecha, int hora, float cobro){
    
        switch (modelo) {
            case "Coche":
                listaVehiculo[numVehiculos] = new Coche(cliente, DNI, matricula, modelo, fecha, hora, 20.0f);
                numVehiculos++;
                break;
            case "Moto":
                listaVehiculo[numVehiculos] = new Moto(matricula, modelo, cliente, DNI,
                                                fecha, hora, 25.0f);
                numVehiculos++;
                break;
            default:
                System.out.println("No has escrito correctamente el tipo de vehiculo "
                        + "(Coche, Moto)");
                break;
        }

//public abstract float getPrecioHora();

//public abstract float getCobroTrabajo(TrabajoTaller tt);

    }
}