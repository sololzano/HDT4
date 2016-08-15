/**
 * @author Luis Diego Sierra, Carlos Solórzano
 * @since 13.08.2016
 */
public abstract class AbstractList {

	/**
	 * Número de elementos en la lista
	 */
	protected int count;
	
	/**
	 * 
	 * @return El tamaño de la lista
	 */
	public int size() {
		return count;
	}
	
	/**
	 * 
	 * @return true si la lista está vacía
	 */
	public boolean isEmpty() {
		return (count == 0);
	}
}
