/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejemplo;

import java.util.Scanner;

/**
 *
 * @author mint
 */
public class ProgramaciónTicket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
         String entrada;
         boolean continuar = true;
         int cerrados = 0;
         int enSeguimiento = 0;
         int enMitigacion = 0;
         
        do{
            //Opciones
            System.out.println("1. Realizar clasificación ");
            System.out.println("2. Mostrar estadísticas");
            System.out.println("3. Salir");
            
            sc.reset();
            entrada = sc.nextLine();
            switch (entrada) {
                case "1":
                    
                    System.out.println("");
                    System.out.println("------------");
                    System.out.println("Crear ticket");
                    System.out.println("");
                    System.out.println("¿Emergencia?");
                    String eleccion1 = sc.nextLine();
                    do{
                        if("Si".equals(eleccion1) ){
                             System.out.println("Procedimiento de mitigación");
                             enMitigacion++;
                        }
                        else if("No".equals(eleccion1)){
                            System.out.println("Lanzar ticket");
                            System.out.println("");
                            System.out.println("¿Respuesta?");
                            String eleccion2 =sc.nextLine();
                                do{
                                    if("Si".equals(eleccion2)){
                                        System.out.println("¿Resuelto?");
                                        String eleccion3 = sc.nextLine();
                                        do{
                                            if("Si".equals(eleccion3)){
                                                System.out.println("Cierre ticket");
                                                cerrados++;
                                            }
                                            else if("No".equals(eleccion2)){
                                                System.out.println("Seguimiento incidente");
                                            }
                                        }while(!"Si".equals(eleccion3) && !"No".equals(eleccion3));
                                    }
                                    else if("No".equals(eleccion2)){
                                        System.out.println("¿Prioridad alta?");
                                        String eleccion4 = sc.nextLine();
                                        do{
                                            if("Si".equals(eleccion4)){
                                                System.out.println("Procedimiento de mitigación");
                                                enMitigacion++;
                                            }
                                            else if("No".equals(eleccion4)){
                                                System.out.println("Seguimiento incidente");
                                                enSeguimiento++;
                                            }
                                        }while(!"Si".equals(eleccion4) && !"No".equals(eleccion4));
                                    }
                                }while(!"Si".equals(eleccion2) && !"No".equals(eleccion2));
                        }
                    }while(!"Si".equals(eleccion1) && !"No".equals(eleccion1));
                    break;
                case "2":
                    System.out.println("");
                    System.out.println("Estadísticas de ejercicio anterior");
                    System.out.println("");
                    System.out.println("Cerrados: " + cerrados);
                    System.out.println("En seguimiento: " + enSeguimiento);
                    System.out.println("enMitigacion: " + enMitigacion);
                    break;
                case "3":
                    continuar=false;
            }
        }while(continuar);
    }
}
