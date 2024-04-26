/*Verificar Palíndromo: Desenvolva um método que receba uma
 * string como entrada e retorne verdadeiro se ela for um palíndromo
 * (ou seja, se ela pode ser lida da mesma forma de trás para frente), e falso caso contrário.
 */
package tarefa12;

import java.util.Scanner;

public class EX03 {

	public static boolean palindromo(String args) {
		String invertida = new StringBuilder(args).reverse().toString();
		if (args.equalsIgnoreCase(invertida)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Seja bem-vindo! Insira abaixo um texto sem espaços!");
		if (palindromo(sc.next())) {
			System.out.println("Sua frase/palavra é um palíndromo!");
		} else {
			System.out.println("Sua frase/palavra não é um palíndromo!");
		}
		sc.close();
	}
}
