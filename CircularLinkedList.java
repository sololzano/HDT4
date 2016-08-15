/**
 * @author Luis Diego Sierra, Carlos Solórzano
 * @since 13.08.2016
 * @param <E> 
 */
public class CircularLinkedList<E> extends AbstractList implements IList<E> {

	private Node<E> tail;
	
	/**
	 * Crea lista circularmente enlazada vacía
	 */
	public CircularLinkedList() {
		tail = null;
		count = 0;
	}

	/* (non-Javadoc)
	 * @see IList#addFirst(java.lang.Object)
	 */
	@Override
	public void addFirst(E value) {
		Node<E> temp = new Node<E>(value);
		if (tail == null) {
			tail = temp;
			tail.setNext(tail);
		} else {
			temp.setNext(tail.getNext());
			tail.setNext(temp);
		}
		count++;
	}

	/* (non-Javadoc)
	 * @see IList#getFirst()
	 */
	@Override
	public E getFirst() {
		return tail.getNext().value();
	}

	/* (non-Javadoc)
	 * @see IList#removeFirst()
	 */
	@Override
	public E removeFirst() {
		if (!isEmpty()) {
			Node<E> temp = tail.getNext();
			if (tail == tail.getNext()) {
				tail = null;
			} else {
				tail.setNext(temp.getNext());
				temp.setNext(null);
			}
			count--;
			return temp.value();
		}
		return null;
	}
}