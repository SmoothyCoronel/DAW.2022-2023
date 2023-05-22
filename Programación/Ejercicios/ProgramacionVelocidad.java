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
public class ProgramacionVelocidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int contador = 1;
        
        do{
        System.out.println("Dame la posición inicial");
         int pos = sc.nextInt();
         if(pos < 0){
             contador--;
         }
         System.out.println("Dame la velocidad inicial");
         int vel = sc.nextInt();
         if(vel < 0 || vel >100){
             contador--;
         }
         System.out.println("Dame la aceleracion inicial");
         int acel = sc.nextInt();
         if(acel < 5 || acel > 15){
             contador--;
         }
         System.out.println("Dame el timepo");
         int tmp = sc.nextInt();
         if(tmp < 10 || tmp > 100){
             contador--;
         }
         for(int i = 0; i < tmp; i++){
             pos = pos + vel;
             vel = vel +acel;
         }
         System.out.println("Velocidad: " + vel + "m/s");
         System.out.println("Aceleracion: " + acel + "m/s2");
         System.out.println("Posicion: " + pos + "m");
         System.out.println("Tiempo usado: " + tmp + "segundos");
        }while(contador == 1);
       
        
    }
    
}
