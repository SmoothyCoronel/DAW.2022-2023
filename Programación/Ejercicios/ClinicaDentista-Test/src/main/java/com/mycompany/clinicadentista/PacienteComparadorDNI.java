/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.mycompany.clinicadentista;
import java.util.Comparator;
/**
 *
 * @author mint
 */
public class PacienteComparadorDNI implements Comparator <Paciente>{
    
    @Override
    public int compare(Paciente o1, Paciente o2) {
        //TODO auto-generated method stub
        return o1.getsDni().compareTo(o2.getsDni());
    }
    
}
