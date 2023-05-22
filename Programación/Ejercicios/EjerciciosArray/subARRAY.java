package com.mycompany.ejemplo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author mint
 */
import java.util.Scanner;

public class subARRAY {

    static int[]vector;
    int[]vectorResultado;
    
    static int PrimerNum;
    static int SegunNum;
    static int Total;
    
    public void PedirPos(){
        Scanner sc = new Scanner (System.in);
        
        do{
        System.out.println("Escribe número total de posiciones en cadena");
        Total = sc.nextInt();
        
        }while(Total <= 0 );
        
         
        do{
        System.out.println("Da primer número para parar la cadena");
        PrimerNum = sc.nextInt();
        
        System.out.println("Da segundo número para parar la cadena");
        SegunNum = sc.nextInt();
        
        }while(PrimerNum >= SegunNum || PrimerNum >= Total || SegunNum >= Total || PrimerNum < 0 || SegunNum < 0 );
    }
        
    public void crear_vector(){
        vector = new int [Total];
        for(int f= 0; f < Total; f++){
            vector[f]=(int)(Math. random()*9+1);
        }
    }
    public void mostrarVector(){
         System.out.println("Mostrando subArray ejercicio "); 
         
         for(int f = 0; f < Total; f++){
             System.out.print("[ ");
             System.out.print(vector[f]);
             System.out.print("]");
         }
    }
    public void SubArray(int[] parVector, int PrimerNum, int SegunNum){
        
        vectorResultado = new int [SegunNum - PrimerNum +2];
        int cont = 0;
        for(int f = PrimerNum; f <= SegunNum; f++){
            vectorResultado[cont] = parVector[f];
            cont++;
        }
        
        System.out.print("  Resultado  = "+ "[" );
        for(int f = 0; f < cont; f++){
            if(f == cont-1){
                    System.out.print(vectorResultado[f]);
            }else{
            System.out.print(vectorResultado[f] + ", ");
            }
        
        }
        System.out.println("].");

    }
    
    public static void main(String[] args) {  
        // Pedir el número total de columnas, así poder saber el total del vector.
        // Con el número total del vector usar math random para dar forma al vector
        // se han pedido las posiciones del vector en donde va a cortar
        // para crear el vector resultado se tomarán las posiciones del vector inicial
        // restandolo con las posiciones dadas para conseguir los datos del vector resultado
        subARRAY subArray = new subARRAY();
       
        subArray.PedirPos();
        System.out.println("");
        subArray.crear_vector();
        System.out.println("");
        subArray.mostrarVector();
        System.out.println("");
        subArray.SubArray(vector, PrimerNum, SegunNum);
    }
    
}
