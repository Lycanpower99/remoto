
public class Estudiante {
	private String nombre = "";
	private String apellidos = "";
	private String fecha_nac = "";
	private String dni = "";
	private String estudios = "";
	private String telefono = "";
	public Estudiante() {
		super();
	}
	public Estudiante(String nombre, String apellidos, String fecha_nac, String dni, String estudios, String telefono) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha_nac = fecha_nac;
		this.dni = dni;
		this.estudios = estudios;
		this.telefono = telefono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getFecha_nac() {
		return fecha_nac;
	}
	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getEstudios() {
		return estudios;
	}
	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellidos=" + apellidos + ", fecha_nac=" + fecha_nac + ", dni=" + dni
				+ ", estudios=" + estudios + ", telefono=" + telefono + "]";
	}
	
}
