/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejemplo;

/**
 *
 * @author mint
 */
import java.util.Scanner;
/*
3- (3.5 p) Dada la matriz de tamaño M*N y el vector de tamaño M, determinar que columna de la matriz
es igual al vector (M y N lo generáis aleatoriamente entre 2 y 5). Hacer el método 
int comproColumna(int[][]matriz,int[]columna), si no hay ninguna columna igual devolverá el valor -1 
y si la hay el índice de la columna.
*/

public class MatrizNxM {


    /**
     * @param args the command line arguments
     */
    static int [][] matrizMxN;
    static int [] vectorM;
    
    
   
public void crear_matriz (int M, int N){
    matrizMxN = new int [M][N];
    for(int f = 0; f < M; f++){
        for(int e = 0; e < N; e++){
             matrizMxN[f][e]=(int)(Math. random()*5+2);
        }
    }
 }       
public void ver_matriz(int M, int N){
   System.out.println("Números matriz "); 
   String stringFila = "";
    for(int f = 0; f < M; f++){
       for (int e = 0; e < N; e++){
           stringFila = stringFila + matrizMxN[f][e] + "  ";
       }
       System.out.println("[ " + stringFila + "]");
       stringFila = "";
    }
   
    
}
public void crear_vector(int M){
    vectorM = new int [M];
    for(int f= 0; f < M; f++){
        vectorM[f] = (int)(Math.random()*5+2);
    }   
}
public void ver_vector(int M){
    System.out.println("Números vector: "); 
    for(int f= 0; f < M; f++){
        System.out.println(vectorM[f]);
    }   
}
public static int comproColumna(int [][] matriz, int[] columna, int M, int N ){
    int cont = 0;
    
    for(int e= 0; e < N; e++){
        for(int f= 0; f < M; f++){
            if(matriz[f][e] == columna[f]){
                cont++;
            }    
        }
        if (cont == M ){
            return e;
        }
        cont = 0;
        
    }
    return -1;
        
}  
    

    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         MatrizNxM Matr =new MatrizNxM();
         int Filas ;
         int Columnas ;
         int valor ;
         int intentos = 1; 
        
         System.out.println("Introduzca número de filas de la matriz (M):");
         Filas = sc.nextInt();
         
         System.out.println("Introduzca número de columnas de la matriz (N):");
         Columnas = sc.nextInt();
         System.out.println("");
         
         
         do
         {
        
            System.out.println("");
            System.out.println("- Intento nº " + intentos);
            
            Matr.crear_matriz(Filas, Columnas);
            Matr.crear_vector(Filas);
            
            Matr.ver_matriz(Filas, Columnas);
            System.out.println("");
            Matr.ver_vector(Filas);
            System.out.println("");

            valor = MatrizNxM.comproColumna(matrizMxN, vectorM, Filas, Columnas);
            if(valor == -1){
                System.out.println("No existe coincidencia (-1)");
               
            } else {
                System.out.println("La columna: " + (valor +1 )+ " ha coincidido");
                System.out.println("");
            }

            intentos++;
         
        }while(valor == -1);
    }
}  