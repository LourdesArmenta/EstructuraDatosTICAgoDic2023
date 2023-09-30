package pilas;
import java.util.Stack;

public class ejemploStack {

	public static void main(String[] args)  {
		   
		//Crea una nueva pila de enteros
		   
		Stack<Integer> pila = new Stack<Integer>();
		//Se apila algunos datos enteros
		pila.push(2);
		pila.push(5);
		pila.push(7);
		
		
		System.out.println("El tope de la pila es: "+ pila.peek());
		 //Se desapila un elemento
		pila.pop();
		System.out.println("El tope de la pila es: "+ pila.peek());
		//Se desapila un elemento
		pila.pop();
		System.out.println("El tope de la pila es: "+
		pila.peek());
		//Se desapila un elemento
		pila.pop();
		//Como la pila esta vaia dispara una    excepción
		System.out.println("El topo de la pile es: "+
		pila.peek());
	}
	
}
