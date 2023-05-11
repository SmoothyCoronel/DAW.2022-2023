/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.politecnicomalaga.tallerchapuzas;

import java.util.Scanner;


public class TallerChapuzas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VehiculoIndustrial listaVehIndustrial = null;
        Vehiculo listavehiculo = null;
        TrabajoTaller listaTrabajos = null;
        int cont = 0;
        /*
        Moto listaMotos[] = new Moto[cont];
        Coche listaCoches[] = new Coche[cont];
        Furgoneta listaFurgoneta[] = new Furgoneta[cont];
        Camion listaCamion[] = new Camion[cont];
        */
    
        System.out.println("Taller el vertedero");   
        System.out.println("");
        System.out.println("----Datos a recoger---- ");
        System.out.println("");   



           System.out.println("Cual es su matrícula");
           String matricula = sc.next();

           System.out.println("Cual es su modelo");
           String modelo = sc.next();

           System.out.println("Digame su nombre y apellido");
           String cliente = sc.next();

           System.out.println("Deme su DNI");
           String DNI = sc.next();

           System.out.println("¿Cual fue la fecha de entrega? ");
           String fecha = sc.next();

           System.out.println("¿A que hora fue entregado?");
           int hora = sc.nextInt();

           System.out.println("¿Que vehiculo entregó? (Coche, Moto, Camion, Furgoneta)");
           String tipoVehiculo = sc.next();

            switch (tipoVehiculo) {
                case "Coche":
                    listavehiculo.DarAlta(cliente, DNI, modelo, matricula, fecha, hora, 25.0f);
                    break;                
                case "Moto": 
                    listavehiculo.DarAlta(cliente, DNI, modelo, matricula, fecha, hora, 20.0f);
                    break;
                case "Furgoneta":
                    listaVehIndustrial.DarAlta(30.0f, cliente, DNI, modelo, matricula, fecha, hora, 30.0f);
                    break;
                case "Camion":
                    listaVehIndustrial.DarAlta(40.0f, cliente, DNI, modelo, matricula, fecha, hora, 40.0f);
                    break;
                default:
                    break;
            }
             System.out.println("");
             System.out.println("Se prepara la inicialización del problema");
             System.out.println("");
             System.out.println("De la descripción de su problema");
             String problema = sc.next();
             
             System.out.println("¿Cual será la solución para el problema?");
             String solucion = sc.next();
             
             System.out.println("¿Cuantas horas preveemos de duración?");
             int horasPrevistas = sc.nextInt();
             
             System.out.println("¿Cuanto se ha tardado en resolver el problema?");
             int horasReales = sc.nextInt();
             
             System.out.println("¿Ha sido cobrado?(1 true /2 false)");
             String cobrado = sc.next();
             if(cobrado == "1"){
                 //es true
             }
             else if(cobrado == "2"){
                 //es false
             }
             else{
                 System.out.println("No ha escrito correctamente, pruebe denuevo");
             }
             
            if("Coche".equals(modelo) || "Moto".equals(modelo)){
            float Problema = listaTrabajos.Problema(horasReales, listavehiculo.getModelo(), 0, listavehiculo.getCobro());
            }
            else if("Camion".equals(modelo) || "Furgoneta".equals(modelo)){
                float Problema = listaTrabajos.Problema(horasReales, listaVehIndustrial.getModelo(), listaVehIndustrial.costeFijo,
                        listaVehIndustrial.getCobro());
            }
            
    }
    
}
