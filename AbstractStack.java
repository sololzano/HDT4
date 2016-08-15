/**
 * @author Luis Diego Sierra, Carlos Solórzano
 * @since 13.08.2016
 */

public abstract class AbstractStack {
	
	protected int count;
	
	/**
	 * 
	 * @return El tamaño de la pila
	 */
	public int size() {
		return count;
	}
	
	/**
	 * 
	 * @return true si la pila está vacía
	 */
	public boolean isEmpty() {
		return (count == 0);
	}
}
