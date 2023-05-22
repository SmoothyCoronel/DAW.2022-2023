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
public class ideaDados_infinito_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        String decision; 
        boolean bucle = true;
        int dados;
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
            System.out.println("Escoge cuantos dados quieres usar");
            dados = sc.nextInt();
            for(int i = 0; i < dados; i++){
                
            valor1 = (int) (Math.random()*6+1);
            System.out.println("El valor del "+i+" dado es: " +valor1);
            System.out.println("");
            if(valor1 == 6){
                haySeis1++;
             }
            ValorF1 += valor1;
            }
           
            
           
            System.out.println("Valor total de tiradas: " + ValorF1);
            System.out.println("");
            System.out.println("Número de seises: " + haySeis1);
          
            bucle = false;
         }
        }while(bucle);
        
        bucle = true;
        
        do{
         System.out.println("");  
         System.out.println("Tirar dado jugador 2 ¿Yes(Y)/No(N)?");
         decision = sc.nextLine();
        if("Y".equals(decision)){
            System.out.println("Escoge cuantos dados quieres usar");
            dados = sc.nextInt();
            for(int i = 0; i < dados; i++){
                
            valor2 = (int) (Math.random()*6+1);
            System.out.println("El valor del "+i+" dado es: " +valor2);
            System.out.println("");
            if(valor2 == 6){
                haySeis2++;
             }
             ValorF2 += valor2 ;
            }
             
            System.out.println("Valor total de tiradas: " + ValorF2);
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
