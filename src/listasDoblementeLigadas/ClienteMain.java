package listasDoblementeLigadas;
/*
 * Proposito:Demuestra el uso de la estructura
 *        listas doblemente ligada
 * Fecha
 * Autor:
 */

public class ClienteMain {

	public static void main(String[] args) {
		try {
		ListaDoblementeEnlazada<Integer> lista = new ListaDoblementeEnlazada<Integer>();
		lista.agregar(12);
		lista.agregar(15);
		lista.agregar(20);
		
		System.out.println("Elemento de la lista:");
		for(int i=0;i<lista.getTamanio();i++)
			System.out.println("Elemento "+i+": "+lista.getValor(i));
		
		System.out.println("Elmentos de la lista despues de remover último:");
		lista.remover(2);
		for(int i=0;i<lista.getTamanio();i++)
			System.out.println("Elemento "+i+": "+lista.getValor(i));
		
		System.out.println("Elementos de la lista despues de insertar en la posicion 1");
		lista.insertar(7,1);
		for(int i=0;i<lista.getTamanio();i++)
		   System.out.println("Elemento "+i+": "+lista.getValor(i));
		
		System.out.println("Elementos de la lista depues de remove uno de  medio");
		lista.remover(1);
		for(int i=0;i<lista.getTamanio();i++)
			   System.out.println("Elemento "+i+": "+lista.getValor(i));
		
		System.out.println("Elementos de la lista despues de remover primero:");
		lista.remover(0);
		for(int i=0;i<lista.getTamanio();i++)
			   System.out.println("Elemento "+i+": "+lista.getValor(i));
		
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		

	}

}
