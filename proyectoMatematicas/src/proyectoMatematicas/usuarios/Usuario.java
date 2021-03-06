package proyectoMatematicas.usuarios;

//Clase usuario que se utilizara como clase padre de las posteriores 
//clases administrador, profesor y alumno
public abstract class Usuario {
	// atributos de la clase usuario
	protected String nombre, apellido;
	protected int dni;
	protected String user;
	protected String contraseña;

	// constructor vacio
	public Usuario() {

	}

	// constructor normal
	public Usuario(String nombre, String apellido, int dni, String user,
			String contraseña) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.user = user;
		this.contraseña = contraseña;
	}

	public Usuario(String nombre2, String apellido2, int dni2) {
		// TODO Auto-generated constructor stub
	}

	// getters y setters
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

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public abstract void mostrar();

}
