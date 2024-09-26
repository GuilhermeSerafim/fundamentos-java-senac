package avAlgoritmo1;

import java.util.Scanner;
// 2. Crie um algoritmo que leia 3 números e informe qual o menor. 
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1, n2, n3;
		System.out.println("Digite 3 números");
		n1 = in.nextInt();
		n2 = in.nextInt();
		n3 = in.nextInt();
		if(n1 < n2 && n1 < n3) {
			System.out.printf("%d é o menor", n1);
		} else if(n2 < n3) {
			System.out.printf("%d é o menor", n2);
		} else {
			System.out.printf("%d é o menor", n3);
		}
		in.close();
	}
}
