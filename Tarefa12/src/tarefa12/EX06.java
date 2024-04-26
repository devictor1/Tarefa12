//Contar Vogais: Escreva uma função que conte o número de vogais em uma string.

package tarefa12;

import java.util.Scanner;

public class EX06 {
	public static int vogais (String args) {
		char [] vogais = {'a', 'e', 'i', 'o','u'};
		int contagem = 0;
		for (int i = 0; i < args.length();i++) {
			for (int f = 0; f < vogais.length;f++) {
			if (args.charAt(i) == vogais[f]) {
			contagem ++;
			}
			}
		}
		
		
		return contagem;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Seja bem-vindo! Insira abaixo a String que você deseja contas as vogais!");
		
		System.out.println("A sua string tem um total de " + vogais(sc.next()) + " vogais");

		sc.close();
	}
}
