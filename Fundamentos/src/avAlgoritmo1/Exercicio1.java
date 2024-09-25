package avAlgoritmo1;

import java.util.Scanner;

// Crie um algoritmo que leia dois números e informe qual deles é o maior.
// Informe também caso os números sejam iguais. 
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1, n2;
		System.out.println("Digite 2 números");
		n1 = in.nextInt();
		n2 = in.nextInt();
		if(n1 > n2) {
			System.out.printf("%d é maior que %d", n1, n2);
		} else if(n1 < n2) {
			System.out.printf("%d é maior que %d", n2, n1);
		} else {
			System.out.println("Os 2 números são iguais");
		}
		in.close();
	}
}
