package TDAPoligono;
import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame lados del Poligono:");
		int N=entrada.nextInt();
		Poligono poligono = new Poligono(N);
		poligono.LeerDatos();
		poligono.DesplegarArreglo();
		System.out.println("Perimetro = "+poligono.calcularPerimetro());
		

	}

}
