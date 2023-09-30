package TDARational;

public class Rational {
	private int nominador;
    private int denominador;

    public Rational() {
        this(0, 1);
    }

    public Rational(int nominador) {
        this(nominador, 1);
    }

    public Rational(int nominador, int denominador) {
        this.nominador = nominador;
        this.denominador = denominador;
    }


    public float getValue() {
        return nominador / (float) denominador;
    }
    public Rational suma(Rational b){
        Rational r = new Rational();
        r.nominador = this.nominador*b.denominador + b.nominador*this.denominador;
        r.denominador = this.denominador * b.denominador;
        return r; 
    }
    public Rational mult(Rational b){
        Rational r = new Rational();
        r.nominador = this.nominador*b.nominador;
        r.denominador = this.denominador*b.denominador;
        return r;
    }
    public boolean igual(Rational b){
        return this.nominador * b.denominador == this.denominador * b.nominador;

    }
    public static void mostrar(Rational r){
        System.out.println(r.nominador+ "/"+r.denominador);
        
    }

}
