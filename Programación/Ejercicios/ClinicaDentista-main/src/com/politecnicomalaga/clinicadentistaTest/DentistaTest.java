/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.politecnicomalaga.clinicadentistaTest;

import com.politecnicomalaga.clinicadentista.Dentista;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mint
 */
public class DentistaTest {
    static String sDNI;                      //- 11223344A
    static String sNombre;                   //- Jaime 
    static String sApellidos;                //- Manzano
    static String sFechaAlta;                //- 20230117
    static float fPrecioHora;                //- 30.0
    static Dentista d1, d2;
    static String sNombreyApellidos;
    
    @BeforeAll
    public static void DefinirValores(){
         sDNI = "11223344A";
         sNombre = "Santiago";
         sApellidos = "Manzano";
         sFechaAlta = "20230117";
         fPrecioHora = (float) 30.0;
         sNombreyApellidos = null;
         d1 = new Dentista(DentistaTest.sDNI, DentistaTest.sNombre,DentistaTest.sApellidos, DentistaTest.sFechaAlta, DentistaTest.fPrecioHora);
         d2 = new Dentista("a", "a","a", "a", 0);
    }
    
    @Test
    void testConstructor(){
        assertTrue(DentistaTest.sDNI.equals(d1.getsDNI())); 
        assertTrue(DentistaTest.sNombre.equals(d1.getsNombre()));
        assertTrue(DentistaTest.sApellidos.equals(d1.getsApellidos()));
        assertTrue(DentistaTest.sFechaAlta.equals(d1.getsFechaAlta()));
        assertTrue(DentistaTest.fPrecioHora == d1.getfPrecioHora());
        
        sNombreyApellidos = DentistaTest.sNombre + "," + DentistaTest.sApellidos;
        assertTrue(sNombreyApellidos.equals(d1.getsNombre() +","+ d1.getsApellidos()));
    }
    
    @Test
    void testSettersGettes(){
            d2.setfPrecioHora(DentistaTest.fPrecioHora);
            d2.setsDNI(DentistaTest.sDNI);
            d2.setsNombre(DentistaTest.sNombre);
            d2.setsApellidos(DentistaTest.sApellidos);
            d2.setsFechaAlta(DentistaTest.sFechaAlta);
            
            assertTrue(DentistaTest.sDNI.equals(d1.getsDNI()));
            assertTrue(DentistaTest.sNombreyApellidos.equals(d1.getsNombre() +","+ d1.getsApellidos()));
            assertTrue(DentistaTest.sFechaAlta.equals(d1.getsFechaAlta()));
            assertTrue(DentistaTest.fPrecioHora == d1.getfPrecioHora());
        }
    
     
     @Test
        //Realiza el cálculo de horas por el precioHora que cuesta el dentista
	//Por ejemplo, si horas vale 4, y precio es 20, debe devolver 80.0f
	//Si horas es negativo, devuelve 0
	
	public float calculaPresupuesto(int horas) {
		if (horas < 0) {
			return horas*fPrecioHora;
		} else return 0f;
	}
        
    /**
     * Test of calculaPresupuesto method, of class Dentista.
     */
    @Test
    public void testCalculaPresupuesto() {
        int horas = 10;
        assertTrue(d1.calculaPresupuesto(horas) == 300.0f);
        /* Este assetTrue aunque sea correcto, no va a funcionar, ya que en la clase dentista,
        *  en su método calculaPresupuesto, se ha programado que un número de horas menor que cero 
        *  (negativo) será correcto. Lo cual es lo contrario de lo pedido
        *
        *  El resultado devuelto es false, porque la operacion da 0.0f
        */
        
        horas = -1;
        assertTrue(d1.calculaPresupuesto(horas) == 0.0f); 
        /*
        *  En este ejemplo igual, dará falso. Si el método estuviese bien realizado, daría 0.0f en vez de -30.0f, 
        *  que es lo que da
        */
    }

    /**
     * Test of toString method, of class Dentista.
     */
    @Test
    public void testToString() {
    //ToString DENTISTA: {DNI=11223344A,NOMBRE=Jaime Manzano,PRECIO=30.0,FECHAALTA=20230117}    
    assertTrue("DENTISTA: {DNI=11223344A,NOMBRE=Jaime Manzano,PRECIO=30.0,FECHAALTA=20230117}".equals(d1.toString()));
        

    }
	
     
     
    
    
}
