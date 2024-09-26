package avAlgoritmo1;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Digite o valor de X: ");
		double x = in.nextDouble();
		System.out.println("Digite o valor de Y: ");
		double y = in.nextDouble();
		System.out.println("Digite o valor de Z: ");
		double z = in.nextDouble();

		if ((x < y + z) && (y < x + z) && (z < x + y)) {
			if (x == y && y == z) {
				System.out.println("É um triângulo equilátero.");
			} else if (x == y || x == z || y == z) {
				System.out.println("É um triângulo isósceles.");
			} else {
				System.out.println("É um triângulo escaleno.");
			}
		} else {
			System.out.println("Os valores não formam um triângulo.");
		}

		in.close();
	}
}
