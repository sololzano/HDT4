/**
 * @author Luis Diego Sierra, Carlos Solórzano
 * @since 13.08.2016
 * @param <E>
 */

public interface IStack<E> {
	
	/**
	 * @pre N/A
	 * @post Elemento añadido a la pila
	 * @param value El elemento a añadir
	 */
	public void push(E value);
	
	/**
	 * @pre Lista no puede estar vacía
	 * @post Elimina último elemento agregado a la pila
	 * @return El último elemento que se añadió a la pila
	 */
	public E pop();
	
	/**
	 * @pre N/A
	 * @post N/A
	 * @return La cantidad de elementos de la pila
	 */
	public int size();
}
