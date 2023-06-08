/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personitas;

/**
 *
 * @author mint
 */
public class alumnoPrimaria extends Alumno{
    
    //Constructor
    public alumnoPrimaria(String nombre, String apellido, String dni, String email, String telefono){
        super(nombre, apellido, dni, email, telefono);
    }
    
    //Método pasar curso implementado
    
    @Override
    public boolean pasarCurso(){
    // alumn primaria pasa de curso si la media de las notas es mayor de 3,5. 
    float total = 0;
    float media = 0;
    boolean pasarCurso = false;
    
    for(int i = 0; i< misNotas.size(); i++){

        total += misNotas.get(i).getValorNota();
    }
    if (!misNotas.isEmpty()){
        media = total / misNotas.size();
    }
    
    if(media > 3.5){
        pasarCurso = true;
    }
    return pasarCurso;
    }

    void addNotas(ClaseNota calificacion) {
        misNotas.add(calificacion);
    }

}
