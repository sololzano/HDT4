import static org.junit.Assert.*;

import org.junit.Test;
/**
 * @author Luis Diego Sierra, Carlos Solórzano
 * @since 13.08.2016
 * @param <E>
 */
public class SinglyLinkedListTest {

	@Test
	public void testAddFirst() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.addFirst(10);
		list.addFirst(5);
		assertNotNull(list);
	}

	@Test
	public void testGetFirst() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.addFirst(10);
		list.addFirst(5);
		assertSame(5, list.getFirst());
	}

	@Test
	public void testRemoveFirst() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.addFirst(10);
		list.addFirst(5);
		assertSame(5, list.removeFirst());
		assertSame(10, list.removeFirst());
	}

	@Test
	public void testSize() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.addFirst(10);
		list.addFirst(5);
		assertSame(2, list.size());
	}

	@Test
	public void testIsEmpty() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		assertEquals(true, list.isEmpty());
		list.addFirst(10);
		list.addFirst(5);
		assertEquals(false, list.isEmpty());
		list.removeFirst();
		list.removeFirst();
		assertEquals(true, list.isEmpty());
	}
}
