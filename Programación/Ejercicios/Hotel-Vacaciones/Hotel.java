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
public class Hotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
         String entrada;
         final int MAX_CLI = 20;
         boolean continuar = true;
         ClienteData arrayObjectos[] = new ClienteData[MAX_CLI];
         int cont = 0;
         
        
        
        do{
            //Opciones
            System.out.println("1. Mostrar datos hotel ");
            System.out.println("2. Mostrar lista de clientes");
            System.out.println("3. Buscar cliente por nombre");
            System.out.println("4. Buscar cliente por Email");
            System.out.println("5. Buscar cliente por telefono");
            System.out.println("6. Crear cliente");
            System.out.println("7. Actualizar cliente");
            System.out.println("8. Eliminar cliente");
            System.out.println("9. Crear promoción en cliente");
            System.out.println("10. Salir");
            
            sc.reset();
            entrada = sc.nextLine();
            switch (entrada) {
                case "1":
                    
                    HotelData hotel1;
                    hotel1 = new HotelData("Vacaciones en la costa del sol","Hotel trivago",
                            "C/miraflores","hotelT@gmail.com",98747823);

                    System.out.println("Descripcion: " + hotel1.getDescripcion());
                    System.out.println("Nombre de hotel: " + hotel1.getNombre());
                    System.out.println("Dirección de hotel: " + hotel1.getDireccionP());
                    System.out.println("Email de hotel: " + hotel1.getEmail());
                    System.out.println("Telefono de hotel: " + hotel1.getTelefono());
                    System.out.println("");
                    
                    break;
                case "2":
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    
                    System.out.println("Lista de clientes");
                    System.out.println("-----------------");
                    if (cont == 0){
                        System.out.println("No existen clientes a mostrar\n");
                    }
                    else{
                     for (int i=0; i < cont; i++){
                        System.out.println((i+1) + arrayObjectos[i].DNI + arrayObjectos[i].nombre +
                                arrayObjectos[i].apellidos +"," +arrayObjectos[i].email + ", " + arrayObjectos[i].direccion + 
                                arrayObjectos[i].telefono);
                     }
                    }
                    System.out.println("");
                    System.out.println("");
                    break;
                case "3":
                    System.out.println("");
                    System.out.println("Busqueda de cliente por nombre");
                    System.out.println("------------------------------");
                    
                    System.out.println("¿Cuál es su nombre?");
                    String Name = sc.nextLine();
                    if (cont == 0){
                        System.out.println("No se ha registrado ningún cliente aún");
                    }
                    else{
                    
                    for(int i = 0; i < cont; i++){
                        if (Name.equals(arrayObjectos[i].nombre)){
                            System.out.println("Sus datos: "+ arrayObjectos[i].apellidos + "," + arrayObjectos[i].DNI + "," + arrayObjectos[i].email 
                        + arrayObjectos[i].direccion + "," + arrayObjectos[i].Fnacimiento);
                        }
                        
                     }
                    }
                    //NombreData
                    System.out.println("");
                    System.out.println("");
                    
                    break;
                case "4":
                    System.out.println("");
                    System.out.println("Buscar cliente por email");
                    System.out.println("------------------------");
                    
                    System.out.println("¿Cual es tu email de cliente?");
                    String Mail = sc.nextLine();
                    if (cont == 0){
                        System.out.println("No se ha registrado ningún cliente aún");
                    }
                    else{
                    
                    for(int i = 0; i < cont; i++){
                        if (Mail.equals(arrayObjectos[i].email)){
                            System.out.println("Sus datos: "+ arrayObjectos[i].nombre + arrayObjectos[i].apellidos + "," + arrayObjectos[i].DNI + "," 
                        + arrayObjectos[i].direccion + "," + arrayObjectos[i].Fnacimiento);
                        }
                        
                     }
                    }
                    
                    System.out.println("");
                    System.out.println("");
                    
                    break;
                case "5":
                    System.out.println("");
                    System.out.println("Buscar cliente por teléfono");
                    System.out.println("------------------------");
                    
                    System.out.println("¿Cual es tu teléfono de cliente?");
                    String Phone = sc.nextLine();
                    if (cont == 0){
                        System.out.println("No se ha registrado ningún cliente aún");
                    }
                    else{
                    
                    for(int i = 0; i < cont; i++){
                        if (Phone.equals(arrayObjectos[i].telefono)){
                            System.out.println("Sus datos: "+ arrayObjectos[i].nombre + arrayObjectos[i].apellidos + "," + arrayObjectos[i].DNI + "," 
                        + arrayObjectos[i].direccion + "," + arrayObjectos[i].Fnacimiento);
                        }
                        
                     }
                    }
                
                    break;
                case "6":
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("  DATOS DEL CLIENTE  ");
                    System.out.println("    Cliente DNI:");
                    String DNIData = sc.nextLine();
                    
                    System.out.println("    Cliente Nombre:");
                    String NombreData = sc.nextLine();
                            
                    System.out.println("    Cliente Apellidos:");
                    String ApellidosData = sc.nextLine();
                 
                    
                    System.out.println("    Cliente Dirección:");
                    String DireccionData = sc.nextLine();
                    
                    System.out.println("    Cliente Email:");
                    String EmailData = sc.nextLine();
                    
                    System.out.println("    Cliente Fecha de nacimiento (yyyy-mm-dd) :");
                    String NacimientoData = sc.nextLine();
                    
                    System.out.println("      Cliente teléfono");
                    String TelefonoData = sc.nextLine();
                    
                    arrayObjectos[cont] = new ClienteData(DNIData, NombreData, ApellidosData,DireccionData, EmailData, 
                   NacimientoData, TelefonoData);
                    cont++;
                    System.out.println("");
                    System.out.println("");
                    
                    
                    break;
                case "7":
                     System.out.println("");
                     System.out.println("Actualizar cliente");
                     System.out.println("------------------");
                     
                     System.out.println("¿Que DNI actualizas?"); 
                     String Dni = sc.nextLine();
                     
                     if (cont == 0){
                        System.out.println("No se ha registrado ningún cliente aún");
                    }
                    else{
                    
                    for(int i = 0; i < cont; i++){
                        if (Dni.equals(arrayObjectos[i].DNI)){
                            System.out.println("Sus datos: "+ arrayObjectos[i].nombre + arrayObjectos[i].apellidos  + "," 
                        + arrayObjectos[i].direccion + "," + arrayObjectos[i].email + "," + arrayObjectos[i].Fnacimiento + "," + arrayObjectos[i].telefono);
                            
                        System.out.println("Cambia los datos deseados: ");
                        System.out.println("");
                        System.out.println("Cambiar nombre: ");
                        String NombreChange = sc.nextLine();
                        
                        System.out.println("Cambiar apellidos: ");
                        String ApellidosChange = sc.nextLine();
                        
                        System.out.println("Cambiar direccion: ");
                        String DireccionChange = sc.nextLine();
                        
                        System.out.println("Cambiar email");
                        String EmailChange = sc.nextLine();
                        
                        System.out.println("Cambiar Fecha de nacimiento: ");
                        String NacimientoChange = sc.nextLine();
                        
                        System.out.println("Cambiar telefono: ");
                        String TelefonoChange = sc.nextLine();
                        
                        System.out.println("");
                         arrayObjectos[i] = new ClienteData(Dni, NombreChange, ApellidosChange,DireccionChange, EmailChange, 
                   NacimientoChange, TelefonoChange);
                        }
                        
                     }
                    }
                     
                    break;
                case "8":
                   
                    System.out.println("");
                    System.out.println("");
                    System.out.println("  Eliminar cliente  ");
                    System.out.println("");
                    System.out.println(" De su DNI de cliente para la busqueda :");
                    String DNIDelete = sc.nextLine();
                    
                    if (cont == 0){
                        System.out.println("No se ha registrado ningún cliente aún");
                    }
                    else{
                    
                    for(int i = 0; i < cont; i++){
                        if (DNIDelete.equals(arrayObjectos[i].DNI)){
                            arrayObjectos[i] = null;
                        }
                     }
                    }
                    
                    
                    break;
                case "9":
                   
                    break;
                case "10":
                    continuar = false;
            }
            
          }while(continuar);
    }
}
        
    

