package listas;
/*
 * Proposito: utilizar la clase LinkedList y ArrayList
 */
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class ClienteMain2 {

	public static void main(String[] args) {
		try {
			List<Integer> lista = new LinkedList<Integer>();
			List<Integer> lista2 = new ArrayList<Integer>();
			lista.add(12);
			lista.add(15);
			lista.add(21);
			
			System.out.println("Dato en la posición 0:"+
			         lista.get(0));
			System.out.println("Dato en la posición 1:"+
			         lista.get(1));
			System.out.println("Dato en la posición 2:"+
			         lista.get(2));
			lista.add(1,13);
			lista.add(3,16);
			System.out.println("Despues de la Insercion");
			System.out.println("Dato en la posición 0:"+
			         lista.get(0));
			System.out.println("Dato en la posición 1:"+
			         lista.get(1));
			System.out.println("Dato en la posición 2:"+
			         lista.get(2));
			System.out.println("Dato en la posición 3:"+
			         lista.get(3));
			System.out.println("Dato en la posición 4:"+
			         lista.get(4));
			lista.remove(0);
			lista.remove(3);
			System.out.println("Despues de la Eliminacion");
			System.out.println("Dato en la posición 0:"+
			         lista.get(0));
			System.out.println("Dato en la posición 1:"+
			         lista.get(1));
			System.out.println("Dato en la posición 2:"+
					lista.get(2));
			//Ingresar elementos al ArrayList
			System.out.println("ArrayList");
			lista2.add(10);
			lista2.add(15);
			lista2.add(24);
			System.out.println("Dato en la posición 0:"+
			         lista2.get(0));
			System.out.println("Dato en la posición 1:"+
			         lista2.get(1));
			System.out.println("Dato en la posición 2:"+
			         lista2.get(2));
			System.out.println("Recorrido del ArrayList");
			for (Integer aux:lista2) {
				System.out.println("Elemento "+aux);
			}
			
			
			
			
			
		}catch (Exception e){
			e.printStackTrace();
			
		}

	}

}
