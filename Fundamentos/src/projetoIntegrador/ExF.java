package projetoIntegrador;

import java.util.Scanner;

public class ExF {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe a base e o expoente");
		int base = in.nextInt();
		int expoente = in.nextInt();
		if(expoente < 0 || base < 0) {			
			System.out.println("Cálculo inválido");
		} else {
			int resultado = 1;
			for (int i = 0; i < expoente; i++) {
				resultado *= base;
			}	
			System.out.printf("%d elevado a %d é %d", base, expoente, resultado);
		}
	}
}
