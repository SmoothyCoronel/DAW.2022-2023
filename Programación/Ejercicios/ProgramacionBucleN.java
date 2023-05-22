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
public class ProgramacionBucleN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
         
        System.out.println("Dame un numero");
        int N = sc.nextInt();
        
        System.out.println("");
        for(int i = 1; i <= N; i++){
            System.out.println(i);
        }
        for(int i = N; i >= 1; i--){
            System.out.println(i);
     }
    }
    
}
