package projetoIntegrador;

import java.util.Scanner;

public class ExC {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe um número:");
		int n = in.nextInt();
		int somaPar = 0;
		for (int i = 1; i <= n; i++) {
			if(i % 2 == 0) {
				somaPar += i;
			}
		}
		System.out.printf("A soma dos números pares de 1 á %d é %d", n, somaPar);
	}
}
