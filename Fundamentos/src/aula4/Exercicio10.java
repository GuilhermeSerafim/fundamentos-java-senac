package aula4;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite os valores dos catetos de um triângulo");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		System.out.println("A hipotenusa é " + c);
		in.close();
	}
}
