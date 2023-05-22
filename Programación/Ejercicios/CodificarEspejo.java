/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejemplo;

import java.util.Scanner;

/**
 *
 * @author mint
 */
public class CodificarEspejo {
    String behind;

    public CodificarEspejo(String behind) {
        this.behind = behind;
    }

    public String getReves() {
        return behind;
    }

    
    public String codifica (){
        String resultado ="";
        int space = -1;
        do{
            space = behind.indexOf(" ");
            if(space > 0){
                String aux = behind.substring(0,space);
                for(int i = aux.length(); i > 0; i--){
                    resultado = resultado + aux.substring(i-1,i) ;
                 }
                resultado = resultado + " ";
                behind = behind.substring(space +1);
            }
        }while(space > 0);
        
        for(int i = behind.length(); i > 0; i--){
           resultado = resultado + behind.substring(i-1,i) ;
        }
        
        return resultado;
    }
    
    //CharAt()
    //codePointAt()
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dame una frase a cambiar");
        String mainFrase = sc.nextLine();
        CodificarEspejo codificar = new CodificarEspejo(mainFrase);
        System.out.println("Frase cambiada: " + codificar.codifica());
        
        
    }
    
}
