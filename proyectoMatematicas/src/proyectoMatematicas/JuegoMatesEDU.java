package proyectoMatematicas;

import java.util.ArrayList;

import proyectoMatematicas.juegos.MayorMenorIgual;
import proyectoMatematicas.usuarios.Administrador;
import proyectoMatematicas.usuarios.Alumno;
import proyectoMatematicas.usuarios.Profesor;
import proyectoMatematicas.usuarios.Usuario;

public class JuegoMatesEDU {

	public static ArrayList<Usuario> arrayUsuarios;
	public static Usuario usuario;
	private static void escribirMenuInicial() {
		System.out.println("+----------------------------------------+");
		System.out.println("| 		Maths Class- the game            |");
		System.out.println("+----------------------------------------+");
		System.out.println("\t\t 1. Entrar ");
		System.out.println("\t\t 2. Salir");

	}

	public static boolean lanzarMenuInicial() {
		int opcion = 0;

		// Escribimos el menu
		escribirMenuInicial();

		// Obtenemos la opci贸n
		opcion = Utilidades.leerEntero();

		// Comprobamos que la opci贸n sea alguno de los valores permitidos
		if (opcion == 1) {
			System.out.println("INTRODUCE USUARIO:");
			String nom = Utilidades.leerCadena();
			System.out.println("INTRODUCE CONTRASE袮");
			String cont = Utilidades.leerCadena();

			if (comprobarUsuario(nom, cont, arrayUsuarios) == 1) {
				lanzarMenuAdministrador();
			} else if (comprobarUsuario(nom, cont, arrayUsuarios) == 2) {
				lanzarMenuProfesor();
			} else if (comprobarUsuario(nom, cont, arrayUsuarios) == 3) {
				lanzarMenuAlumno();
			} else
				System.out.println("El usuario introducido no existe");

		}

		if (opcion == 2) {
			System.out.println();
			System.out.println("Gracias por jugar a este juego... ^_^");
			return false;
		}
		return true;
	}

	private static void escribirMenuAdministrador() {
		System.out.println("+----------------------------------------+");
		System.out.println("+       Bienvenido Administrador         +");
		System.out.println("+----------------------------------------+");
		System.out.println("\t\t 1. Crear perfil de profesor ");
		System.out.println("\t\t 2. Borrar perfil de profesor");
		System.out.println("\t\t 3. Modificar perfil de profesor");
		System.out.println("\t\t 4. Consultar listado de profesores");
		System.out.println("\t\t 5. Cerrar sesion");
	}
	private static void escribirMenuProfesor() {
		System.out.println("+----------------------------------------+");
		System.out.println("+        Bienvenido Profesor             +");
		System.out.println("+----------------------------------------+");
		System.out.println("\t\t 1. Crear perfil de alumno ");
		System.out.println("\t\t 2. Borrar perfil de alumno");
		System.out.println("\t\t 3. Modificar perfil de alumno");
		System.out.println("\t\t 4. Consultar listado de alumnos");
		System.out.println("\t\t 5. Cerrar sesion");
	}
	private static void escribirMenuAlumno() {
		System.out.println("+----------------------------------------+");
		System.out.println("+        Bienvenido Alumno             +");
		System.out.println("+----------------------------------------+");
		System.out.println("\t\t 1. Mayor menor igual");
	}

