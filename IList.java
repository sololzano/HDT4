/**
 * @author Luis Diego Sierra, Carlos Solórzano
 * @since 13.08.2016
 * @param <E>
 */
public interface IList<E> {
	
	/**
	 * @pre N/A
	 * @post Agrega un elemento a la primera posición de la lista
	 * @param value El valor del nuevo elemento en la lista
	 */
	public void addFirst(E value);
	
	/**
	 * @pre Lista no debe estar vacía
	 * @post Devuelve el primer elemento de la lista
	 * @return El primer elemento de la lista
	 */
	public E getFirst();
	
	/**
	 * @pre Lista no debe estar vacía
	 * @post Elimina y devuelve el primer elemento de la lista
	 * @return El primer elemento de la lista
	 */
	public E removeFirst();
}