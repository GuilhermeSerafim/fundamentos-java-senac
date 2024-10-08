package projetoIntegrador;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n =3;
        int[] numeros = new int[n];
        for(int i = 0; i < 3; i++) {
            do {
                numeros[i] = sc.nextInt(); // Ele substitui, por causa do indice
            } while(numeros[i] > 10 || numeros[i] < 0);
        }
        sc.close();
	}
}
