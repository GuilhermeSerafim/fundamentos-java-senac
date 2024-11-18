package aula9A;

import java.util.Random;

public class Exercicio8A {
	public static void main(String[] args) {
		Random rand = new Random();
		int arr[] = new int[10];
		int arr2[] = new int[20];
		int pos2 = 0;
		for (int i = 0; i < arr.length; i++) {
			int valor = rand.nextInt(0, 100);
			arr[i] = valor;
			arr2[pos2++] = valor;
			arr2[pos2++] = valor * 2;
		}
		System.out.println("Primeiro arr:");
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("Segundo arr:");
		for (int i : arr2) {
			System.out.println(i);
		}
	}
}
