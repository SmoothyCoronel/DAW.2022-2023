/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplo;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author mint
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Incrementación de la clase producto
        String producto2 = null;
        String producto1 = null;
        int codigo1 = 0;
        int codigo2 = 0;
        //Codigos siempre positivos
        float precio1 = 0;
        int porcentaje1;
        float aumento1;
        float dimiss1;
        
        float precio2 = 0;
        int porcentaje2;
        float dimiss2;
        float aumento2;
        //Precios siempre positivos
        
        //La descripción no debe ser nunca una cadena de texto vacía.
        //Un producto puede aumentar a disminuir de precio
        /*Pero para aumentarlo el usuario nos 
          debe de dar un porcentaje que nos dirá el incremento a aplicar con 
          respecto al precio originalmente almacenado.*/
        
        
       boolean continuar;
       continuar = true;
        Scanner sc = new Scanner(System.in);
        String entrada;
        
        do{
            //Opciones
            System.out.println("Crear producto 1");
            System.out.println("Crear producto 2");
            System.out.println("Aumentar precio producto 1");
            System.out.println("Aumentar precio producto 2");
            System.out.println("Rebajar precio producto 1");
            System.out.println("Rebajar precio producto 2");
            System.out.println("Mostrar datos de los productos ");
            System.out.println("Salir");
            sc.reset();
            entrada = sc.nextLine();
            //Escribe que quiere
            switch(entrada){
                case "1":
                    System.out.println("¿Cual es el nombre del producto?");
                    producto1 = sc.nextLine();
                    
                   
                    do{
                    System.out.println("¿Cual es su código?");
                    codigo1 = sc.nextInt();
                    
                    }while(codigo1 < 0);
                    
                    do{
                    System.out.println("¿Cuanto cuesta?");
                    precio1 = sc.nextInt();
                    
                    }while(precio1 < 0);
                    
                    break;
                case"2":
                    System.out.println("¿Cual es el nombre del producto?");
                    producto2 = sc.nextLine();
                    
                   
                    do{
                    System.out.println("¿Cual es su código?");
                    codigo2 = sc.nextInt();
                    
                    }while(codigo2 < 0);
                    
                    do{
                    System.out.println("¿Cuanto cuesta?");
                    precio2 = sc.nextInt();
                    
                    }while(precio2 < 0);
                    
                    break;
                case"3":
                    //Operación para aumentar precio 1
                    do{
                    System.out.println("Dame tu porcentaje a incrementar");
                    porcentaje1 = sc.nextInt();
                    
                    }while(porcentaje1>0 && porcentaje1 <= 100);
                    
                    aumento1 = precio1 * 2  * (porcentaje1/100); 
                    System.out.println("El precio aumentado sería" + aumento1);
                    break;
                case"4":
                    //Operación para aumentar precio 2
                    do{
                    System.out.println("Dame tu porcentaje a incrementar");
                    porcentaje2 = sc.nextInt();
                    
                    }while(porcentaje2>0 && porcentaje2 <= 100);
                    
                    aumento2 = precio2 * 2  * (porcentaje2/100); 
                    System.out.println("El precio aumentado sería" + aumento2);
                    break;
                case"5":
                    //Rebajar precio 1
                    do{
                    System.out.println("Dame tu porcentaje a rebajar");
                    porcentaje1 = sc.nextInt();
                    
                    }while(porcentaje1>0 && porcentaje1 <= 100);
                    
                    dimiss1 = precio1 - precio1  * (porcentaje1/100); 
                    System.out.println("El precio rebajado sería" + dimiss1);
                    break;
                case"6":
                    //Rebajar precio 2
                    do{
                    System.out.println("Dame tu porcentaje a rebajar");
                    porcentaje2 = sc.nextInt();
                    
                    }while(porcentaje2>0 && porcentaje2 <= 100);
                    
                    dimiss1 = precio2 - precio2  * (porcentaje2/100); 
                    System.out.println("El precio rebajado sería" + dimiss1);
                    break;
                case"7":
                    //Mostrar datos
                    System.out.println("Nombre productos" + producto1 + " " + producto2);
                    System.out.println("Codigo productos" + codigo1 + " " + codigo2);
                    System.out.println("Precio productos" + precio1 + " " + precio2);
                    
                    break;
            }
        } while(continuar);
    }
    
}