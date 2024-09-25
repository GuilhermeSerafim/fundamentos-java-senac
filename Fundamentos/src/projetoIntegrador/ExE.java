package projetoIntegrador;

import java.util.Scanner;

public class ExE {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nMultiplo, n1, n2, soma = 0;
		System.out.println("Informe o número que deseja saber os múltiplos: ");
		nMultiplo = in.nextInt();
		System.out.printf("Agora, informe o range de números multiplos de %d%n", nMultiplo);
		n1 = in.nextInt();
		n2 = in.nextInt();
		for(int i = n1; i <= n2; i++) {
			if (i % nMultiplo == 0) {
				soma += i;
			}
		}	
		System.out.printf("A soma dos números múltiplos de %d, de %d á %d é %d", nMultiplo, n1, n2, soma);
	}
}
