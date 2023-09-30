package TDARational;

public class Aplicacion {

	public static void main(String[] args) {
System.out.println("EJEMPLO DE USO DE TDA RATIONAL");
        
        System.out.println("SUMA");
        Rational a = new Rational(1,5);
        Rational b = new Rational(2,10);
        Rational.mostrar(a);
        Rational.mostrar(b);
        
        System.out.println("SUMA");
        Rational r = a.suma(b);
        Rational.mostrar(r);

        System.out.println("MULTIPLICACION");
        r = a.mult(b);
        Rational.mostrar(r);

        
        if (a.igual(b))
           System.out.println("SON IGUALES");
        else
           System.out.println("NO SON IGUALES ");

	}

}
