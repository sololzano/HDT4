import java.util.Vector;

/**
 * @author Luis Diego Sierra, Carlos Solórzano
 * @since 13.08.2016
 * @param <E>
 */
public class VectorStack<E> extends AbstractStack implements IStack<E> {

	private Vector<E> stack;
	
	/**
	 * Construye una pila vacía utilizando un vector
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
