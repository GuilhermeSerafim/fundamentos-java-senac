package aula9;

import java.util.Random;

public class Exercicio2 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] arr = new int[100];

		for (int i = 0; i < arr.length; i++) {
			int n;
			do {
				n = rand.nextInt(0, 150);
				System.out.println("Gerando número da posição: " + i);
			} while (Exercicio1.contem(arr, n));
			arr[i] = n;
		}
	}
}
