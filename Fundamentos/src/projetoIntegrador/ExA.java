package projetoIntegrador;

import java.util.Scanner;

public class ExA {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe um número:");
		int n = in.nextInt();
		int soma = 0;
		for (int i = 1; i <= n; i++) {
			soma += i;
		}
		System.out.printf("A soma dos números de 1 á %d é %d", n, soma);
	}
}