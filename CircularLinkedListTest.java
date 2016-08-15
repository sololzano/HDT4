import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Luis Diego Sierra, Carlos Solórzano
 * @since 13.08.2016
 * @param <E>
 */
public class CircularLinkedListTest {

	/**
	 * Test method for {@link CircularLinkedList#addFirst(java.lang.Object)}.
	 */
	@Test
	public void testAddFirst() {
		CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();
		list.addFirst(10);
		list.addFirst(5);
		assertNotNull(list);
	}

	/**
	 * Test method for {@link CircularLinkedList#getFirst()}.
	 */
	@Test
	public void testGetFirst() {
		CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();
		list.addFirst(10);
		list.addFirst(5);
		assertSame(5, list.getFirst());
	}

	/**
	 * Test method for {@link CircularLinkedList#removeFirst()}.
	 */
	@Test
	public void testRemoveFirst() {
		CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();
		list.addFirst(10);
		list.addFirst(5);
		assertSame(5, list.removeFirst());
		assertSame(10, list.removeFirst());
	}

	/**
	 * Test method for {@link AbstractList#size()}.
	 */
	@Test
	public void testSize() {
		CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();
		list.addFirst(10);
		list.addFirst(5);
		assertSame(2, list.size());
	}

	/**
	 * Test method for {@link AbstractList#isEmpty()}.
	 */
	@Test
	public void testIsEmpty() {
		CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();
		assertEquals(true, list.isEmpty());
		list.addFirst(10);
		list.addFirst(5);
		assertEquals(false, list.isEmpty());
		list.removeFirst();
		list.removeFirst();
		assertEquals(true, list.isEmpty());
	}
}
