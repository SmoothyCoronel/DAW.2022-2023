/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;
import java.util.ArrayList;

/**
 *
 * @author mint
 */
public class Oficina {
    private String direccion, codOficina, telefono, email, cp, ciudad;
    
    private ArrayList<cuentaBancaria> listaCuentas;
    
    //Constructor
    public Oficina(String direccion, String codOficina, String telefono, String email, String cp, String ciudad) {
        this.direccion = direccion;
        this.codOficina = codOficina;
        this.telefono = telefono;
        this.email = email;
        this.cp = cp;
        this.ciudad = ciudad;
        this.listaCuentas = new ArrayList<>();
    }
    
    //CRUD de cuentas bancarias
    public cuentaBancaria buscarCuentaBancaria(String iban){
        for(int i = 0; i < listaCuentas.size(); i++){
            cuentaBancaria cuenta = listaCuentas.get(i);         
            if(cuenta.getIban().equals(iban)){
                return cuenta;
            }
        }
        return null;
    }
    
      public ArrayList<cuentaBancaria> listarCuentasBancarias(){
        
        return listaCuentas;
    }
      
      public boolean añadirCuentaBancaria(cuentaBancaria cuenta){
        this.listaCuentas.add(cuenta);
        return true;
    }
      
      public boolean eliminarCuentaBancaria(String iban){
        for(int i = 0; i < listaCuentas.size(); i++){
            cuentaBancaria cuenta = listaCuentas.get(i); 
            if(cuenta.getIban().equals(iban)){
                if(cuenta.getSaldo() < 0){
                    return false;
                }else{
                    listaCuentas.remove(i);
                    return true;
                }                
            }
        }
        return false;
    }
      
    //getters y setters

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodOficina() {
        return codOficina;
    }
    public void setCodOficina(String codOficina) {
        this.codOficina = codOficina;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getCp() {
        return cp;
    }
    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<cuentaBancaria> getListaCuentas() {
        return listaCuentas;
    }
    public void setListaCuentas(ArrayList<cuentaBancaria> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }
      
}
