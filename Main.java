import static java.lang.System.*;

import java.util.Scanner;
/**
 * @author Luis Diego Sierra, Carlos Solórzano
 * @since 13.08.2016
 * @param <E>
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int opt = 0;
		int lOpt = 0;
		Scanner sc = new Scanner(System.in);
		while (opt != 4) {
			out.println("Calculadora postfix");
			out.println("1. ArrayList");
			out.println("2. VectorList");
			out.println("3. Lists");
			out.println("4. Salir");
			try {
				opt = sc.nextInt();
				if (opt > 0 && opt < 3) {
					Calc<Integer> calc = new Calc<Integer>();
					out.println("Resultado: " + calc.operate(calc.readFile("datos.txt"), opt));
					out.println(calc.toString());
					out.println();
				} else if (opt == 3) {
					lOpt = 0;
					while (lOpt != 4) {
						out.println();
						out.println("1. SinglyLinkedList");
						out.println("2. DoublyLikedList");
						out.println("3. CircularlyLinkedList");
						out.println("4. Regresar");
						try {
							lOpt = sc.nextInt();
							if (lOpt > 0 && lOpt < 4) {
								Calc<Integer> calc = new Calc<Integer>();
								out.println("Resultado: " + calc.operate(calc.readFile("datos.txt"), lOpt+2));
								out.println(calc.toString());
								out.println();
							}
						} catch (Exception e) {
							out.println("Ingrese un numero correcto");
							sc.nextLine();
						}
					}
				}
			} catch (Exception e) {
				out.println("Ingrese un número correcto");
				sc.nextLine();
			}
		}
		sc.close();
	}
}
