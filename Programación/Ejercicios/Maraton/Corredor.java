/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maraton;

import java.util.ArrayList;

/**
 * También desarrollaremos una clase Corredor, que tendrá su nombre, apellidos, dni, teléfono
 * y email, y una lista con las carreras en las que ha participado, con un constructor para
 * inicializar los parámetros (al principio las carreras cuando se crea un corredor están vacías),
 * getters (excepto para la lista), setters “al uso” para los datos básicos (NO PARA LA LISTA),
 * y tendrá los métodos:
 * Añadir carrera: public boolean addCarrera(String codigo, int distancia, int segundos,
 * byte pendiente, short dorsal). Este método añadirá una nueva carrera al corredor
 * siempre que los datos sean adecuados (strings no vacíos y valores positivos y
 * dentro del rango si lo hay). En ese caso devolverá true. Si hay errores, false.
 **/
public class Corredor {
    private String nombre;
    private String apellidos;
    private String dni;
    private String telefono;
    private String email;
    private ArrayList<Carrera> listaCarreras;

    //Constructor
    public Corredor(String nombre, String apellidos, String dni, String telefono, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        listaCarreras = new ArrayList<>();
    }
    //Método añadir carrera
    public boolean addCarrera(String codigo, int distancia, int segundos, byte pendiente, short dorsal){
        boolean puntos = true;
            if (codigo.length() > 4){
                puntos = false;
            }
        
            if (pendiente <= 0 && pendiente >= 100 ){
                puntos = false;
            }
            if (dorsal <= 100 && dorsal >= 999){
                puntos = false;
            }
            
            if(puntos == true){
                listaCarreras.add(new Carrera(codigo, distancia, segundos, pendiente, dorsal));
                return true;
            }
        return false;
    }
    
    //Método buscar carrera
    public Carrera buscarCarrera(String codigo){
        for(int i = 0; i < listaCarreras.size(); i++){
            Carrera cr = listaCarreras.get(i);
            if(cr.getCodigo().equals(codigo)){
                return cr;
            }
        }
        return null;
    }
    
    //Método mostrar carreras    
    public String[] mostrarCarreras(){
        String[] resultado = new String[listaCarreras.size()];
        
        for(int i = 0; i < listaCarreras.size(); i++){
            Carrera cr = listaCarreras.get(i);
            resultado[i] = cr.toString();
        }
        return resultado;
    }
    
    //Getters
    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getDni() {
        return dni;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getEmail() {
        return email;
    }
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Carrera> getListaCarreras() {
        return listaCarreras;
    }

    public void setListaCarreras(ArrayList<Carrera> listaCarreras) {
        this.listaCarreras = listaCarreras;
    }
    
    
    
}
