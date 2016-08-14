/**
 * @author carlos
 *
 */
public class Factory<E> {

	/**
	 * 
	 */
	public Factory() {
		
	}
	
	/**
	 * 
	 * @return La pila implementada con la estructura seleccionada
	 */
	public IStack<E> createObject(int option) {
		switch (option) {
		case 1:
			return new ArrayListStack<E>();
		case 2:
			return new VectorStack<E>();
		case 3: 
			return new ListStack<E>(option);
		case 4:
			return new ListStack<E>(option);
		case 5:
			return new ListStack<E>(option);
		}
		return null;
	}
}
