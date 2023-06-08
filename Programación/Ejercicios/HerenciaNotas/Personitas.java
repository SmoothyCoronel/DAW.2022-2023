/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personitas;

public class Personitas {
 static alumnoPrimaria A;
 static alumnoSecundaria B;
 static alumnoBachillerato C;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Alumno primaria
        ClaseNota calificacion = new ClaseNota("Sociales", (float) 6.5);
        boolean alumnoA = false;
        alumnoA = Personitas.nuevoAlumno("Juan", "DelMonte", "123432A", "jmonte@gmail.com", "98754231", 1);
        A.addNotas(calificacion);
        
        calificacion = new ClaseNota("Sociales", (float) 1.5);
        A.addNotas(calificacion);
        
        calificacion= new ClaseNota("Sociales", (float) 9.5);
        A.addNotas(calificacion);
        
        if( A.pasarCurso() == true )
            System.out.println("Alumno primaria: Paso curso");
        else
            System.out.println("Alumno primaria: No Paso curso");
        
        //Alumno secundaria
        ClaseNota calificacion1 = new ClaseNota("Sociales", (float) 10);
        boolean alumnoB = false;
        alumnoB = Personitas.nuevoAlumno("Juan", "DelMonte", "123432A", "jmonte@gmail.com", "98754231", 2);
        B.addNotas(calificacion1);
        
        calificacion1 = new ClaseNota("Sociales", (float) 4.9);
        B.addNotas(calificacion1);
        
        calificacion1 = new ClaseNota("Sociales", (float) 4.9);
        B.addNotas(calificacion1);
        
        if( B.pasarCurso() == true )
            System.out.println("Alumno Secundaria: Paso curso");
        else
            System.out.println("Alumno Secundaria: No Paso curso");
        
        //Alumno bachillerato
        ClaseNota calificacion2 = new ClaseNota("Sociales", (float) 10);
        boolean alumnoC = false;
        alumnoC = Personitas.nuevoAlumno("Juan", "DelMonte", "123432A", "jmonte@gmail.com", "98754231", 3);
        C.addNotas(calificacion2);
        
        calificacion2 = new ClaseNota("Sociales", (float) 5.9);
        C.addNotas(calificacion2);
        
        calificacion2 = new ClaseNota("Sociales", (float) 4.9);
        C.addNotas(calificacion2);
        
        if( C.pasarCurso() == true )
            System.out.println("Alumno Secundaria: Paso curso");
        else
            System.out.println("Alumno Secundaria: No Paso curso");
        
        
/*        Scanner sc = new Scanner(System.in);
		boolean seguir = true;
		int opcion;

		do {
			// menú principal

			// mostrar menú
			mostrarMenuPrincipal();
			opcion = leerIntTeclado(sc);
			
				switch (opcion) {
				case 1:
                                    boolean alumnoA = false;
                                    alumnoA = Personitas.nuevoAlumno("Juan", "DelMonte", "123432A", "jmonte@gmail.com", "98754231", 1);
					if (alumnoA == true){
                                            ClaseNota calificacion = new ClaseNota("Sociales", (float) 6.5);
                                            A.addNotas(calificacion);
                                            calificacion = new ClaseNota("Fisica", (float) 7.5);
                                            A.addNotas(calificacion);
                                            calificacion = new ClaseNota("Ciencia", (float) 6.5);
                                            A.addNotas(calificacion);
                                            boolean paso = A.pasarCurso();
                                        }
                                        Personitas.nuevoAlumno("Juan", "DelMonte", "123432A", "jmonte@gmail.com", "98754231", 2);
                                        Personitas.nuevoAlumno("Juan", "DelMonte", "123432A", "jmonte@gmail.com", "98754231", 3);
                                        
					break;

				case 2:
					

					break;
				case 3:
					

					break;
				default:
					seguir = false;
				}
			
		} while (seguir);
		System.out.println("Fin de la aplicación"); 
    }
    private static void mostrarMenuPrincipal() {
		System.out.println("\nMenú Puntuaje del alumnado");
		System.out.println("-------------------------------------------------\n");
		System.out.println("1. Crear nuevo alumno");
		System.out.println("2. Eliminar alumno existente");
		System.out.println("3. Actualizar alumno existente");
                
		//System.out.println("7. Grabar a disco");
		//System.out.println("8. Leer de disco");
                
		System.out.println("Cualquier otra opción: Salir");
                */

    }
   
    public static boolean nuevoAlumno(String nombre, String apellido, String dni, String email, String telefono, int eleccion){
        
        switch (eleccion) {
            case 1:
                A = new alumnoPrimaria(nombre, apellido, dni, email, telefono);
                return true;
            case 2:
                B = new alumnoSecundaria(nombre, apellido, dni, email, telefono);
                return true;
            case 3:
                C = new alumnoBachillerato(nombre, apellido, dni, email, telefono);
                return true;
            default:
                return false;
        }
    }
    
}
