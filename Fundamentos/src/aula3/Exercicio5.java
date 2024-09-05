// Calcular area e perimetro de um circulo
package aula3;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o raio de um círculo: ");
		double raio = in.nextDouble();
		double area = Math.PI * Math.pow(raio, 2);
		double perimetro = 2 * Math.PI * raio;
		System.out.printf("A área do círculo é: %.2f%n O perimetro do círculo é: %.2f" + area, perimetro);
	}
}
