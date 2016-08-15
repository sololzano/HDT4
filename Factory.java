/**
 * @author Luis Diego Sierra, Carlos Solórzano
 * @since 13.08.2016
 * @param <E>
 */
public class Factory<E> {

	/**
	 * Crea un patrón Factory vacío
	 */
	public Factory() {
		
	}
	
	/**
	 * @param option El tipo de estructura de datos a utilizar con la pila
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
		return new ArrayListStack<E>();
	}
}
