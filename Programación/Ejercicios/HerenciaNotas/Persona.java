/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personitas;

    // crear una clase persona con los siguientes atributos:
    // nombre, apellido, dni, email, tfno, getters, setters, toString.
    // metodo abstract: pasarCurso, boolean.
   
    // despues, programar alumno,heredan alumnoPrimaria, alumnoSecundaria, alumnoBachillerato.
    // alumno es una persona, tiene una lista de notas, claseNota es un string asignatura y un float valorNota (0-10).
    // pasarCurso es abstract en alumno, es clase abstract, y se implementa en alumnoprimaria , secundaria y  bachillerato.
    // alumn primaria pasa de curso si la media de las notas es mayor de 3,5.
    // alum secund pasa si la media de las notas es un 5 y solo tiene 2 suspensos.
    // alum bach pasa de curso si la nota es 5 y no hay ninguna suspensa.
    //crear asignatura y añadir nota.
    // que te diga si el alumno pasa o no.

public abstract class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private String email;
    private String telefono;
    
    //Constructor
    public Persona(String nombre, String apellido, String dni, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
    }
    
    //Constructor CSV
    public Persona(String sCSV) {
        //Cliente;%s;%s;%s;%s;%s;%s;%s;%s\n
		String[] lineas = sCSV.split("\n");
                String[] columnas = lineas[0].split(";");
                
                if (columnas[0].equals("Persona")) {
			this.nombre = columnas[1];
			this.apellido = columnas[2];
			this.dni = columnas[3];
			this.email = columnas[4];
			this.telefono = columnas[5];
		} else {
                        return;
		}  
    } 
    
    //Método abstract pasar curso, boolean
    abstract public boolean pasarCurso();
    
    //Getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    //Método toString
    @Override
    public String toString(){
        return String.format("%s;%s;%s;%s;%s\n", nombre, apellido, dni, 
                email, telefono);
    }
    
    //Método toCSV
    public String toCSV() {
        String resultado = String.format("Persona;%s;%s;%s;%s;%s\n", nombre, apellido, dni, 
                email, telefono);
		return resultado;
	
    }
}
