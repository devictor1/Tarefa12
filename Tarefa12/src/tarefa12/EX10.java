/*Calcular Média Ponderada: Escreva uma função que calcule a
 *média ponderada de três valores, onde os pesos são passados como argumentos.
 */

package tarefa12;

import java.util.Scanner;

public class EX10 {
	public static float mediaPonderada (int pesoA, int pesoB, int pesoC) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		float notaA = a * pesoA;
		float notaB = b * pesoB;
		float notaC = c * pesoC;
				
		float mediaPonderada = ((notaA + notaB + notaC)/(pesoA + pesoB + pesoC));
		
		return mediaPonderada;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja bem-vindo! Considere os números 10, 20 e 30");
		System.out.println("Abaixo, atribua um peso para o primeiro número");
		int pesoA = sc.nextInt();
		System.out.println("Agora, um peso para o segundo valor");
		int pesoB = sc.nextInt();
		System.out.println("Por último, atribua um peso para o terceiro.");
		int pesoC = sc.nextInt();
		System.out.println("Obrigado! A média ponderada, considerando os pesos fornecidos, é de " + mediaPonderada(pesoA, pesoB, pesoC));
				
		sc.close();
	}
}
