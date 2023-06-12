/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Maraton;

import java.util.Scanner;

/**
 *
 * @author mint
 */
public class MainAtletismo {

    /**
     * Realiza las dos clases y una clase MainAtletismo con un método de entrada “main” que
     * ejecute el siguiente menú texto:
     * Gestión de carreras
     * 0. Salir
     * 1. Añadir/Modificar datos corredor.
     * 2. Añadir carrera.
     * 3. Mostrar todas las carreras.
     * 4. Buscar carrera.
     * 
     *Introduzca la opción que desee ejecutar.
     * 
     * Cuando se seleccione Añadir/modificar datos corredor se actualizarán o crearán los datos
     * del corredor (solo gestionamos UN corredor en nuestro prototipo). Con añadir carrera
     * pediremos los datos de la carrera y la añadiremos mostrando por pantalla si ha ido todo
     * bien. En mostrar todas las carreras podrá salir “sin carreras todavía” o la lista de carreras
     * por pantalla. En buscar carrera pediremos el código de carrera dando como resultado “No
     * encontrada” o los datos de la carrera correspondiente.
     **/
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        boolean menu = true;
        String opcion;
        
        //Corredor
        String nombre = "", apellidos = "", dni = "", telefono = "", email = "";
        Corredor corredor = new Corredor(nombre, apellidos, dni, telefono, email);
        
        //Carrera
        String codigo = "";
        int distancia = 0;
        int tiempo = 0;
        byte pendienteMedia = 0;
        short dorsal = 0;
        Carrera carrera = new Carrera(codigo, distancia, tiempo, pendienteMedia, dorsal);
        
        while(menu){
            System.out.println("***************************************");
            System.out.println("***                                 ***");
            System.out.println("**                                   **");
            System.out.println("               0. Salir                ");
            System.out.println("  1. Añadir/Modificar datos corredor   ");
            System.out.println("          2. Añadir carrera            ");
            System.out.println("    3. Mostrar todas las carreras      ");
            System.out.println("         4. Buscar carrera.            ");
            System.out.println("Introudzca la opción que desea ejecutar");
            System.out.println("**                                   **");
            System.out.println("***                                 ***");
            System.out.println("***************************************");
            
            opcion = sc.next();
            sc.reset();
            
            switch (opcion){
                case "0":
                    menu = false;
                    break;
                case "1":
                            //String nombre, String apellidos, String dni, String telefono, String email
                             System.out.println("Introduzca nombre de corredor");
                             nombre = sc.next();
                             corredor.setNombre(nombre);
                             sc.reset();
                             
                             System.out.println("Introduzca apellidos de corredor");
                             apellidos = sc.next();
                             corredor.setApellidos(apellidos);
                             sc.reset();
                             
                             System.out.println("Introduzca dni de corredor");
                             dni = sc.next();
                             corredor.setDni(dni);
                             sc.reset();
                             
                             System.out.println("Introduzca telefono de corredor");
                             telefono = sc.next();
                             corredor.setTelefono(telefono);
                             sc.reset();
                             
                             System.out.println("Introduzca email de corredor");
                             email = sc.next();
                             corredor.setEmail(email);
                             sc.reset();
                    break;
                case "2":
                    //String codigo, int distancia, int tiempo, byte pendienteMedia, short dorsal
                    System.out.println("Introduzca codigo");
                    codigo = sc.next();
                    sc.reset();
                    
                    System.out.println("Introduzca distancia");
                    distancia = sc.nextInt();
                    sc.reset();
                    
                    System.out.println("Introduzca tiempo");
                    tiempo = sc.nextInt();
                    sc.reset();
                    
                    System.out.println("Introduzca pendiente media");
                    pendienteMedia = sc.nextByte();
                    sc.reset();
                    
                    System.out.println("Introduzca dorsal");
                    dorsal = sc.nextShort();
                    sc.reset();
                    
                    corredor.addCarrera(codigo, distancia, tiempo, pendienteMedia, dorsal);
                    break;
                case "3":
                    if (corredor.getListaCarreras().size() < 1){
                        System.out.println("Aún no se ha hecho ninguna carrera");
                    }else{
                            corredor.mostrarCarreras();
                    }
                    break;
                case "4":
                    System.out.println("Introduzca el codigo de la cuenta a buscar");
                    codigo = sc.next(); 
                    sc.reset();
                    Carrera cr = corredor.buscarCarrera(codigo);
                    
                    System.out.println("Carrera buscada: " + cr);
                    
                    break;
                    
                default:
                    System.out.println("El número introducido no es correcto");
                    break;
            }
        }
    }
    
}
