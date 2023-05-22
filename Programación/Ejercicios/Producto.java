/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejemplo;

/**
 *
 * @author mint
 */
public class Producto {
    String descripcion;
    int codigo;
    float precio;
    
    public Producto(String descripcion, int codigo, float precio){
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.precio = precio;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public float getPrecio(){
        return this.precio;
    }
    
    public float actualizarPrecio(int parPorcentaje, boolean parIncrementar)
    {
        if( parIncrementar)
             precio = precio +  precio * parPorcentaje/100;
        else
            precio = precio -  precio * parPorcentaje/100;
            
        return precio;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