	public static void lanzarMenuAdministrador() {
		int opcion = 0;

		// Escribimos el menu
		escribirMenuAdministrador();

		// Obtenemos la opci贸n
		opcion = Utilidades.leerEntero();

		// Comprobamos que la opci贸n sea alguno de los valores permitidos
		switch (opcion)
		{
			case 1:((Administrador) JuegoMatesEDU.usuario).crearProfesor(JuegoMatesEDU.arrayUsuarios);break;
			case 2:((Administrador) JuegoMatesEDU.usuario).borrarProfesor(JuegoMatesEDU.arrayUsuarios);break; 
			case 3:((Administrador) JuegoMatesEDU.usuario).modificarProfesor(JuegoMatesEDU.arrayUsuarios);break; 
			case 4:((Administrador) JuegoMatesEDU.usuario).listarProfesores(JuegoMatesEDU.arrayUsuarios);break; 
			default: System.out.println();
			System.out.println("Gracias por jugar a este juego... ^_^");
			
		}
		
	}
	public static void lanzarMenuProfesor() {
		int opcion = 0;

		// Escribimos el menu
		escribirMenuProfesor();

		// Obtenemos la opci贸n
		opcion = Utilidades.leerEntero();

		// Comprobamos que la opci贸n sea alguno de los valores permitidos
		switch (opcion)
		{
			case 1:((Profesor) JuegoMatesEDU.usuario).crearAlumno(JuegoMatesEDU.arrayUsuarios);break;
			case 2:((Profesor) JuegoMatesEDU.usuario).borrarAlumno(JuegoMatesEDU.arrayUsuarios);break; 
			case 3:((Profesor) JuegoMatesEDU.usuario).modificarAlumno(JuegoMatesEDU.arrayUsuarios);break; 
			case 4:((Profesor) JuegoMatesEDU.usuario).listarAlumnos(JuegoMatesEDU.arrayUsuarios);break; 
			default: System.out.println();
			System.out.println("Gracias por jugar a este juego... ^_^");
			
		}
		
	}
	// menu alumno
	public static void lanzarMenuAlumno() {
		int opcion = 0;

		// Escribimos el menu
		escribirMenuAlumno();

		// Obtenemos la opci贸n
		opcion = Utilidades.leerEntero();

		// Comprobamos que la opci贸n sea alguno de los valores permitidos
		switch (opcion)
		{
			case 1: MayorMenorIgual.main(null);
			break;
			case 2:((Profesor) JuegoMatesEDU.usuario).borrarAlumno(JuegoMatesEDU.arrayUsuarios);
			break; 
			case 3:((Profesor) JuegoMatesEDU.usuario).modificarAlumno(JuegoMatesEDU.arrayUsuarios);
			break; 
			case 4:((Profesor) JuegoMatesEDU.usuario).listarAlumnos(JuegoMatesEDU.arrayUsuarios);
			break; 
			default: System.out.println();
			System.out.println("Gracias por jugar a este juego... ^_^");
			
		}
		
	}

	// metodo que comprueba si el usuario introducido existe y que tipo de
	// usuario es
	// recibe por apramento el usuario y la contrase馻 introducidos asi como el
	// array

	public static int comprobarUsuario(String nom, String cont,
			ArrayList arrayUsuarios) {
		int num = 0;
		for (int i = 0; i < arrayUsuarios.size(); i++) {
			Usuario usuario = (Usuario) arrayUsuarios.get(i);
			if ((usuario.getUser().equals(nom))
					&& (usuario.getContrase馻().equals(cont))) {
				if (usuario instanceof Administrador) {
					JuegoMatesEDU.usuario = (Administrador)usuario;
					num = 1;
				} else if (usuario instanceof Profesor) {
					JuegoMatesEDU.usuario = (Profesor)usuario;
					num = 2;
				} else if (usuario instanceof Alumno) {
					JuegoMatesEDU.usuario = (Alumno)usuario;
					num = 3;
				} else
					num = 4;

			}

		}
		return num;
	}

	public static void main(String[] args) {

		arrayUsuarios = new ArrayList<Usuario>();
		boolean iniciado = true;
		Administrador admin = new Administrador("Juan", "Perico", 666666,
				"admin", "1234");
		arrayUsuarios.add(admin);
		Profesor prof1 = new Profesor("Profesor", "Oak", 234123, "oak", "2345",
				"Informatica");
		arrayUsuarios.add(prof1);
		Alumno alum1 = new Alumno("David", "Valle", 235183, "deif", "5678");
		arrayUsuarios.add(alum1);

		while (iniciado) {
			iniciado = lanzarMenuInicial();
		}
	}

}
