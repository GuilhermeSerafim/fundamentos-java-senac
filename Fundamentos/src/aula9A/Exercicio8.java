package aula9A;

import java.util.Random;

public class Exercicio8 {
	public static void main(String[] args) {
		Random rand = new Random();
		int arr[] = new int[10];
		int arr2[] = new int[20];
		for (int i = 0; i < arr2.length; i++) {
			if (i >= 10) {
				arr2[i] = arr[i - 10] * 2;
			} else {
				arr[i] = rand.nextInt(1, 11);
				arr2[i] = arr[i];
			}
		}
		for (int i : arr2) {
			System.out.println(i);
		}
	}
}
