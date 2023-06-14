/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Banco;
import java.util.Scanner;

/**
 *
 * @author mint
 */
public class BancoLauncher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        String opcion; 
        
        //Oficina
        String direccion = "", codOficina = "", telefonoOf = "", emailOf = "", cp = "", ciudad = "";
        Oficina of = new Oficina(direccion, codOficina, telefonoOf, emailOf, cp, ciudad);
        
        //CuentaBancaria
        String dniCuenta, nombre, emailCuenta, telefonoCuenta, iban;
        float hipotecaMensual;
        
        //Operacion
        String fecha, concepto;
        byte hora;
        float cantidad;
        
        do{
            System.out.println("***************************************");
            System.out.println("***                                 ***");
            System.out.println("**                                   **");
            System.out.println("Programa prototipo de gestión bancaria:");
            System.out.println("               0. Salir                ");
            System.out.println(" 1. Añadir/Modificar datos de oficina  ");
            System.out.println("          2. Añadir cuenta             ");
            System.out.println("          3. Cerrar cuenta             ");
            System.out.println("        4. Buscar una cuenta           ");
            System.out.println("    5. Mostrar todas las cuentas       ");
            System.out.println("Introudzca la opción que desea ejecutar");
            System.out.println("**                                   **");
            System.out.println("***                                 ***");
            System.out.println("***************************************");
            opcion = sc.next();
            sc.reset();
            
            switch (opcion){
                case "0":
                    seguir = false;
                    break;
                case "1":
                    //Recoger datos de oficina
                    System.out.println("Direccion de la oficina");
                    direccion = sc.next();
                    of.setDireccion(direccion);
                    sc.reset();
                    
                    System.out.println("Codigo de oficina");
                    codOficina = sc.next();
                    of.setCodOficina(codOficina);
                    sc.reset();
                    
                    System.out.println("Introduzca telefono de oficina");
                    telefonoOf = sc.next();
                    of.setTelefono(telefonoOf);
                    sc.reset();
                    
                    System.out.println("Email de la oficina");
                    emailOf = sc.next();
                    of.setEmail(emailOf);
                    sc.reset();
                    
                    System.out.println("Codigo de poliza de la oficina");
                    cp = sc.next();
                    of.setCp(cp);
                    sc.reset();
                    
                    System.out.println("Ciudad de la oficina");
                    ciudad = sc.next();
                    of.setCiudad(ciudad);
                    sc.reset();
                    
                    break;
                case "2":
                    System.out.println("***************************************");
                    System.out.println("***                                 ***");
                    System.out.println("**                                   **");
                    System.out.println("   Hay tres tipos de cuenta a elegir:  ");
                    System.out.println("  0. Elegir Cuenta bancaria Ahorro     ");
                    System.out.println("  1. Elegir Cuenta bancaria Hipoteca   ");
                    System.out.println("  2. Elegir Cuenta bancaria Deposito   ");
                    System.out.println("      Cualquiel otra tecla, fuera      ");
                    System.out.println("**                                   **");
                    System.out.println("***                                 ***");
                    System.out.println("***************************************");
                    opcion = sc.next();
                    sc.reset();
                    
                    switch(opcion){
                        case "0":
                            System.out.println("Dni de cuenta:");
                            dniCuenta = sc.next();
                            sc.reset();
                            
                            System.out.println("Nombre de cuenta:");
                            nombre = sc.next();
                            sc.reset();

                            System.out.println("Email de cuenta:");
                            emailCuenta = sc.next();
                            sc.reset();

                            System.out.println("Telefono de cuenta:");
                            telefonoCuenta = sc.next();
                            sc.reset();

                            System.out.println("Iban de cuenta:");
                            iban = sc.next();
                            sc.reset();
                            
                            Ahorro ahorro = new Ahorro(dniCuenta, nombre, emailCuenta, telefonoCuenta, iban);
                            of.añadirCuentaBancaria(ahorro);
                            break;
                        case "1":
                             System.out.println("Dni de cuenta:");
                            dniCuenta = sc.next();
                            sc.reset();
                            
                            System.out.println("Nombre de cuenta:");
                            nombre = sc.next();
                            sc.reset();

                            System.out.println("Email de cuenta:");
                            emailCuenta = sc.next();
                            sc.reset();

                            System.out.println("Telefono de cuenta:");
                            telefonoCuenta = sc.next();
                            sc.reset();

                            System.out.println("Iban de cuenta:");
                            iban = sc.next();
                            sc.reset();
                            
                            System.out.println("Hipoteca mensual de cuenta:");
                            hipotecaMensual = sc.nextFloat();
                            sc.reset();
                            
                            Hipoteca hipoteca = new Hipoteca(dniCuenta, nombre, emailCuenta, telefonoCuenta, iban, hipotecaMensual);
                            of.añadirCuentaBancaria(hipoteca);
                            break;
                        case "2":
                            System.out.println("Dni de cuenta:");
                            dniCuenta = sc.next();
                            sc.reset();
                            
                            System.out.println("Nombre de cuenta:");
                            nombre = sc.next();
                            sc.reset();

                            System.out.println("Email de cuenta:");
                            emailCuenta = sc.next();
                            sc.reset();

                            System.out.println("Telefono de cuenta:");
                            telefonoCuenta = sc.next();
                            sc.reset();

                            System.out.println("Iban de cuenta:");
                            iban = sc.next();
                            sc.reset();
                            
                            Deposito deposito = new Deposito(dniCuenta, nombre, emailCuenta, telefonoCuenta, iban);
                            of.añadirCuentaBancaria(deposito);
                            break;
                        default:
                            break;
                        
                    }
                    break;
                case "3":
                    System.out.println("Elige el iban de la cuenta a cerrar");
                    iban = sc.next();
                    sc.reset();
                    
                    if(of.eliminarCuentaBancaria(iban)){
                        System.out.println("La cuenta ha sido eliminada correctamente");
                    }else{
                        System.out.println("La cuenta no existe o su saldo es negativo");
                    }
                    
                    break;
                case "4":
                    System.out.println("Iban de la cuenta a buscar: ");
                    iban = sc.next();
                    sc.reset();
                    
                    cuentaBancaria cuenta = of.buscarCuentaBancaria(iban);
                    System.out.println("Datos: " + cuenta.getIban() + " " + cuenta.getSaldo());
                    System.out.println("Dios otro main");
                    
                    System.out.println("*********************************************");
                    System.out.println("***                                       ***");
                    System.out.println("**                                         **");
                    System.out.println("             Operaciones posibles:           ");
                    System.out.println("               0. Volver a atrás             ");
                    System.out.println("          1. Retirar dinero de cuenta        ");
                    System.out.println("         2. Ingresar dinero en cuenta        ");
                    System.out.println("3. Transferir dinero de nuestra cuenta a otra");
                    System.out.println("       4. Recibir dinero de otra cuenta      ");
                    System.out.println("              5. Ajustar intereses           ");
                    System.out.println("    6.Calcular retencion mensual hipoteca    ");
                    System.out.println("**                                         **");
                    System.out.println("***                                       ***");
                    System.out.println("*********************************************");
                    opcion = sc.next();
                    sc.reset();
                    
                    switch(opcion){
                        case "0":
       
                            break;
                        case "1":
                            System.out.println("Fecha de operacion:");
                            fecha = sc.next();
                            sc.reset();

                            concepto = "Quitar dinero";

                            System.out.println("Hora de operacion:");
                            hora = sc.nextByte();
                            sc.reset();

                            System.out.println("Cantidad de operacion:");
                            cantidad = sc.nextFloat();
                            sc.reset();
                            
                            if(cantidad > 0){
                                cantidad = -1;
                            }
                                
                            if(cuenta.addOperacion(fecha, concepto, hora, cantidad)){
                                System.out.println("Operación realizada con éxito.");
                            }else{
                                System.out.println("Alguno de los datos introducidos es erróneo.");
                            }
                            break;
                        case "2":
                            System.out.println("Fecha de operacion:");
                            fecha = sc.next();
                            sc.reset();

                            concepto = "Añadir dinero";

                            System.out.println("Hora de operacion:");
                            hora = sc.nextByte();
                            sc.reset();

                            System.out.println("Cantidad de operacion:");
                            cantidad = sc.nextFloat();
                            sc.reset();
                                
                            if(cantidad < 0){
                                cantidad = 1;
                            }
                            if(cuenta.addOperacion(fecha, concepto, hora, cantidad)){
                                System.out.println("Operación realizada con éxito.");
                            }else{
                                System.out.println("Alguno de los datos introducidos es erróneo.");
                            }
                            break;
                        case "3":
                            System.out.println("Fecha de operacion:");
                            fecha = sc.next();
                            sc.reset();

                            System.out.println("Introduzca el iban de la cuenta a la que se va a hacer el ingreso:");
                            concepto = sc.next();
                            sc.reset();

                            System.out.println("Hora de la operacion:");
                            hora = sc.nextByte();
                            sc.reset();

                            System.out.println("Cantidad de la operacion:");
                            cantidad = sc.nextFloat();
                            sc.reset();
                                
                            if(cuenta.addOperacion(fecha, concepto, hora, cantidad)){
                                System.out.println("Operación realizada con éxito.");
                            }else{
                                System.out.println("Alguno de los datos introducidos es erróneo.");
                            }
                            break;
                        case "4":
                            System.out.println("Fecha de operacion:");
                            fecha = sc.next();
                            sc.reset();

                            System.out.println("Introduzca el iban de la cuenta a la que se va a hacer el ingreso:");
                            concepto = sc.next();
                            sc.reset();

                            System.out.println("Hora de operacion:");
                            hora = sc.nextByte();
                            sc.reset();

                            System.out.println("Cantidad de operacion:");
                            cantidad = sc.nextFloat();
                            sc.reset();
                               
                            if(cuenta.addOperacion(fecha, concepto, hora, cantidad)){
                                System.out.println("Operación realizada con éxito.");
                            }else{
                                System.out.println("Alguno de los datos introducidos es erróneo.");
                            }
                            break;
                        case "5":
                            if("class com.politecnicomalaga.banco.Ahorro".equals(cuenta.getClass().toString())){
                                Ahorro miA = (Ahorro) cuenta;
                                miA.ajustarInteres();
                                System.out.println("Listo");  
                                System.out.println("Saldo actual: " + miA.getSaldo());
                            }else if("class com.politecnicomalaga.banco.Deposito".equals(cuenta.getClass().toString())){
                                Deposito miD = (Deposito) cuenta;
                                miD.ajustarInteres();
                                System.out.println("Listo");
                                System.out.println("Saldo actual: " + miD.getSaldo());
                            }else{
                                System.out.println("No se puede con este tipo de cuenta");
                            }   
                            break;
                        case "6":
                            if("class com.politecnicomalaga.banco.Hipoteca".equals(cuenta.getClass().toString())){
                                Hipoteca miH = (Hipoteca) cuenta;
                                miH.cobrarHipoteca();
                                System.out.println("Listo");  
                                System.out.println("Saldo actual: " + miH.getSaldo());
                            }else{
                                System.out.println("No se puede con este tipo de cuenta");
                            }   
                            break;
                        default:
                            break;
                    }
                    break;
                case "5":
                    if(of.listarCuentasBancarias().size() < 1){
                        System.out.println("No hay ninguna cuenta");
                    }else{
                        for(int i = 0; i < of.listarCuentasBancarias().size(); i++){
                            cuentaBancaria cuentas = of.listarCuentasBancarias().get(i); 
                            
                            System.out.println("[" + cuentas.getDniTitular() + ", " + cuentas.getNombre() + ", " + cuentas.getTelefono() + ", " + cuentas.getEmail() + ", " + cuentas.getIban() + "]");
                        }
                    }
                    break;
                 default:
                    sc.close(); //Cierro la entrada de teclado.
                    seguir = false;
                    break;
            }   
        }while(seguir);
        System.out.println("Fin de la aplicación");
    }
}
