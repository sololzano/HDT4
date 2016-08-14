/**
 * 
 */

/**
 * @author carlos
 *
 */
public abstract class AbstractStack {
	
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
