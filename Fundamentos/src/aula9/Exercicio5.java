package aula9;

import java.util.Random;

public class Exercicio5 {
	public static void main(String[] args) {
		Random r = new Random();
		int[][] arrBi = new int[5][5];
		// Populei os dados
		for (int i = 0; i < arrBi.length; i++) {
			for (int j = 0; j < arrBi[i].length; j++) {
				arrBi[i][j] = r.nextInt(40, 51);
			}
		}
		for (int i = 0; i < arrBi.length; i++) {
			for (int j = 0; j < arrBi[i].length; j++) {
				if(arrBi[i][j] > 50) {	
					System.out.printf("Valor %d na posição [%d, %d]%n", arrBi[i][j], i, j);
				} else {
					arrBi[i][j] = 0;
				}
			};
			
		}
	}
}
