import java.util.ArrayList;

/**
 * @author Luis Diego Sierra, Carlos Solórzano
 * @since 13.08.2016
 * @param <E> El tipo de datos
 */
public class ArrayListStack<E> extends AbstractList implements IStack<E> {

	private ArrayList<E> stack;
	
	/**
	 * Constructor vacío
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
