package pilas;

public class ClientePersonaMain {

	public static void main(String[] args) {
		Persona persona = new Persona();
		persona.setNombre("Lourdes");
		persona.setEdad(55);
		Pila<Persona> pila2 = new Pila<Persona>();
		pila2.apilar(persona);
		System.out.println("El tope es "+pila2.cima().getNombre());


	}

}
