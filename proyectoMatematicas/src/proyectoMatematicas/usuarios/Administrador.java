package proyectoMatematicas.usuarios;

import java.util.ArrayList;

import proyectoMatematicas.Utilidades;


public class Administrador extends Usuario {

	
	// constructor vacio
	public Administrador() {
		super();
		// TODO Auto-generated constructor stub
	}

	// contructor de atributos
	public Administrador(String nombre, String apellido, int dni, String user,
			String contraseña) {
		super(nombre, apellido, dni, user, contraseña);
		// TODO Auto-generated constructor stub
	}

	// metodo que sirve para mostrar los distintos atributos del usuario en
	// concreto
	public void mostrar() {
		System.out.println(" Nombre: " + nombre + " Apellidos: " + apellido
				+ " DNI: " + dni);
	}

	// metodo usado para crear profesores
	public void crearProfesor(ArrayList<Usuario> arrayUsuarios) {
		System.out.println("Introduce el nombre del profesor: ");
		String nombre = Utilidades.leerCadena();
		System.out.println("Introduce los apellidos del profesor: ");
		String apellido = Utilidades.leerCadena();
		System.out.println("Introduce el DNI del profesor ");
		int dni = Utilidades.leerEntero();
		System.out.println("Introduce la materia que imparte el profesor ");
		String materia = Utilidades.leerCadena();

		Profesor p = new Profesor(nombre, apellido, dni, materia);
		arrayUsuarios.add(p);
		

	}

	// metodo usado para borrar profesores
	public void borrarProfesor(ArrayList<Usuario> arrayUsuarios) {
		listarProfesores(arrayUsuarios);// metodo que lista profesores que ya se encuentran
							// introducidos en la lista
		System.out
				.println("Selecciona el profesor que desea borrar de la lista: ");
		int opcion = Utilidades.leerEntero();
		arrayUsuarios.remove(opcion);

	}

	// metodo usado para modificar distintas caracteristicas de los profesores
	public void modificarProfesor(ArrayList<Usuario> arrayUsuarios) {
		listarProfesores(arrayUsuarios);
		System.out
				.println("Selecciona el profesor que desea modificar de la lista: ");
		int opcion = Utilidades.leerEntero();
	//posible fallo a la hora de introducir los demas datos sin modificar
		Profesor p = (Profesor) arrayUsuarios.get(opcion-1);
		System.out.println("¿Que desea modificar?");
		System.out.println("1.Nombre");
		System.out.println("2.Apellido");
		System.out.println("3.DNI");
		System.out.println("4.Materia");
		int opcion2 = Utilidades.leerEntero();
		switch (opcion2) {
		case 1:
			System.out.println("¿Que nombre desea introducir?");
			String nombre = Utilidades.leerCadena();
			p.setNombre(nombre);
			break;
		case 2:
			System.out.println("¿Que apellido desea introducir?");
			String apellido = Utilidades.leerCadena();
			p.setApellido(apellido);
			break;

		case 3:
			System.out.println("¿Que DNI desea introducir?");
			int dni = Utilidades.leerEntero();
			p.setDni(dni);
			break;

		case 4:
			System.out.println("¿Que materia desea introducir?");
			String materia = Utilidades.leerCadena();
			p.setMateria(materia);
			break;

		}
		arrayUsuarios.set(opcion-1, p);
	}

	// metodo que lista profesores que ya se encuentran introducidos en la lista
	public void listarProfesores(ArrayList<Usuario> arrayUsuarios) {
		System.out.println("Esta es la lista actual de los profesores ingresados: ");
		int cuenta = 0;
		for (int i = 0; i < arrayUsuarios.size(); i++) {
			System.out.println(cuenta + 1 + ".");
			arrayUsuarios.get(i).mostrar();;
			cuenta++;
		}

	}

	public static void main(String[] args) {
		Profesor[] arrayProf=new Profesor[50];
		int contador=0;
		Administrador admin = new Administrador("Juan", "Perico", 666666,
				"admin", "1234");
		//admin.crearProfesor(arrayProf, contador);
	//	admin.crearProfesor(arrayProf, contador);
		arrayProf[0].mostrar();
		arrayProf[1].mostrar();
		//admin.modificarProfesor(arrayProf);
		admin.mostrar();
		


	}

}
