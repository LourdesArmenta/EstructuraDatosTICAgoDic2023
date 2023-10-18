package listaCircular;

public class ClienteListaCircularMain {

	public static void main(String[] args) {
		try {
			ListaCircular<Integer> listaCircular= new ListaCircular<Integer>();
			//Agregar elementos
			listaCircular.agregar(12);
			listaCircular.agregar(15);
			listaCircular.agregar(20);
			//Imprimir los elementos
			System.out.println("Elemento 0:"+listaCircular.getValor(0));
			System.out.println("Elemento 1:"+listaCircular.getValor(1));
			System.out.println("Elemento 2:"+listaCircular.getValor(2));
			for (int i=0;i<listaCircular.getTamanio();i++) {
				System.out.println("Elemento "+i+" :"+
						 listaCircular.getValor(i));
			}
			//Inserta el 13 en la posicion 1
			listaCircular.insertar(13, 1);
			//Insertar el 16 en la posicion
			listaCircular.insertar(16, 3); 
			//Insertar 16 en la posicion 10
			listaCircular.insertar(25, 0);
			for (int i=0;i<listaCircular.getTamanio();i++) {
				System.out.println("Elemento "+i+" :"+
						 listaCircular.getValor(i));
			}
			//Eliminar el dato de la posición 0
			listaCircular.remover(0);
			//Elimimar el dato de la posicion 3
			listaCircular.remover(3);
			for (int i=0;i<listaCircular.getTamanio();i++) {
				System.out.println("Elemento "+i+" :"+
						 listaCircular.getValor(i));
			}
			
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
