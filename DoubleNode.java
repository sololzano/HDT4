/**
 * @author carlos
 *
 */
public class DoubleNode<E> extends Node<E> {

	private DoubleNode<E> previous;
	/**
	 * @param value
	 */
	public DoubleNode(E value) {
		super(value);
		previous = null;
	}

	/**
	 * @param value
	 * @param next
	 */
	public DoubleNode(E value, DoubleNode<E> next, DoubleNode<E> previous) {
		super(value, next);
		this.previous = previous;
	}
	
	/**
	 * 
	 * @return
	 */
	public DoubleNode<E> getPrevious() {
		return previous;
	}
	
	/**
	 * 
	 * @param previous
	 */
	public void setPrevious(DoubleNode<E> previous) {
		this.previous = previous;
	}
}
