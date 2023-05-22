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
public class Codificador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //ArrayList<String> Abecedario = new ArrayList<String>();
        System.out.println("Escribe frase para pasar a cesar");
        String textoOriginal = sc.nextLine();
        
        for(int i = 0; i < textoOriginal.length(); i++){
            System.out.println(textoOriginal.length());
        }
    }
    
}
