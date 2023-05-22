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
/*
1.-(4 p) Realizar un programa que muestre el premio obtenido en un determinado boleto de primitiva. 
El sorteo se generará aleatoriamente y la combinación ganadora será el atributo de la clase 
(vector de 7 posiciones). Son 6 números más el complementario que será el último número generado en el sorteo.
El boleto a controlar  (6 números del 1 al 49), se introducirá por teclado en el main y se controlará 
no incurrir en errores (Tanto la combinación ganadora como la que se comprueba son números del 1 al 49 y
no es posible que estén repetidos.)

Los métodos de la clase serán:

void ganadora()  // el sorteo de los 6 y complementario
void ver_ganadora()  // visualizar la combinación del sorteo
int comprobar(int [] boleto)  //devuelve el número de aciertos que existen en el vector sin el complementario,
es decir número de coincidencia de los números con los números del sorteo ganador.
boolean comprobar_comple( int [] boleto) // devuelve si está el número que ha salido como complementario 
o no en el boleto

El programa debe pedir por teclado los 6 números de un boleto y decir si está o no premiado. 
Y los premios que se contemplan son: 6 aciertos, 5 aciertos más complementario, 
5 aciertos, 4 aciertos y 3 aciertos.

*/
public class ObjetoBoleto {

     int aciertos = 0;
     int[] numBol;
     int[] numBolGanador;
   
     public void ganadora(){
         numBolGanador = new int [7];
    
         for(int f=0; f<7; f++){
            boolean aErrorRep = true;
            
             while(aErrorRep){
                numBolGanador[f]=(int)(Math. random()*49+1);
                int temP = numBolGanador[f];
                aErrorRep = estaRepetido (numBolGanador, temP, f);
             } 

         }
     }
     
     public boolean estaRepetido (int[] vector, int valorR, int posR){
         for(int f=0;f<posR;f++) { 
             if(vector.length > 0)
             {
                if (vector[f] == valorR){
                   return true; 
                }
             }
         }
            
         return false;    
     }
     
     public void ver_ganadora (){
         
         for(int f= 0; f< 7;f++) {   
            System.out.println("Números [" + (f+1) + "] " + numBolGanador[f]);   
    
         } 
     }
     
   
     public void cargarBoleto() {
        Scanner teclado =new Scanner(System.in);
        numBol = new int[6];
        
        for(int f=0;f<6;f++) {      
            numBol[f]=0;
        }
        
        System.out.println("");
        System.out.println(" ----------------- ");
        System.out.println(" Números de boleto ");
        System.out.println(" ----------------- ");
        System.out.println("");
        System.out.println(" Escribe tus números: ");
        
        for(int f=0;f<6;f++) {
            System.out.printf("Ingrese número %d del boleto:", f+1);
            int temp = teclado.nextInt();
            
            boolean bErrorRep = estaRepetido (numBol,temp, f); 
            boolean bErrorRango = false;
            if (temp < 1 || temp > 49){
                bErrorRango = true;
            }
            
            if (bErrorRep || bErrorRango) {
                f--;
            }
            else{
                 numBol[f]=temp;
            }
            
        }	
    }
  
     
     public void imprimir (){
     
         for(int f= 0; f< 6;f++) {   
            System.out.println("Números [" + (f+1) + "]" + numBol[f]);   
    
         } 
     }
     
    // int comprobar(int [] boleto)
    public void comprobar () {
        for(int f=0; f<6; f++){
            for (int e=0; e<6; e++){
                if(numBol[f] == numBolGanador[e]){
                    aciertos++;
                }
            }
        }
        if ( aciertos == 3 || aciertos == 4 || aciertos == 5 || aciertos == 6){
             System.out.print("Ha acertado " + aciertos + " veces");
        }else{
            System.out.println("No se ha acertado el número mínimo de resultados");
        } 
        
        if (aciertos == 5){
            boolean comp = comprobar_comple(numBol);
             System.out.println(" + un complementario");
        }
       
        
        
    }
    public boolean comprobar_comple (int[] boleto){
        for(int f = 0; f < 6; f++ ){
            if ( boleto[f] == numBolGanador[6]){
                return true;
            }
        } 
        return false;
    }

   
     
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String entrada;
        boolean continuar = true;
         ObjetoBoleto objBol =new ObjetoBoleto();
         	
        do{
            //Opciones
            System.out.println("1. Crear boleto");
            System.out.println("2. Mostrar boleto ganador ");
            System.out.println("3. Comprobaciones ");
            System.out.println("4. Salir");
        
            sc.reset();
            entrada = sc.nextLine();
            switch (entrada) {
                case "1":
                    System.out.println("");
                    objBol.cargarBoleto();
                    objBol.imprimir();
                    System.out.println("");
                    break;
                    
                case "2":
                    System.out.println("");
                    objBol.ganadora();
                    objBol.ver_ganadora();
                    
                    System.out.println("");
                    System.out.println("");
                    break;
                case "3":
                     System.out.println("");
                     objBol.comprobar();
                     System.out.println("");
                    break;
                case "4":
                continuar = false;
            }
        } while(continuar);
        
        //Sacar 6 números aleatorios del 1 al 49
        //Un último número complementario
        //Crear array int de siete números entre 1-49
        //Pedir cada número y meterlos en el array
        //Los números pedidos forman parte de la clase BoletoClass
    }
    
}
