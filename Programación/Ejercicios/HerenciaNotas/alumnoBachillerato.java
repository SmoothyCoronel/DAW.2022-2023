 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personitas;

/**
 *
 * @author mint
 */
public class alumnoBachillerato extends Alumno{
      //Constructor
    public alumnoBachillerato(String nombre, String apellido, String dni, String email, String telefono){
        super(nombre, apellido, dni, email, telefono);
    }
    
    //Método pasar curso implementado 
     @Override
    public boolean pasarCurso(){
    // alum bach pasa de curso si la nota es 5 y no hay ninguna suspensa.
    float total = 0;
    float media = 0;
    boolean pasarCurso = false;
    int suspensos = 0;
    
    for(int i = 0; i< misNotas.size(); i++){
        
        if(misNotas.get(i).getValorNota() < 5){
            total += misNotas.get(i).getValorNota();
            suspensos++;
        }
    }
    if (!misNotas.isEmpty()){
        media = total / misNotas.size();
    }
    
    if(media >= 5 && suspensos == 0){
        pasarCurso = true;
    }
    return pasarCurso;
    }

    void addNotas(ClaseNota calificacion2) {
        misNotas.add(calificacion2);
    }
}
