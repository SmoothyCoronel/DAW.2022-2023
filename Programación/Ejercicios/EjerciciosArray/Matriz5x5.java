/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejemplo;

/**
 *
 * @author mint
 */
 /*2-(2.5 p) Realizar un programa que rellena de forma aleatoria una matriz de 5 x 5 con valores entre 1 y 100 
y genere otra matriz de igual tamaño a la que llamaremos mprimo y en la que cada elemento es un valor ‘S’ o `N`,
según  el número de esa posición  es o no es primo . Hay que realizar el método boolean isPrimo(int numero) .
Deberá mostrar la matriz aleatoria y la matriz mprimo.*/

public class Matriz5x5 {

    /**
     * @param args the command line arguments
     */
    int [][] matriz;
    String [][] mprimo;
    
public void tabla (){
    matriz = new int [5][5];
    for(int f = 0; f < 5; f++){
        for(int e = 0; e < 5; e++){
             matriz[f][e]=(int)(Math. random()*99+1);
        }
    }
 }       
public void ver_tabla(){
   System.out.println("Números matriz "); 
    for(int f = 0; f < 5; f++){
        System.out.println(matriz[f][0] + "  " +matriz[f][1] + "  " +matriz[f][2] + "  " +matriz[f][3] + "  "+matriz[f][4] );
        
    }
   
    
}
public void tabla_primo(){
    mprimo = new String [5][5];
    for(int fila= 0; fila < 5; fila++){
        for( int col = 0; col < 5; col++){
             if (isPrimo (matriz[fila][col])){
                 mprimo [fila][col] = "S";
             } else{
                 mprimo [fila][col] = "N";
             }
            
        }
    }   
}
public void ver_tabla_primo(){
    
    System.out.println("Números matriz mprimoN "); 
    for(int f = 0; f < 5; f++){
         System.out.println(mprimo[f][0] + "  " +mprimo[f][1] + "  " +mprimo[f][2] + "  " +mprimo[f][3] + "  "+mprimo[f][4] );
        
    }
   
    
    }
public static boolean isPrimo(int numero) {
  // El 0, 1 y 4 no son primos
  if (numero == 0 || numero == 1 || numero == 4) {
    return false;
  }
  for (int x = 2; x < numero / 2; x++) {
    // Si es divisible por cualquiera de estos números, no
    // es primo
    if (numero % x == 0)
      return false;
  }
  // Si no se pudo dividir por ninguno de los de arriba, sí es primo
  return true;
}


 public static void main(String[] args) 
 {
         Matriz5x5 Matr =new Matriz5x5();
        // crear matriz 5x5 con números aleatorios del 1 al 100
        Matr.tabla();
        Matr.ver_tabla();
        System.out.println("");
        Matr.tabla_primo();
        Matr.ver_tabla_primo();
        // crear una matriz 5x5 que escriba s o n cuando los números anteriores sean primos o no
        // boolean isPrimo(int numero)
        
        
    }
}   

