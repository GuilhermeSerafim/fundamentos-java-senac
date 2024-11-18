package aula9;

import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		int n;
		int[][] arrDuo = { { r.nextInt(1, 11), r.nextInt(1, 11), r.nextInt(1, 11) },
				{ r.nextInt(11, 21), r.nextInt(11, 21), r.nextInt(11, 21) },
				{ r.nextInt(21, 31), r.nextInt(21, 31), r.nextInt(21, 31) }, };
		for (int[] is : arrDuo) {
			for (int is2 : is) {
				System.out.println("Valor: " + is2);
			}
		}
		System.out.println("Write a value of 1 a 30");
		n = in.nextInt();
		System.out.println(searchCordenateArrDuo(arrDuo, n));
	}

	public static String searchCordenateArrDuo(int arr[][], int n) {
		String coordenadas = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == n) {
					coordenadas = "As cordenadas são " + i + " e " + j;
					break;
				}
			}
		}
		if (coordenadas.isEmpty()) {
			return "Cordenadas não encontradas";
		}
		return coordenadas;
	}
	
	public static int[] searchCoordinateInArray(int[][] arr, int value) {
		int[] coord = {-1, -1};
		for (int i = 0; i < coord.length; i++) {
			for (int j = 0; j < coord.length; j++) {
				if(arr[i][j] == value) {
					coord[0] = i;
					coord[1] = j;
					break;
				}
			}
		}
		return coord;
	}
}
