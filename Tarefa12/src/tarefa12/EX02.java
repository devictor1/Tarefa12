//Calcular Fatorial: Escreva um método para calcular o fatorial de um número inteiro positivo passado como parâmetro.

package tarefa12;

import java.util.Scanner;

public class EX02 {
	public static int fatorial (int numero) {
		int totalFatorial = 0;
		for (int fator = 1; fator <= numero; fator++) {
			totalFatorial = totalFatorial + fator;
		}
		return totalFatorial;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Seja bem-vindo! Insira abaixo um número inteiro positivo!");
		System.out.println("O fatorial do seu número fica no total de " + fatorial(sc.nextInt()));
		sc.close();
	}
}
