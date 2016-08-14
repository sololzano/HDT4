/**
 * 
 */

/**
 * @author carlos
 *
 */
public interface IStack<E> {
	
	/**
	 * 
	 * @param value
	 */
	public void push(E value);
	
	/**
	 * 
	 * @return
	 */
	public E pop();
	
	/**
	 * 
	 * @return
	 */
	public int size();
}
