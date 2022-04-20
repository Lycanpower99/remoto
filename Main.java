import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>datosUsuario=rellenarDatos();
	}

	private static ArrayList<String>rellenarDatos() {
		ArrayList<String>datos = new ArrayList<String>();
		String nombre = "";
		String apellidos = "";
		String fecha_nac = "";
		String dni = "";
		String estudios = "";
		String telefono = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el nombre: ");
		nombre = sc.nextLine();
		System.out.print("Introduzca apellidos: ");
		apellidos = sc.nextLine();
		System.out.print("Introduzca su fecha de nacimiento(dd/mm/yyyy): ");
		fecha_nac = sc.nextLine();
		System.out.print("Introduzca el DNI: ");
		dni = sc.nextLine();
		System.out.print("Introduzca sus estudios previos: ");
		estudios = sc.nextLine();
		System.out.print("Introduzca sutelefono: ");
		telefono = sc.nextLine();
		
		datos.add(nombre);
		datos.add(apellidos);
		datos.add(fecha_nac);
		datos.add(dni);
		datos.add(estudios);
		datos.add(telefono);
		return datos;
	}
}
