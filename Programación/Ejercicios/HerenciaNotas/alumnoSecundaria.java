/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personitas;

/**
 *
 * @author mint
 */
public class alumnoSecundaria extends Alumno{
    
    //Constructor
    public alumnoSecundaria(String nombre, String apellido, String dni, String email, String telefono){
        super(nombre, apellido, dni, email, telefono);
    }
    
     @Override
    public boolean pasarCurso(){
    // alum secund pasa si la media de las notas es un 5 y solo tiene 2 suspensos.
    float total = 0;
    float media = 0;
    boolean pasarCurso = false;
    int suspensos = 0;
    
    for(int i = 0; i< misNotas.size(); i++){

        total += misNotas.get(i).getValorNota();
        
        if(misNotas.get(i).getValorNota() < 5){
            suspensos++;
        }
    }
    if (!misNotas.isEmpty()){
        media = total / misNotas.size();
    }
    
    if(media >= 5 && suspensos <= 2){
        pasarCurso = true;
    }
    return pasarCurso;
    }

    void addNotas(ClaseNota calificacion1) {
        misNotas.add(calificacion1);
    }
}
