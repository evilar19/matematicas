package proyectoMatematicas.usuarios;

import java.util.ArrayList;

import proyectoMatematicas.Utilidades;

public class Profesor extends Usuario {

	private String materia;
	

	public Profesor() {
		super();
	}

	public Profesor(String nombre, String apellido, int dni, String user,
			String contraseña, String materia) {
		super(nombre, apellido, dni, user, contraseña);
		this.materia = materia;
		// TODO Auto-generated constructor stub
	}

	public Profesor(String nombre, String apellido, int dni, String materia) {
		super(nombre, apellido, dni);
		this.materia = materia;
		// TODO Auto-generated constructor stub
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public void mostrar() {
		System.out.println("Nombre: " + nombre + "Apellidos: " + apellido
				+ "DNI: " + dni + " imparte: " + materia);
	}

	// metodo usado para crear alumnos
	public void crearAlumno(ArrayList<Usuario> arrayUsuarios) {
		System.out.println("Introduce el nombre del alumno: ");
		String nombre = Utilidades.leerCadena();
		System.out.println("Introduce los apellidos del alumno: ");
		String apellido = Utilidades.leerCadena();
		System.out.println("Introduce el DNI del alumno ");
		int dni = Utilidades.leerEntero();

		Alumno a = new Alumno(nombre, apellido, dni);
		arrayUsuarios.add(a);

	}

	// metodo usado para borrar alumnos
	public void borrarAlumno(ArrayList<Usuario> arrayUsuarios) {
		listarAlumnos(arrayUsuarios);// metodo que lista alumnos que ya se encuentran
						// introducidos en la lista
		System.out
				.println("Selecciona el alumno que desea borrar de la lista: ");
		int opcion = Utilidades.leerEntero();
		arrayUsuarios.remove(opcion);

	}

	// metodo usado para modificar distintas caracteristicas de los alumnos
	public void modificarAlumno(ArrayList<Usuario> arrayUsuarios) {
		listarAlumnos(arrayUsuarios);
		System.out
				.println("Selecciona el alumno que desea modificar de la lista: ");
		int opcion = Utilidades.leerEntero();
		Alumno a = (Alumno) arrayUsuarios.get(opcion-1);
		System.out.println("¿Que desea modificar?");
		System.out.println("1.Nombre");
		System.out.println("2.Apellido");
		System.out.println("3.DNI");

		int opcion2 = Utilidades.leerEntero();
		switch (opcion2) {
		case 1:
			System.out.println("¿Que nombre desea introducir?");
			String nombre = Utilidades.leerCadena();
			a.setNombre(nombre);
			break;
		case 2:
			System.out.println("¿Que apellido desea introducir?");
			String apellido = Utilidades.leerCadena();
			a.setApellido(apellido);
			break;

		case 3:
			System.out.println("¿Que DNI desea introducir?");
			int dni = Utilidades.leerEntero();
			a.setDni(dni);
			break;

		}
		arrayUsuarios.set(opcion-1, a);
	}

	// metodo que lista profesores que ya se encuentran introducidos en la lista
	public void listarAlumnos(ArrayList<Usuario> arrayUsuarios) {
		System.out
				.println("Esta es la lista actual de los profesores ingresados: ");
		int cuenta = 0;
		for (int i = 0; i < arrayUsuarios.size(); i++) {
			System.out.println(cuenta + 1 + ".");
			arrayUsuarios.get(i).mostrar();;
		cuenta++;
		}

	}
}
