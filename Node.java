/**
 * @author Luis Diego Sierra, Carlos Solórzano
 * @since 13.08.2016
 * @param <E>
 */
public class Node<E> {

	/**
	 * 
	 */
	protected E value;
	protected Node<E> next;
	
	/**
	 * 
	 * @param value El valor del nodo
	 */
	public Node(E value) {
		this(value, null);
	}
	
	/**
	 * 
	 * @param value El valor del nodo
	 * @param next El siguiente elemento del nodo
	 */
	public Node(E value, Node<E> next) {
		this.value = value;
		this.next = next;
	}
	
	/**
	 * @pre Nodo no vacío
	 * @post Nodo apunta al siguiente elemento
	 * @param next El siguiente elemento del nodo
	 */
	public void setNext(Node<E> next) {
		this.next = next;
	}
	
	/**
	 * @pre Nodo no vacío
	 * @post N/A
	 * @return El elemento siguiente del nodo
	 */
	public Node<E> getNext() {
		return next;
	}
	
	/**
	 * @pre Nodo no vacío
	 * @post N/A
	 * @return El valor del nodo
	 */
	public E value() {
		return value;
	}
	
	/**
	 * @pre N/A
	 * @post N/A
	 * @param value El valor del nodo
	 */
	public void setValue(E value) {
		this.value = value;
	}
}
