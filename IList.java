/**
 * @author carlos
 *
 */
public interface IList<E> {
	
	/**
	 * 
	 * @param value
	 */
	public void addFirst(E value);
	
	/**
	 * 
	 * @return
	 */
	public E getFirst();
	
	/**
	 * 
	 * @return
	 */
	public E removeFirst();
}