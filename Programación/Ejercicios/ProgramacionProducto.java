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
public class ProgramacionProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
         String entrada;
         boolean continuar = true;
         final int MAX_CLI = 2;
         Producto arrayProductos[] = new Producto[MAX_CLI];
         int cont = 0;
         int realidad;
         int realidad2 = 3;
         
         do{
            //Opciones
            System.out.println("1. Crear producto 1 ");
            System.out.println("2. Crear producto 2 ");
            System.out.println("3. Aumentar precio producto 1 ");
            System.out.println("4. Aumentar precio producto 2 ");
            System.out.println("5. Rebajar precio producto 1 ");
            System.out.println("6. Rebajar precio producto 2");
            System.out.println("7. Mostrar datos de los productos (de los dos)");
            System.out.println("8. Salir");
            
            sc.reset();
            entrada = sc.next();
            switch (entrada) {
                case "1":
                    System.out.println("");
                    System.out.println("  Primer producto  ");
                    
                    do{
                        realidad = 3;
                        System.out.println("  Descripcion:");
                            String descripcionD = sc.next();
                        if(descripcionD.isEmpty()){
                            realidad--;
                            continue;
                        }
                       
                        System.out.println("  Codigo:");
                            int codigoD = sc.nextInt();
                        if(codigoD <= 0){
                            realidad--;
                            continue;
                          
                        }
                        
                        System.out.println("  Precio:");
                            float precioD = sc.nextFloat();
                        if(precioD <= 0){
                            realidad--;
                        }
                 
                    arrayProductos[cont] = new Producto (descripcionD, codigoD, precioD);
                    }while(realidad != 3);
                    cont++;
                    break;
                    
                case "2":
                    System.out.println("");
                    System.out.println("  Segundo producto  ");
                    
                    do{
                        System.out.println("  Descripcion:");
                            String descripcionC = sc.next();
                        if(descripcionC.length() == 0){
                            realidad2--;
                        }
                        
                        System.out.println("  Codigo:");
                            int codigoC = sc.nextInt();
                        if(codigoC <= 0){
                            realidad2--;
                        }
                            
                        System.out.println("  Precio:");
                            float precioC = sc.nextFloat();
                        if(precioC <= 0){
                            realidad2--;
                        }
                 
                    arrayProductos[cont] = new Producto (descripcionC, codigoC, precioC);
                    }while(realidad2 != 3);
                    cont++;
                    break;
                    
                case "3":
                    System.out.println("Porcentaje a incrementar precio");
                        int porcentaje = sc.nextInt();
                        
                    if(porcentaje > 100 || porcentaje < 1){
                        porcentaje = 0;
                    }
                      // System.out.println(arrayProductos[1].precio - arrayProductos[1].precio * (porcentaje/100));
                       System.out.println(arrayProductos[0].actualizarPrecio(porcentaje, true));
                       
                        
                    break;
                case "4":
                    System.out.println("Porcentaje a incrementar precio");
                        int porcentaje2 = sc.nextInt();
                        
                    if(porcentaje2 > 100 || porcentaje2 < 1){
                        porcentaje2 = 0;
                    }
                        System.out.println(arrayProductos[1].actualizarPrecio(porcentaje2, true));
                        
                    break;
                case "5":
                    System.out.println("Porcentaje a disminuir precio");
                        int disminuir = sc.nextInt();
                        
                    if(disminuir > 100 || disminuir < 1){
                        disminuir = 0;
                    }
                       System.out.println(arrayProductos[0].actualizarPrecio(disminuir, false));
                        
                    break;
                case "6":
                    System.out.println("Porcentaje a disminuir precio");
                        int disminuir2 = sc.nextInt();
                        
                    if(disminuir2 > 100 || disminuir2 < 1){
                        disminuir2 = 0;
                    }
                        System.out.println(arrayProductos[1].actualizarPrecio(disminuir2, false));
                        
                    break;
                case "7":
                    System.out.println("");
                    System.out.println("");
                    
                    System.out.println("Lista de Productos");
                    System.out.println("-----------------");
                    
                    if (cont == 0){
                        System.out.println("No existen clientes a mostrar\n");
                    }
                    else{
                     for (int i=0; i < cont; i++){
                        System.out.println((i+1) + arrayProductos[i].getDescripcion() + ", " + arrayProductos[i].getPrecio()
                       + ", "  + arrayProductos[i].getCodigo());
                        System.out.println("");
                     }
                    }
                    System.out.println("");
                    break;
                case "8":
                    continuar = false;
                   break;
                default:
                    break;
            }
    }while(continuar);
    

  }
}