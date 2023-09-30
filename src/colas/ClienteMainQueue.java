package colas;
import java.util.Queue;
import java.util.LinkedList;


public class ClienteMainQueue {

	public static void main(String[] args) {
		// Crear una cola genérica
		Queue micola = new LinkedList();
		//Agregar 3 elementos a la cola en ese orden
		micola.add("elemento 0");
		micola.add("elemento 1");
		micola.add("elemento 2");
		//mostrar el primer elemento de la cola
		System.out.println("El primer elemento de la cola: "+
		                  micola.peek());
		//eliminar el primer elemento de la cola
		
		micola.remove();
		System.out.println("El primer elemento de la cola: "+
                micola.peek());
		
		micola.remove();
		System.out.println("El primer elemento de la cola: "+
                micola.peek());
		
		micola.remove();
		System.out.println("El primer elemento de la cola: "+
                micola.peek());
		
		
		
		

	}

}
