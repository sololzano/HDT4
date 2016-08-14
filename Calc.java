import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * @author carlos
 *
 */
public class Calc<E> {

	private IStack<E> stack;
	private String steps;
	/**
	 * 
	 */
	public Calc() {
		steps = "\r\n" + "Operaciones: " + "\r\n";
	}
	
	/**
	 * 
	 * @param data
	 * @return
	 */
	public int operate(String data, int type) {
		Factory<E> factor = new Factory<E>();
		String[] names = {
				"ArrayList",
				"VectorList",
				"SinglyLinkedList",
				"DoublyLinkedList",
				"CircularlyLinkedList"
		};
		int n, num1, num2 = 0;
		if (type > 0 && type < 6) {
			stack = (IStack<E>) factor.createObject(type);
			steps += "Utilizando " + names[type-1] + "\r\n";
		} else {
			steps += "La operacion no se puede ejecutar" + "\r\n";
			return 0;
		}
		for (String sp : data.split(" ")) {
			try {
				n = Integer.parseInt(sp);
				stack.push((E) new Integer(n));
				steps += "Push operando " + n + "\r\n";				
			} catch (Exception e) {
				if (stack.size() > 1) {
					num1 = (int) stack.pop();
					num2 = (int) stack.pop();
					if (sp.equals("+")) {
						steps += "Sumar: " + num1 + " + " + num2 + "\r\n";
						steps += "Resultado suma: " + (num1 + num2) + "\r\n";
						stack.push((E) new Integer(num1 + num2));
					}else if (sp.equals("-")) {
						stack.push((E) new Integer(num2 - num1));
						steps += "Restar: " + num2 + " - " + num1 + "\r\n";
						steps += "Resultado resta: " + (num2 - num1) + "\r\n";
					}else if (sp.equals("*")) {
						stack.push((E) new Integer(num1 * num2));
						steps += "Multiplicar: " + num1 + " * " + num2 + "\r\n";
						steps += "Resultado multiplicacion: " + (num1 * num2) + "\r\n";
					}else if (sp.equals("/")) {
						stack.push((E) new Integer(num1 / num2));
						steps += "Dividir: " + num1 + " / " + num2 + "\r\n";
						steps += "Resultado division: " + (num1 / num2) + "\r\n";
					}
				}
			}
		}
		return (int) stack.pop();
	}

	/**
	 * 
	 */
	public String toString() {
		return steps;
	}

	/**
	 * 
	 * @return
	 */
	public String readFile(String path) {
		String resultado = "";
		try {
			FileReader f = new FileReader(path);
			BufferedReader b = new BufferedReader(f);
			try {
				resultado = b.readLine();
				b.close();
			} catch (IOException e) {
				return "No se puede abrir archivo";
			}
		} catch (FileNotFoundException e) {
			return "Archivo no encontrado";
		}
		return resultado;
	}
}
