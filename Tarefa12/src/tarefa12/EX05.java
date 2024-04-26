//Inverter String: Implemente um método que inverta uma string passada como argumento.

package tarefa12;

import java.util.Scanner;

public class EX05 {
	public static String invertida(String args) {
		String invertida = new StringBuilder(args).reverse().toString();
		return invertida;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja bem-vindo! Insira abaixo a String que você deseja inverter!");
		System.out.println("O texto passado, invertido, fica: " + invertida(sc.next()));

		sc.close();
	}
}
