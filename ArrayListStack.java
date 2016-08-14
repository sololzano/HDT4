import java.util.ArrayList;

/**
 * 
 * @author carlos
 *
 * @param <E>
 */
public class ArrayListStack<E> extends AbstractList implements IStack<E> {

	private ArrayList<E> stack;
	
	/**
	 * 
	 */
	public ArrayListStack() {
		count = 0;
		stack = new ArrayList<E>();
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
			count--;
			return stack.remove(0);
		}
		return null;
	}
}
