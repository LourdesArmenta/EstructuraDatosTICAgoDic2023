package colas;

public class Cola<T> {
	//Atributo cabeza que apunta al primer elemento de la cola
	private Nodo<T> cabeza;
	//Atributo cola, que apunta al ultimo elemento de la cola
	private Nodo<T> cola;
	//Almacena el total de elementos de la cola
	private int tamanio;
	//Constructor por defecto
	public Cola() {
		cabeza = null;
		cola = null;
		tamanio = 0;
	}
	//Devuelve el total de elementos de la cola
	public int getTamanio() {
		return tamanio;
	}
	//Verificar si la cola esta vacia
	public boolean esVacia() {
		return (cabeza == null);
	}
	//Encolar un elemento nuevo
	public void encolar(T valor) {
		//Crear un nuevo Nodo
		Nodo<T> nuevo = new Nodo<T>();
		//fijar el valor dentro del nodo
		nuevo.setValor(valor);
		if(esVacia()) {
			//cabeza en la cola apunta al nodo nuevo
			cabeza = nuevo;
			cola = nuevo;
		}
		else
		{
			//Se enlaza el campo siguiente de cola con el nuevo elemento
			cola.setSiguiente(nuevo);
			//la nueva cola pasa a ser nuevo
			cola = nuevo;
		}
		//Incrementa el tamanio porque hay un nuevo elemento
		tamanio++;
	}
	//Eliminar el primer elemento de la cola
	public void desencolar() {
		//Si no esta vacia
		if (!esVacia()) {
			//Verificar si hay un solo elemento en la cola
			if(cabeza == cola) {
				cabeza= null;
				cola = null;
			}
			else {
				//se elimina el primer elemento de la cola
				//desplazando la cabeza al siguiente nodo.
				cabeza = cabeza.getSiguiente();
			}
			//se disminuye el total de elementos
			tamanio --;
			
		}
	}
	//Devuelvo el primer elemento de la cola
	public T frente() {
		if(!esVacia())
			return cabeza.getValor();
		else
			return null;
	}
	
	

}
