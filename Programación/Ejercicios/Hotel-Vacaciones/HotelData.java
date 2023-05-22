/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejemplo;

/**
 *
 * @author mint
 */
public class HotelData {

    /**
     * @param args the command line arguments
     */
    //Estado - atributos
        
         String descripcion;
         String nombre;
         String direccionP;
         String email;
         int telefono;
        
        //Comportamientos - metodos
        
        //Constructor       
        public HotelData (String descripcion, String nombre, String direccionP, String email, int telefono){
            this.descripcion = descripcion;
            this.nombre = nombre;
            this.direccionP = direccionP;
            this.email = email;
            this.telefono = telefono;
        }
        
         
                 
             
        // los métodos ‘get’ y ‘set’ de la clase hotel
             public String getDescripcion(){
                 return this.descripcion;
             }    
             
             public String getNombre(){
                 return this.nombre;
             }
             
             public String getDireccionP (){
                 return this.direccionP;
             }
             
             public String getEmail (){
                 return this.email;
             }
             
             public int getTelefono (){
                 return this.telefono;
             }
             
            
    
}
