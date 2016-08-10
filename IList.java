/**
 * @author carlos
 *
 */
public interface IList<E> {

	/**
	 * 
	 * @return
	 */
	public boolean isEmpty();
	
	/**
	 * 
	 */
	public void clear();
	
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