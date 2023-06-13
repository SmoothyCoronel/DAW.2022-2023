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
        
        
        @BeforeAll
        public static void definirValores(){
            scod = "123AW9";
            sdesc = "Implante dental unitario";
            sfecha = "13/06/2023";
            fprecio = 10000;
            bcobrado = false;
        }
        
        @Test
        void testConstructor(){
            Implante i = new Implante(ImplanteTest.scod, ImplanteTest.sdesc, ImplanteTest.sfecha, ImplanteTest.fprecio);
            assertTrue(ImplanteTest.scod.equals(i.getsCod()));
            assertTrue(ImplanteTest.sdesc.equals(i.getsDescripcion()));
            assertTrue(ImplanteTest.sfecha.equals(i.getsFecha()));
            assertTrue(ImplanteTest.fprecio == i.getfPrecio());
        }
        
        @Test
        void testSettersGettes(){
            Implante i = new Implante("a", "a", "a",  0f);
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
        if(ImplanteTest.fprecio == 0){
            assertTrue(ImplanteTest.bcobrado = true);
        } else{
            ImplanteTest.bcobrado = false;
        }
    }

    /**
     * Test of setbCobrado method, of class Implante.
     */
    @Test
    public void testSetbCobrado() {
        Implante i = new Implante("a", "a", "a",  0f);
        if(ImplanteTest.fprecio != 0){
            i.setbCobrado(ImplanteTest.bcobrado = false);
        }else{
            i.setbCobrado(ImplanteTest.bcobrado = true);
        }
        
    }


    
}
