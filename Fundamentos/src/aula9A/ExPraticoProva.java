package aula9A;

import java.util.Random;

public class ExPraticoProva {
	// Prencher um arr bidimensional randomicamente
	public static void main(String[] args) {
		Random r = new Random();
		int[][] matriz = new int[r.nextInt(1, 10)][];
		int[][] matriz2 = matriz;
		
	
		
		// Popular uma matrix com pseudo-randomicos 
		for (int i = 0; i < matriz.length; i++) {
			int qtdCaracteres = r.nextInt(0, 10);
			matriz[i] = new int[qtdCaracteres];
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = i;
			}
		}
		
		for (int[] is : matriz2) {
			for (int is2 : is) {
				System.out.print(is2);
			}
			System.out.println();
		}
	}
}
