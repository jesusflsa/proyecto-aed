package clases;

public class Vendedor {
	private int codigo;
	private int categoria;
	private String nombres;
	private String apellidos;
	private String telefono;
	private String dni;

	public Vendedor(int codigo, int categoria, String nombres, String apellidos, String telefono, String dni) {
		this.codigo = codigo;
		this.categoria = categoria;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.dni = dni;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}
