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
public class ideasDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String decision; 
        boolean bucle = true;
        int valor1;
        int valor2;
        int ValorF1 = 0;
        int ValorF2 = 0;
        int haySeis1 = 0;
        int haySeis2 = 0;
      
        
        do{
        System.out.println("Tirar dado jugador 1 ¿Yes(Y)/No(N)?");
        decision = sc.nextLine();
        if("Y".equals(decision)){
            
            valor1 = (int) (Math.random()*6+1);
            System.out.println("El valor del 1 dado es: " +valor1);
            if(valor1 == 6){
                haySeis1++;
            }
            valor2 = (int) (Math.random()*6+1);
            System.out.println("El valor del 2 dado es: " +valor2);
            if(valor2 == 6){
                haySeis1++;
            }
            ValorF1 = valor1 + valor2;
            System.out.println("Valor total de tirada: " + ValorF1);
            System.out.println("");
            System.out.println("Número de seises: " + haySeis1);
          
            bucle = false;
         }
        }while(bucle);
        
        bucle = true;
        do{
         System.out.println("Tirar dado jugador 2 ¿Yes(Y)/No(N)?");   
         decision = sc.nextLine();
         if("Y".equals(decision)){
             
            valor1 = (int) (Math.random()*6+1);
            System.out.println("El valor del 1 dado es: " +valor1);
            if(valor1 == 6){
                haySeis2++;
            }
            valor2 = (int) (Math.random()*6+1);
            System.out.println("El valor del 2 dado es: " +valor2);
            if(valor2 == 6){
                haySeis2++;
            }
            ValorF2 = valor1 + valor2;
            System.out.println("Valor total de tirada: " + ValorF2);
            System.out.println("");
            System.out.println("Número de seises: " + haySeis2);
            
            bucle = false;
         }
        }while(bucle);
        
        System.out.println("Calculo de ganador");
        System.out.println("");
        
        
        
        if(haySeis1 > haySeis2){
             System.out.println("Ha ganado el primer jugador por sacar seis ");
        } 
        else if (haySeis1 == haySeis2){
             System.out.println("Tiene los mismos seies, se mira por la suma ");
             
            if(ValorF1 > ValorF2){
             System.out.println("Ha ganado el primer jugador por suma");
            } else{
            System.out.println("Ha ganado el segundo jugador por suma");
            }
             
        }
        else{
            System.out.println("Ha ganado el segundo jugador por sacar seis ");
        }  
    }
    
}
