/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejemplo;



/**
 *
 * @author mint
 */
public class ClienteData {
 
     /**
     * |Cliente| - DNI: String, - Fnac: Int
     * + Int getEdad(); (fecha actual - fecha dada) (if fecha de
     * nacimiento
     */
    //Estado - atributos
    String DNI;
    String nombre;
    String apellidos;
    String direccion;
    String email;
    String Fnacimiento;
    String telefono;
    int    edad;
    
    //Comportamientos - metodos
        
    //Constructor  
    public ClienteData (String DNI, String nombre, String apellidos,String direccion, String email, 
            String Fnacimiento, String telefono){
        
        
        this.DNI         = DNI;
        this.nombre      = nombre;
        this.apellidos   = apellidos;
        this.direccion   = direccion;
        this.email       = email;
        this.Fnacimiento = Fnacimiento;
        this.telefono    = telefono;
          
    }
    // los métodos ‘get’ y ‘set’ de la clase cliente
    public String getDNI(){
        return this.DNI;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public String getEmail(){
        return this.email;
    }
    public String getFNacimiento(){
        return this.Fnacimiento;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getTelefono(){
        return this.telefono;
    }
   
}


   
    

