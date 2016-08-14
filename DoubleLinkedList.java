/**
 * 
 * @author carlos
 *
 * @param <E>
 */
public class DoubleLinkedList<E> extends AbstractList implements IList<E> {
	
	/**
	 * 
	 */
	private DoubleNode<E> head;
	private DoubleNode<E> tail;
	
	/**
	 * 
	 */
	public DoubleLinkedList() {
		super.count = 0;
		head = null;
		tail = null;
	}

	@Override
	public void addFirst(E value) {
		head = new DoubleNode<E> (value, head, null);
		if (tail == null) {
			tail = head;
		}
		super.count++;
	}

	@Override
	public E getFirst() {
		return head.value;
	}

	@Override
	public E removeFirst() {
		if (!isEmpty()) {
			DoubleNode<E> temp = head;
			head = (DoubleNode<E>) head.getNext();
			if (head == null) {
				tail = null;
			} else {
				head.setPrevious(null);
			}
			temp.setNext(null);
			count--;
			return temp.value();
		}
		return null;
	}
}
