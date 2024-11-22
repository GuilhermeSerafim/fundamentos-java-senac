package avaliacao2;

import java.util.Random;
import java.util.Scanner;

public class Exercicio1 {
	static Scanner in = new Scanner(System.in);
	static Random r = new Random();

	public static void main(String[] args) {
		System.out.println("Informe a quantidade de itens do gráfico");
		int qtdItens = in.nextInt();
		// A quantidade de itens informada deve ser entre 1 e 20 
		if(qtdItens < 1 || qtdItens > 20) return;
		char[][] arr = new char[qtdItens][];
		preencherArr(arr);
		desenharGrafico(arr);
	}

	public static void preencherArr(char[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			int qtdCaracteres = r.nextInt(0, 51); // A escala do gráfico varia de 0 a 50
			arr[i] = new char[qtdCaracteres];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 42; // 42 == *
			}
		}
	}

	public static void desenharGrafico(char[][] arr) {
		int qtdItem = 0, qtdCaracteres = 0;
		for (char[] is : arr) {
			System.out.print("Item " + ++qtdItem + " : ");
			for (char is2 : is) {
				System.out.print(is2);
				qtdCaracteres++;
			}
			System.out.println(" - " + qtdCaracteres);
			qtdCaracteres = 0;
		}
	}
}
