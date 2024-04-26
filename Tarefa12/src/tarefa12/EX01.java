/* Verificar Número Primo: Crie um método que receba um número inteiro
 * como argumento e retorne verdadeiro se o número for primo, e falso caso contrário.
 */

package tarefa12;

import java.util.Scanner;

public class EX01 {
	public static boolean primo(int numero) {
		if (numero <= 1) {
			return false;
		}
		for (int divisor = 2; divisor <= Math.sqrt(numero); divisor++) {
			if (numero % divisor == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Seja bem-vindo! Insira o número que você gostaria de testar para ver se é primo!");
		if (primo(sc.nextInt())) {
			System.out.println("O número é primo!");
		} else {
			System.out.println("O número não é primo!");
		}
		sc.close();
	}
	
}
