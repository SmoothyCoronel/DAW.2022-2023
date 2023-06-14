/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author mint
 */
public class Hipoteca extends cuentaBancaria{
    private float hipotecaMensual;
    
    public Hipoteca (String dniTitular, String nombre, String email, String telefono, String iban, float hipotecaMensual){
                    super (dniTitular, nombre, email, telefono, iban);
                    this.hipotecaMensual = hipotecaMensual;
    }
    
     public void cobrarHipoteca(){
        saldo -= hipotecaMensual;
    }
}
