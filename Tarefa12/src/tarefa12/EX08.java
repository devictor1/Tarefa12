// Calcular Potência: Crie uma função que calcule a potência de um número inteiro base elevado a um expoente inteiro positivo.

package tarefa12;

import java.util.Scanner;

public class EX08 {
	public static double potencia(int base, int expoente) {
		double resultado = base;
		for (int i = 2; i <= expoente; i++) {
			 resultado = (resultado * base);
		}
		return resultado;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja bem-vindo! Digite abaixo o número que você deseja elevar!");
		int base = sc.nextInt();
		System.out.println("Perfeito! Agora, esse número deve ser elevado à quanto?");
		int expoente = sc.nextInt();
		System.out.println("O resultado dessa potência é: " + potencia(base, expoente));
		
		sc.close();
	}
}
