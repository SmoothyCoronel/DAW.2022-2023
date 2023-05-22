/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejemplo;

/**
 *
 * @author mint
 */
public class Array2x10 {

    /**
     * @param args the command line arguments
     */
    static int Array [][];
    
    public void Array2x10(){
     Array = new int [2][10];
     
         for(int j =0; j < 10; j++){
                Array[0][j] = j;
                Array[1][j] = (int)(Math. random()*9+2);
             
         }
     
    }
    
    public void ShowArray(int [][] ArrayPar){
        for(int i = 0; i <2; i++){
            if(i == 0){
                System.out.print("Indice ");
            }else {
                System.out.println("");
                System.out.print("Valor ");
            }
            for(int j = 0; j < 10; j++){
                System.out.print(ArrayPar[i][j] + " ");
            }
        }
    }
    
    public int [][] sort(int [][] ArrayPar){
        int [] valor = new int [10];
        int cont = 0;

            for(int j = 0; j < 10; j++){
                if(isPrimo(ArrayPar[1][j])){
                    valor[cont] = ArrayPar[1][j];
                    cont++;
             }
            }
            for(int j = 0; j < 10; j++){
                if(!isPrimo(ArrayPar[1][j])){
                    valor[cont] = ArrayPar[1][j];
                    cont++;
                }
            }
            for(int j = 0; j < 10; j++){
                ArrayPar[1][j] = valor[j];
            }
            return ArrayPar;
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
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Array2x10 prim = new Array2x10();
        prim.Array2x10();
        prim.ShowArray(Array);
        System.out.println("");
        System.out.println("Array Inicial");
        System.out.println("");
        Array = prim.sort(Array);
        prim.ShowArray(Array);
        System.out.println("");
        System.out.println("Array Final");
        
    }
    
}
