package colas;

public class ClienteMain {

	public static void main(String[] args) {
		//Crear una nueva cola de enteros
		Cola<Integer> cola = new Cola<Integer>();
		//Se encola el elemento
		cola.encolar(12);
		cola.encolar(13);
		cola.encolar(14);
		cola.encolar(15);
		//Imprimir el primer elemento de la cola
		System.out.println("El primer elemento de la cola es:"+
		   cola.frente());
		cola.desencolar();
		System.out.println("El primer elemento de la cola es:"+
				   cola.frente());
		cola.desencolar();
		System.out.println("El primer elemento de la cola es:"+
				   cola.frente());
		cola.desencolar();
		System.out.println("El primer elemento de la cola es:"+
				   cola.frente());
		cola.desencolar();
		System.out.println("El primer elemento de la cola es:"+
				   cola.frente());

	}

}
