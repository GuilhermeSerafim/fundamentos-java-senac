package projetoIntegrador;

import java.util.Scanner;

public class ExB {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe um número:");
		int n = in.nextInt();
		int multiplicacao = 1;
		for (int i = 1; i <= n; i++) {
			multiplicacao *= i;
		}
		System.out.printf("O fatorial de %d é %d", n, multiplicacao);
	}
}
