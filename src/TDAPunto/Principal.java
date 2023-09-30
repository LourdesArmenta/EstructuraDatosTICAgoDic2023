package TDAPunto;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Punto p = new Punto();
		p.dimension="Punto Vacio";
		System.out.println("Coordenada x de p ="+p.getX());
		System.out.println("Coordenada y de p ="+p.getY());
		System.out.println("Dimension de p = "+p.dimension);
		System.out.println();
		
		Punto p1 = new Punto(3,3);
		p1.dimension= "Punto(3,3)";
		System.out.println("Coordenada x de p1 ="+p1.getX());
		System.out.println("Coordenada y de p1 ="+p1.getY());
		System.out.println("Dimension de p1 = "+p1.dimension);
		System.out.println();
		
		Punto p2 = new Punto(8,7,2);
		p2.dimension = "Punto(8,7,2)";
		System.out.println("Coordenada x de p2 ="+p2.getX());
		System.out.println("Coordenada y de p2 ="+p2.getY());
		System.out.println("Dimension de p2 = "+p2.dimension);
		System.out.println();
		
		Punto p4 = new Punto();
		p4.leer();
		p4.despliega();
		
		Punto p5 = new Punto();
		p5.leer();
		p5.despliega();
		
		double distancia = p4.distancia(p5);
		
		System.out.println("Distancia = "+distancia);

	}
	

}
