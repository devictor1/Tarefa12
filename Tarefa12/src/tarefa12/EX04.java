// Calcular Média: Crie uma função que calcule a média de uma lista de números passada como parâmetro.

package tarefa12;

import java.util.Scanner;

public class EX04 {

	public static float media(int[] numeros) {
		int soma = 0;
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}
		float media = soma / numeros.length;
		return media;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Seja bem-vindo! Quantos números você gostaria de adicionar?");
		int espacosNoArray = sc.nextInt();
		int[] numeros = new int[espacosNoArray];
		System.out.println("Agora, por favor digite os números, um de cada vez!");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}
		System.out.println("Números inseridos:");
		for (int numero : numeros) {
			System.out.print(numero + " ");
		}
		System.out.println("");
		System.out.println("A media dos números inseridos é de " + media(numeros));
		sc.close();
	}
}
