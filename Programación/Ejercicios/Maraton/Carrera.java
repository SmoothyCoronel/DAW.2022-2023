/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maraton;

/**
 * Para un prototipo que queremos desarrollar necesitamos programar la clase Carrera, que
 * tiene como atributos código (son 4 caracteres alfanuméricos, como “AS34” o “G672”),
 * distancia (en metros), tiempo (en segundos, aunque represente varias horas y minutos),
 * pendienteMedia (valor entre 0 y 10) y dorsal (número entre 100 y 999) y que tendrá un
 * constructor que inicializará todos los atributos pidiendo valores mediante parámetros, los
 * getter y no tendrá setters (no son necesarios)
 */
public class Carrera {
    public enum AtributosCarrera {CODIGO, DISTANCIA, TIEMPO, PENDIENTE, DORSAL};
    protected String codigo; //Cuatro caracteres
    protected int distancia; //En metros
    protected int tiempo; //En segundos
    protected byte pendienteMedia; //Valor entre 0 y  10
    protected short dorsal; //Entre 100 y 999

    //Constructor
    public Carrera(String codigo, int distancia, int tiempo, byte pendienteMedia, short dorsal) {
        this.codigo = codigo;
        this.distancia = distancia;
        this.tiempo = tiempo;
        this.pendienteMedia = pendienteMedia;
        this.dorsal = dorsal;
    }

    //Getters
    public String getCodigo() {
        return codigo;
    }
    public int getDistancia() {
        return distancia;
    }
    public int getTiempo() {
        return tiempo;
    }
    public int getPendienteMedia() {
        return pendienteMedia;
    }
    public int getDorsal() {
        return dorsal;
    }
    
    //Método toString
    @Override
    public String toString(){
       // return String.format("%4s;%d;%d;%2d;%3d\n", codigo, distancia, tiempo, 
       //pendienteMedia, dorsal);
        String cadena = codigo + "->" + distancia + ", " + tiempo + ", " + pendienteMedia + "," + dorsal + "\n";
        return cadena;
            /*
            “$codigo -> $distancia metros, $tiempo * seg, $pendienteMedia %, Dorsal: $dorsal”
            */
        
        
        
    }
}
