import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Luis Diego Sierra, Carlos Solórzano
 * @since 13.08.2016
 * @param <E>
 */
public class ListStackTest {

	/**
	 * Test method for {@link ListStack#push(java.lang.Object)}.
	 */
	@Test
	public void testPush() {
		ListStack<Integer> stack = new ListStack<Integer>();
		stack.push(10);
		stack.push(5);
		assertNotNull("Se ha creado objeto", stack);
	}

	/**
	 * Test method for {@link ListStack#pop()}.
	 */
	@Test
	public void testPop() {
		ListStack<Integer> stack = new ListStack<Integer>();
		stack.push(10);
		stack.push(5);
		assertSame("Son inguales", 5, stack.pop());
		assertSame(10, stack.pop());
	}

	/**
	 * Test method for {@link AbstractStack#size()}.
	 */
	@Test
	public void testSize() {
		ListStack<Integer> stack = new ListStack<Integer>();
		assertSame(0, stack.size());
		stack.push(10);
		stack.push(5);
		assertSame(2, stack.size());
		stack.pop();
		assertSame(2, stack.size());
	}

	/**
	 * Test method for {@link AbstractStack#isEmpty()}.
	 */
	@Test
	public void testIsEmpty() {
		ListStack<Integer> stack = new ListStack<Integer>();
		assertEquals(true, stack.isEmpty());
		stack.push(10);
		stack.push(5);
		assertEquals(true, stack.isEmpty());
	}
}
