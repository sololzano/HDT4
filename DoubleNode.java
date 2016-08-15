/**
 * @author Luis Diego Sierra, Carlos Solórzano
 * @since 13.08.2016
 * @param <E>
 */

public class DoubleNode<E> extends Node<E> {

	private DoubleNode<E> previous;
	/**
	 * @param value El valor del nodo
	 * Crea un nodo doble
	 */
	public DoubleNode(E value) {
		super(value);
		previous = null;
	}

	/**
	 * @param value El valor del nodo
	 * @param next Apuntador al siguiente nodo
	 * Crea un nodo doble
	 */
	public DoubleNode(E value, DoubleNode<E> next, DoubleNode<E> previous) {
		super(value, next);
		this.previous = previous;
	}
	
	/**
	 * 
	 * @return El nodo anterior
	 */
	public DoubleNode<E> getPrevious() {
		return previous;
	}
	
	/**
	 * 
	 * @param previous El nodo anterior a almacenar
	 */
	public void setPrevious(DoubleNode<E> previous) {
		this.previous = previous;
	}
}
