/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package esamenesx;

import java.util.InputMismatchException;
import java.util.Scanner;

    /*
     * Implementa un programa de consola en Java que tenga las siguientes funcionalidades:
     * - Inicializar una tabla de valores de 6x6, con valores double que van desde el 0.0 al
     * 1000.0 sin incluir este último (un valor posible sería 12.044555955372, por ejemplo,
     * pero también el 0.0, o el 999.999999999). Recordad que Math.random devuelve un
     * número double entre el 0.0 y el 1.0 sin incluir este último.
     * - Mostrar en pantalla toda la tabla generada
     * - Mostrar en pantalla el valor máximo generado, el valor mínimo y sus posiciones en
     * las tablas (si se repite el valor máximo o mínimo, se muestra el más cercano a la
     * posición 0,0 de la tabla).
     * - Mostrar en pantalla la media aritmética de cada fila.
     * - Cada funcionalidad será una opción de menú textual y se ejecutará el programa
     * hasta introducir la opción “0” (mostrada en el menú como salir).
     */
public class ArrayMaximos_minimos {
    double tabla6x6[][];
    
    public void GenerarTabla6x6(){
        System.out.println("Se ha creado la tabla");
        tabla6x6 = new double [6][6];
        for(int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++){
                tabla6x6[i][j]=(double)(Math.random()*1000)+1;
            }
        }
        System.out.println("");
    }
    
    public void VisualizarTabla6x6(){
        System.out.println("Tabla creada");
        for(int i = 0; i < 6; i++){
             System.out.println(tabla6x6[i][0] + "  " +tabla6x6[i][1] 
                + "  " +tabla6x6[i][2] + "  " +tabla6x6[i][3] + "  "+tabla6x6[i][4] +
                     "  " +tabla6x6[i][5]);
        }
        System.out.println("");
    }
    
    public void valorMaximo(){
        double maximo = tabla6x6[0][0];
        for (int i=0; i< tabla6x6.length; i++){
            for (int j=0; j< tabla6x6[i].length; j++){
                if (tabla6x6[i][j] > maximo){
                    maximo = tabla6x6[i][j];
                }
            }
        }
        System.out.println("El máximo es: "+ maximo);
    }
    
    public void valorMinimo(){
        double minimo = tabla6x6[0][0];
        for (int i=0; i< tabla6x6.length; i++){
            for (int j=0; j< tabla6x6[i].length; j++){
                if(tabla6x6[i][j] < minimo){
                    minimo = tabla6x6[i][j];
                }
            }
        }
        System.out.println("El mínimo es: "+ minimo);
    }
    
    public void puntuacionMedia(){
        double add = 0.0;
        double add1 = 0.0;
        double add2 = 0.0;
        double add3 = 0.0;
        double add4 = 0.0;
        double add5 = 0.0;
         for (int i = 0; i < 6; i++) {
             add +=  tabla6x6[0][i];
             add1 += tabla6x6[1][i];
             add2 += tabla6x6[2][i];
             add3 += tabla6x6[3][i];
             add4 += tabla6x6[4][i];
             add5 += tabla6x6[5][i];
   
        }
         System.out.println("Primera fila: "+add/6);
         System.out.println("Segunda fila: "+add1/6);
         System.out.println("Tercera fila: "+add2/6);
         System.out.println("Cuarta fila: "+add3/6);
         System.out.println("Quinta fila: "+add4/6);
         System.out.println("Sexta fila: "+add5/6);
         
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
         boolean seguir = true;
            int opcion;
                ArrayMaximos_minimos tabla = new ArrayMaximos_minimos();
         
         System.out.println("Programa para simulación de sensores en malla de 6x6:");
          do{
            //Opciones
            System.out.println("0. Salir ");
            System.out.println("1. Inicializar tabla.");
            System.out.println("2. Mostrar tabla.");
            System.out.println("3. Máximo, Mínimo");
            System.out.println("4. Medias por fila");
            System.out.println("Introduzca la opción que desee ejecutar.");
            
            sc.reset();
            opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    seguir = false;
                case 1:
                    tabla.GenerarTabla6x6();
                    break;
                case 2:
                    System.out.println("Mostrando la tabla..");
                    tabla.VisualizarTabla6x6();
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("El valor máximo es: ");
                    tabla.valorMaximo();
                    System.out.println("");
                    System.out.print("El valor mínimo es: ");
                    tabla.valorMinimo();
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("La puntuación media es: ");
                    tabla.puntuacionMedia();
                    System.out.println("");
                    break;
                case -1:
                    seguir = false;
                    break;
                default: seguir = false;
            }
        }while(seguir);
    } 
    
    private static int leerIntTeclado(Scanner sc) {
		int iOpcion;
		try {
			iOpcion = sc.nextInt();
			sc.nextLine();
		} catch (InputMismatchException e) {
			sc.nextLine();
			return -1;
		}
		return iOpcion;
	}
}
