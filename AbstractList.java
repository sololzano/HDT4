/**
 * @author carlos
 *
 */
public abstract class AbstractList {

	/**
	 * Número de elementos en la lista
	 */
	protected int count;
	
	/**
	 * 
	 * @return
	 */
	public int size() {
		return count;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return (count == 0);
	}
}
