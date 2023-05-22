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
public class ColumnasString {
     int repeticion;
     String frase;
     
     public ColumnasString (int repeticion, String frase){
         this.repeticion = repeticion;
         this.frase = frase;
     }
     
     public int getRepeticion(){
         return this.repeticion;
     }
      public void setRepeticion(int repeticion){
        this.repeticion = repeticion;
    }
     
     public String getFrase(){
         return this.frase;
     }
      public void setFrase(String frase){
        this.frase = frase;
    }
      
      
      public String imprime(){
          String car ="";
          String fraseFinal = "";
          for(int i = 0; i < frase.length(); i++){
               car = frase.substring(i,i+1);
              for(int j = 0; j < repeticion; j++){
                  fraseFinal = fraseFinal + car;
              }
          }
          return fraseFinal;
     }
    
    public static void main(String[] args) {
        // TODO code application logic here 
       Scanner sc = new Scanner(System.in);
      
       System.out.println("Dame una frase o palabra por pantalla");
        String frase = sc.next();
       
       System.out.println("¿Cuantás veces se repetira esta frase?");
        int repeticion = sc.nextInt();
        
        ColumnasString columna = new ColumnasString(repeticion,frase);
        
        System.out.println(columna.imprime());
    }
    
}
