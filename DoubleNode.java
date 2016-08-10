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
	}

	/**
	 * @param value
	 * @param next
	 */
	public DoubleNode(E value, DoubleNode<E> next) {
		super(value, next);
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
