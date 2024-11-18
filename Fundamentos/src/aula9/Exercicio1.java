package aula9;

import java.util.Random;
import java.util.Scanner;

public class Exercicio1 {
	static Random r = new Random();	
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Digite um número de 1 à 10");
		int n = in.nextInt();
		int [] valores = {r.nextInt(1, 11), r.nextInt(1, 11), r.nextInt(1, 11), r.nextInt(1, 11)};
		if(contem(valores, n)) { 
			System.out.println("Número encontrado!");
		} else {
			System.out.println("Número não encontrado!");
		}
	}

	public static boolean contem(int[] arr, int n) {
		boolean contem = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				contem = true;
				break;
			}
		}
		return contem;
	}

	public static boolean contem(String[][] arr, String valor) {
		boolean contem = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j].equals(valor)) {
					contem = true;
					break;
				}
			}
		}
		return contem;
	}
}
