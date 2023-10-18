package listasDoblementeLigadas;


public class ListaDoblementeEnlazada <T>{
	//primer elemento de la lista
		private Nodo<T> cabeza;
		//Total de elementos de la lista
		private int tamanio;
		//Constructor por defecto
		public ListaDoblementeEnlazada() {
			cabeza = null;
			tamanio = 0;
		}
		//Devolver el tamanio de la lista
		public int getTamanio() {
			return tamanio;
		}
		/**
		 * Consulta si la lista esta vacia
		 * @return true cuando esta vacia, false cuando no
		 */
		public boolean esVacia() {
			return (cabeza == null);
			/*
			if(cabeza==null)
				return true;
			else
				return false;
			*/
		}
		/**
		 * Agregar un nuevo nodo AL FINAL de la lista
		 * @param valor valo a agregar
		 */
		public void agregar(T valor) {
			Nodo<T> nuevo = new Nodo<T>();
			nuevo.setValor(valor);
			if(esVacia()) {
				cabeza = nuevo;
			}
			else {
				//agregar al final de la lista
				Nodo<T> aux = cabeza;
				while (aux.getSiguiente() != null) {
					aux = aux.getSiguiente();
				}
				aux.setSiguiente(nuevo);
				//La siguiente linea es la que se anexa
				
				nuevo.setAnterior(aux);
				
			}
			tamanio++;
		}
		/**
		 * inserta un nuevo nodo en la lista
		 * @param valor valor a agregar
		 * @param pos posicion donde se insertara el nodo
		 * @throw PosicionIlegalException excepcion en caso que la 
		 *    posición no exista
		 */
		public void insertar(T valor, int pos) throws PosicionIlegalException {
			if (pos>=0 && pos<=tamanio) {
				Nodo<T> nuevo = new Nodo<T>();
				nuevo.setValor(valor);
				//el nodo a insertar esta al comienzo
				if (pos==0) {
					nuevo.setSiguiente(cabeza);
					cabeza= nuevo;
			
				}else {
					//El nodo a inserta va al final de la lista
					if (pos==tamanio) {
						Nodo<T> aux =cabeza;
						while(aux.getSiguiente() != null) {
							aux = aux.getSiguiente();
						}
						aux.setSiguiente(nuevo);
						//Linea nueva que se agrego
						nuevo.setAnterior(aux);
					}
					
					//el nodo a insertar esta en medio
					else {
						Nodo<T> aux = cabeza;
						for (int i=0;i<pos-1;i++){
							aux = aux.getSiguiente();
						}
						Nodo<T> siguiente = aux.getSiguiente();
						aux.setSiguiente(nuevo);
						nuevo.setSiguiente(siguiente);
						//se agregaron estas dos line
						nuevo.setAnterior(aux);
						siguiente.setAnterior(nuevo);
						
					}
				}
				tamanio++;
				
			}
			else {
				throw new PosicionIlegalException();
			}
			
		}
		public T getValor(int pos) throws PosicionIlegalException{
			if (pos>=0 && pos<tamanio) {
				T valor;
				if (pos==0) {
					valor=cabeza.getValor();
					return valor;
				}
				else {
					Nodo<T> aux= cabeza;
					for(int i=0;i<=pos-1;i++) {
						aux=aux.getSiguiente();
					}
					valor = aux.getValor();
				}
				return valor;
				
			}
			else
			{
				throw new PosicionIlegalException();
			}
		}
		/**
		 * Elimina un nodo en una determinada posiciom
		 * @param pos posicion
		 * @throws PosicionIlegalException
		 */
		public void remover(int pos) throws PosicionIlegalException{
			if(pos>=0 && pos<tamanio) {
				if (pos==0) {
					//El nodo a eliminar esta en la primera posicion
					cabeza.setAnterior(null);
					cabeza = cabeza.getSiguiente();
					
					//cabeza = cabeza.getSiguiente();
					//cabeza.setAnterior(null);
					tamanio--;
				}
				else {
					Nodo<T> aux = cabeza;
					for(int i=0;i<pos-1;i++){
						aux = aux.getSiguiente();
					}
					Nodo<T> prox = aux.getSiguiente();
					
					aux.setSiguiente(prox.getSiguiente());
					prox.setAnterior(aux.siguiente);
					tamanio--;	
				}
				
			}
			else {
				throw new PosicionIlegalException();
			}
		}
		public void limpiar() {
			cabeza = null;
			tamanio = 0;
		}


}
