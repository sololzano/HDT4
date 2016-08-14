/**
 * 
 * @author carlos
 *
 * @param <E>
 */
public class ListStack<E> extends AbstractStack implements IStack<E> {

	private IList<E> stack;
	
	/**
	 * 
	 * @param type
	 */
	public ListStack(int type) {
		switch (type) {
		case 4:
			stack = new DoubleLinkedList<E>();
			break;
		case 5:
			stack = new CircularLinkedList<E>();
			break;
		default:
			stack = new SinglyLinkedList<E>();
		}
	}
	
	/**
	 * 
	 */
	public ListStack() {
		this(3);
	}

	/* (non-Javadoc)
	 * @see IStack#push(java.lang.Object)
	 */
	@Override
	public void push(E value) {
		count++;
		stack.addFirst(value);
	}

	/* (non-Javadoc)
	 * @see IStack#pop()
	 */
	@Override
	public E pop() {
		if (!isEmpty()) {
			count--;
			return stack.removeFirst();
		}
		return null;
	}
}
