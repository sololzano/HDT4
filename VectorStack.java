import java.util.Vector;

/**
 * 
 * @author carlos
 *
 * @param <E>
 */
public class VectorStack<E> extends AbstractStack implements IStack<E> {

	private Vector<E> stack;
	
	/**
	 * 
	 */
	public VectorStack() {
		count = 0;
		stack = new Vector<E>();
	}

	/* (non-Javadoc)
	 * @see IStack#push(java.lang.Object)
	 */
	@Override
	public void push(E value) {
		count++;
		stack.add(0, value);
	}

	/* (non-Javadoc)
	 * @see IStack#pop()
	 */
	@Override
	public E pop() {
		if (!isEmpty()) {
			return stack.remove(0);
		}
		return null;
	}
}
