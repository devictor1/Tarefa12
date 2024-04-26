/*Verificar Triângulo: Implemente um método que receba três números
 * inteiros como argumentos e retorne verdadeiro se eles podem ser
 * os comprimentos dos lados de um triângulo, e falso caso contrário.
 */

package tarefa12;

import java.util.Scanner;

public class EX09 {
	public static boolean triangulo (int a, int b, int c) {
		
		if (a + b > c && a + c > b && b + c > a && Math.abs(a-b) < c && Math.abs(a-c) < b && Math.abs(b-c) < a) {
			return true;
		} else {		
		return false;
	}}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja bem-vindo! Insira abaixo o primeiro valor inteiro");
		int a = sc.nextInt();
		System.out.println("Obrigado! Agora insira o segundo valor inteiro");
		int b = sc.nextInt();
		System.out.println("Por último, insira o terceciro valor inteiro");
		int c = sc.nextInt();
		if (triangulo (a,b,c)) {
			System.out.println("Esses três valores conseguem formar um triângulo!");
		} else {
			System.out.println("Infelizmente esses valores não podem formar um triângulo!");
		}
		
		sc.close();
	}
}
