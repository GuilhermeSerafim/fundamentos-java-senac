package projetoIntegrador;

import java.util.Scanner;

public class ExD {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe 2 números:");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int contador = n1; // Criei para não alterar o n1 original
		int soma = 0;
		while(contador <= n2) {
			if(contador % 2 == 0) {
				soma += contador;
			}
			contador++;
		}
		System.out.printf("A soma dos números pares de %d á %d é %d", n1, n2, soma);
	}
}
