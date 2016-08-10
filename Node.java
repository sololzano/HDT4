/**
 * @author carlos
 *
 */
public class Node<E> {

	/**
	 * 
	 */
	protected E value;
	protected Node<E> next;
	
	/**
	 * 
	 * @param value
	 */
	public Node(E value) {
		this(value, null);
	}
	
	/**
	 * 
	 * @param value
	 * @param next
	 */
	public Node(E value, Node<E> next) {
		this.value = value;
		this.next = next;
	}
	
	/**
	 * 
	 * @param next
	 */
	public void setNext(Node<E> next) {
		this.next = next;
	}
	
	/**
	 * 
	 * @return
	 */
	public E value() {
		return value;
	}
	
	/**
	 * 
	 * @param value
	 */
	public void setValue(E value) {
		this.value = value;
	}
}
