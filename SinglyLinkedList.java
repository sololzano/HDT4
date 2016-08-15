/**
 * @author Luis Diego Sierra, Carlos Solórzano
 * @since 13.08.2016
 * @param <E>
 */
public class SinglyLinkedList<E> extends AbstractList implements IList<E> {

	private Node<E> head;
	
	/**
	 * Construye una lista vacía
	 */
	public SinglyLinkedList() {
		head = null;
		super.count = 0;
	}

	@Override
	public void addFirst(E value) {
		head = new Node<E>(value, head);
		super.count++;
	}

	@Override
	public E getFirst() {
		return head.value;
	}

	@Override
	public E removeFirst() {
		if (!super.isEmpty()) {
			Node<E> temp = head;
			head = head.next;
			super.count--;
			return temp.value();
		}
		return null;
	}
}
