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
//Primer vector con nombres, seis nombres.
//segundo array con numeros 0-6-8-10
//elegir un numero aleatorio del 0 al 5 de la tabla creada como array
//a ese numero se le dará el numero 10
//al sigiente random escogido, el número 8
//al siguiente el 6
//y los resultantes el 0
//hay que comprobar si la tabla tiene ya numero para darselo o no
//al final sumar el numero de las
 //tres filas y seis columnas de array
public class Formula1 {
   
Scanner sc = new Scanner(System.in);
    String []vectorPilotos;
    int[][]arrayPuntos;
    int []vectorResultados;
    
    public void crear_Pilotos(){
        vectorPilotos = new String [6];
        String Name = "";
        boolean alfabetico = true;
        
        for(int f = 0; f < 6; f++){
            do{
            System.out.println("¿Cual es el nombre del piloto "+ (f+1) +"?");
            String temp = sc.nextLine();
            
            alfabetico = temp.matches("[a-zA-Z]+");
            if(alfabetico){
                vectorPilotos[f] = temp;
            }
            }while(!alfabetico);
        }
        
        System.out.print("[ ");
        for(int f = 0; f < 6; f++){
            System.out.print( "Piloto nº "+ (f + 1)+ ": " +  vectorPilotos[f] + " ");
           
   
        }
        System.out.println("]");
    }
    
    public void crear_Puntuacion(){
         int puntosInd =0;
         int puntosInd2 = 0;
         int puntos = 0;
      
        arrayPuntos = new int [3][6];
        
        for(int a = 0; a < 3; a++){
            for(int b = 0; b < 6; b++){
            arrayPuntos[a][b] = 0;
            }
        }
        for(int p = 0; p < 3; p++){
            
            int totalPuntos = 0;
          do{
            totalPuntos = 0; 
          
            for(int b = 0; b < 6; b++){
            arrayPuntos[p][b] = 0;
            }
             
            for(int r = 0; r < 3; r++){
            do{  
              puntosInd = (int) (Math.random()*6);
             
              puntosInd2 = (int) (Math.random()*3);
              switch(puntosInd2 ){
                  case 0:{
                     
                     puntos = 10;
                     totalPuntos = totalPuntos + puntos;
                     break;
                  }
                  case 1:{
                    
                   
                     puntos = 8;
                     totalPuntos = totalPuntos + puntos;
                     break;
                  }
                  case 2:{
                     
                    
                     puntos = 6;
                     totalPuntos = totalPuntos + puntos;
                     break;
                  }
                  default:
                      break;
              }
            
            }while(arrayPuntos[p][puntosInd] != 0 );
               arrayPuntos[p][puntosInd] = puntos;   
               
            }
          }while(!puntuacion_correcta(arrayPuntos, p));
        }
        
    }
    
    public boolean puntuacion_correcta(int [][]m, int f){
        boolean b10 = false;
        boolean b8 = false;
        boolean b6 = false;
        for(int a = 0; a < 6; a++){
            switch(m[f][a]){
                case 10:
                  b10 = true;
                    break;
                case 8:
                  b8 = true;
                    break;
                case 6:
                  b6 = true;
                    break;
            }
            
        }
        return (b10 && b8 && b6);
    }
    public void ver_Puntuacion(){
      
       System.out.println();
        for(int a = 0; a < 3; a++){
             System.out.print("[ ");
            for(int b = 0; b < 6; b++){
             System.out.print( arrayPuntos[a][b]+ "  " ); 
            }
              System.out.print("]");
           System.out.println(" ");
        }
        
     
    }
    public int[] sumarResultados(int [][]m){
         vectorResultados = new int[6];
        for (int c = 0; c < 6; c++){
            vectorResultados[c]= m[0][c] + m[1][c] + m[2][c];
        }
        return vectorResultados;
    }
    public void ver_PuntuacionAlta(){
       vectorResultados = sumarResultados(arrayPuntos);
       vectorResultados = ordenar(vectorResultados, vectorPilotos, vectorResultados.length-1);
       System.out.println("La primera posición de la carrera es para: "+ vectorPilotos[5] + " con puntuación: " + 
               vectorResultados[5]);
       System.out.println("La segunda posición de la carrera es para: "+ vectorPilotos[4] + " con puntuación: " + 
               vectorResultados[4]);
       System.out.println("La tercera posición de la carrera es para: "+ vectorPilotos[3] + " con puntuación " + 
               vectorResultados[3]);
    }    
    
    public int[] ordenar(int []v, String []v1, int longitud) {
        for(int k=0;k<longitud;k++) {
            for(int f=0;f<longitud-k;f++) {
                if (v[f]>v[f+1]) {
                    int aux;
                    aux=v[f];
                    v[f]=v[f+1];
                    v[f+1]=aux;
                    
                    String aux1;
                    aux1=v1[f];
                    v1[f]=v1[f+1];
                    v1[f+1]=aux1;
                }
            }
        }
        return v;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Formula1 formList = new Formula1();
        formList.crear_Pilotos();
        formList.crear_Puntuacion();
        formList.ver_Puntuacion();
        formList.ver_PuntuacionAlta();
        /**
         * Se están celebrando las pruebas para conseguir el título del mini
           campeonato del mundo de Fórmula 1. Para ello disponemos de una tabla de
           dimensión 6 x 3 con los puntos conseguidos por cada piloto (6 pilotos) en cada
           una de las distintas pruebas (3 pruebas) realizadas.
           * 
           Se tiene también un array de 6 posiciones con los nombres de los pilotos.
           *
           El array de los pilotos se cargará por teclado controlando que solo tendrán
           caracteres alfabéticos.
           * 
           Para cargar la tabla (1.5 ptos) se tendrá en cuenta lo siguiente:
           En cada prueba se reparten aleatoriamente 10, 8, 6 puntos para los
           3 primeros puestos y el resto de los pilotos 0 puntos, los puntos se darán
           aleatoriamente a los pilotos, para ello se generará un número del 0 al 5 que
           corresponderá al piloto y se controlara que no se le haya dado puntos ya en esa
           carrera.
           * 
           Por ej. Si se genera el piloto número 3 y se le da 10 puntos, si se vuelve
           a generar el 3 otra vez en la misma carrera para dar los 8 puntos, se volverá a
           repetir el numero generado. (Piensa que la carga se realiza por carreras).
           * 
           Se pide (No hace falta un menú):
           Nombre de los pilotos que han conseguido las 3 primeras posiciones,
           teniendo en cuenta que es con respecto a la suma de puntos conseguidos.(1.5 ptos)
           Nombre de los pilotos que no han conseguido puntos en ninguna prueba.(1 ptos)
         */
    }
    
}
