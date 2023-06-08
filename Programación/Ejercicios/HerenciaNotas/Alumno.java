/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personitas;
import java.util.ArrayList;

 //despues, programar alumno,heredan alumnoPrimaria, alumnoSecundaria, alumnoBachillerato.
 //alumno es una persona, tiene una lista de notas, claseNota es un string asignatura y un float valorNota (0-10).
 //pasarCurso es abstract en alumno, es clase abstract, y se implementa en alumnoprimaria , secundaria y  bachillerato.
public abstract class Alumno extends Persona{
    
    public ArrayList<ClaseNota> misNotas;
    
    //Constructor
    public Alumno(String nombre, String apellido, String dni, String email, String telefono){
                super(nombre, apellido, dni, email, telefono);
            misNotas = new ArrayList<>();
    }
    
    //Constructor CSV
    
    
    //Clase abstract
    @Override
    abstract public boolean pasarCurso();
    
}
