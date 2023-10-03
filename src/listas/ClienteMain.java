/**
 * 
 */
package listas;

/**
 * @author lourdesarmenta
 *
 */
public class ClienteMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Lista<Integer> lista = new Lista<Integer>();
			//Agregar tres elementos en la lista
			lista.agregar(12);
			lista.agregar(15);
			lista.agregar(20);
			//Imprimir los datos agregados
			System.out.println("Dato en la posición 0:"+
			         lista.getValor(0));
			
			System.out.println("Dato en la posición 1:"+
			         lista.getValor(1));
			System.out.println("Dato en la posición 2:"+
			         lista.getValor(2));
			//Inserta el 13 en la posicion 1
			lista.insertar(13, 1);
			//Insertar el 16 en la posicion
			lista.insertar(16, 3); 
			//Insertar 16 en la posicion 10
			//lista.insertar(16, 10);
			//Arroja una excepcion porque la posicion 10 no existe
			System.out.println("Dato en la posición 0:"+
			         lista.getValor(0));
			System.out.println("Dato en la posición 1:"+
			         lista.getValor(1));
			System.out.println("Dato en la posición 2:"+
			         lista.getValor(2));
			System.out.println("Dato en la posición 3:"+
			         lista.getValor(3));
			System.out.println("Dato en la posición 4:"+
			         lista.getValor(4));
			//Eliminar el dato de la posición 0
			lista.remover(0);
			//Elimimar el dato de la posicion 3
			lista.remover(3);
			System.out.println("Datos despues de la eliminacion");
			System.out.println("Dato en la posición 0:"+
			         lista.getValor(0));
			System.out.println("Dato en la posición 1:"+
			         lista.getValor(1));
			System.out.println("Dato en la posición 2:"+
			         lista.getValor(2));
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
