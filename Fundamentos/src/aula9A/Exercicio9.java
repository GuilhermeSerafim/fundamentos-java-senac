package aula9A;

import java.util.Arrays;
import java.util.Random;

public class Exercicio9 {
	public static void main(String[] args) {
		Random r = new Random();
		int arr[] = new int[50];
		System.out.println("Populando arr...");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(1, 100);
		}
		exibir(arr);
		System.out.println();
		// Comparando e mudando o 0 aos valores repetidos
		for (int i = 0; i < arr.length; i++) { // Para antecessor
			boolean nRepete = false;
			for (int j = i + 1; j < arr.length; j++) { // Para sucessor
				if(arr[i] == arr[j]) {
					arr[i] = 0;
					arr[j] = 0;
					nRepete = true;
				}
			}
			if(nRepete) {
				arr[i] = 0;
			}
		}
		System.out.println("Colocando 0 em valores repetidos: ");
		exibir(arr);
		
	}
	
	public static void exibir(int[] arr) {
		Arrays.stream(arr).forEach(n -> System.out.printf("%2d ", n));
	}
	
	public static void resolucao() {
		
	}
}
