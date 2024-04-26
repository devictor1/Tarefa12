//Verificar Ano Bissexto: Desenvolva um método que determine se um ano é bissexto ou não.'

package tarefa12;

import java.util.Scanner;

public class EX07 {
	public static boolean bissexto (int ano) {
		int ano1 = ano;
		if (ano1 % 4 == 0) {
			if (ano1 % 100 == 0) {
				if (ano1 % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} return true;
		}else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Seja bem-vindo! Qual o ano que deseja verificar se é bissexto?");
		if (bissexto(sc.nextInt())) {
			System.out.println("O ano digitado é bissexto!");
		} else {
			System.out.println("O ano digitado não é bissexto!");
		}
		sc.close();
	}
}
