/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.politecnicomalaga.clinicadentistaTest;

import com.politecnicomalaga.clinicadentista.Implante;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mint
 */
public class ImplanteTest {
        static String scod;         //= 123AW9
	static String sdesc; //= Implante dental unitario
	static String sfecha;       //= 13/06/2023
	static float fprecio;       //= 10000f
	static boolean bcobrado;
	static Implante i,i2;
        
        
        @BeforeAll
        public static void definirValores(){
            scod = "123AW9";
            sdesc = "Implante dental unitario";
            sfecha = "13/06/2023";
            fprecio = 10000;
            bcobrado = false;
	    i = new Implante("a", "a", "a",  0f);
	    i2 = new Implante(ImplanteTest.scod, ImplanteTest.sdesc, ImplanteTest.sfecha, ImplanteTest.fprecio);
        }
        
        @Test
        void testConstructor(){
            assertTrue(ImplanteTest.scod.equals(i2.getsCod()));
            assertTrue(ImplanteTest.sdesc.equals(i2.getsDescripcion()));
            assertTrue(ImplanteTest.sfecha.equals(i2.getsFecha()));
            assertTrue(ImplanteTest.fprecio == i2.getfPrecio());
        }
        
        @Test
        void testSettersGettes(){
            i.setfPrecio(ImplanteTest.fprecio);
            i.setsCod(ImplanteTest.scod);
            i.setsDescripcion(ImplanteTest.sdesc);
            i.setsFecha(ImplanteTest.sdesc);
            
            assertTrue(ImplanteTest.scod.equals(i.getsCod()));
            assertTrue(ImplanteTest.sdesc.equals(i.getsDescripcion()));
            assertTrue(ImplanteTest.sfecha.equals(i.getsFecha()));
            assertTrue(ImplanteTest.fprecio == i.getfPrecio());
        }
    

    /**
     * Test of isbCobrado method, of class Implante.
     */
    @Test
    public void testIsbCobrado() {
        //Activar: está ya hecho en el beforeAll
	//Actuar: el constructor hace la asignación a bCobrado que considere necesaria
	//Asserts ...

	//Voy a probar el objeto i. Como el precio está a 0, debde de estar cobrado == true
	assertTrue(i.isbCobrado());
	//Voy a probar el objeto i2. Como vale 10000, no debe de estar cobrado
	assertFalse(i2.isbCobrado()); //podría poner assertTrue(!i2.isbCobrado())
    }

    /**
     * Test of setbCobrado method, of class Implante.
     */
    @Test
    public void testSetbCobrado() {
     //Voy a cambiarle el valor del precio de Implante i al de Implante i2
     //En i bCobrado == True, en i2 bCobrado == False
     //Vamos a comprobar que al cambiarlos bCobrado sea False
     i.setfPrecio(i2.getfPrecio());

     //Tiene que dar bCobrado == False
     assertTrue(i.isbCobrado());

     //Para comprobar también Implante i2
     //Voy a cambiar el valor de su precio a -1
     //Así voy a comprobar que el constructor de Implante lo cambie a 0 y bCobrado sea True
     i2.setfPrecio(-1);
     assertTrue(i2.isbCobrado);
    }


    
}
