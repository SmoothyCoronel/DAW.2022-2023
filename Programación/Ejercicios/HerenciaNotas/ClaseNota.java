/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personitas;

/**
 *
 * @author mint
 */
public class ClaseNota {
    private String asignatura;
    private float valorNota;
    
    //Constructor
    public ClaseNota(String asignatura, float valorNota) {
        this.asignatura = asignatura;
        this.valorNota = valorNota;
    }
    
    //Getter y setter
    public String getAsignatura() {
        return asignatura;
    }
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public float getValorNota() {
        return valorNota;
    }
    public void setValorNota(float valorNota) {
        if(valorNota >= 0 && valorNota <= 10){
            this.valorNota = valorNota;
        }else{
            this.valorNota = -1;
        }
    }
    
}
