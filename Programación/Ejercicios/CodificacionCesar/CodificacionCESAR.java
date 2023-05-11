/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.codificacioncesar;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author mint
 */
public class CodificacionCESAR {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String textoOriginal;
        int llave;
        char opcion;
        //Introducir texto
        do{
            System.out.print("Introduce un texto: ");
            textoOriginal = sc.nextLine();

        } while (textoOriginal.isEmpty());
        //Introducir el valor del desplaza
        do{            
            System.out.print("Introduce número: ");
            llave = sc.nextInt();
            
        } while (llave < 1);
        //Operación a realizar: cifrar o descifrar
        do{
            sc.nextLine();
            System.out.print("(C) cifrar o (D) descifrar?: ");
            opcion = (char) System.in.read();
        } while (Character.toUpperCase(opcion) != 'C'
                 && Character.toUpperCase(opcion) != 'D');
        if(Character.toUpperCase(opcion) == 'C'){
            System.out.println("Texto cifrado: "+ cifradoCesar(textoOriginal, llave));
        }else{
            System.out.println("Texto descifrado: " + descifradorCesar(textoOriginal, llave));
        }
        
    }
    
    public static String cifradoCesar(String textoOriginal, int llave){
        StringBuilder cifrado = new StringBuilder();
        llave = llave % 26;
        for (int i = 0; i < textoOriginal.length(); i++){
            if(textoOriginal.charAt(i) >= 'a' && textoOriginal.charAt(i) <= 'z'){
                if((textoOriginal.charAt(i) >= 'a' && textoOriginal.charAt(i) <= 'z')){
                    cifrado.append((char) (textoOriginal.charAt(i) + llave ));
                } else {
                    cifrado.append((char) (textoOriginal.charAt(i) + llave -26));
                }
            }else if (textoOriginal.charAt(i) >= 'A' && textoOriginal.charAt(i) <= 'Z'){
                if ((textoOriginal.charAt(i) + llave) > 'Z') {
                    cifrado.append((char) (textoOriginal.charAt(i) + llave ));
                } else{
                    cifrado.append((char) (textoOriginal.charAt(i) + llave)-26);
                }
            }
        }
        return cifrado.toString();
    } 
    //Metodo para descifrar texto
    public static String descifradorCesar(String textoOriginal, int llave){
        StringBuilder cifrado = new StringBuilder();
        llave = llave % 26;
        for (int i = 0; i < textoOriginal.length(); i++) {
            if(textoOriginal.charAt(i) >= 'a' && textoOriginal.charAt(i) <= 'z'){
                if((textoOriginal.charAt(i) - llave) < 'a'){
                    cifrado.append((char) (textoOriginal.charAt(i) - llave +26));
                } else{
                    cifrado.append((char) (textoOriginal.charAt(i) - llave));
                }
            }else if (textoOriginal.charAt(i) >= 'A' && textoOriginal.charAt(i) <= 'Z') {
                if ((textoOriginal.charAt(i) - llave) < 'A'){
                    cifrado.append((char) (textoOriginal.charAt(i) - llave + 26));
                } else{
                    cifrado.append((char) (textoOriginal.charAt(i) - llave));
                }
            }
        }
        return cifrado.toString();
    } 
    //Fin
}

