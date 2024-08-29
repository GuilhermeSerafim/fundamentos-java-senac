package aula2;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		double celsius, kelvins;
		Scanner in = new Scanner(System.in);
		System.out.println("Informe a temperatura em graus Celsius");
		celsius = in.nextDouble();
		System.out.printf("");

		// x++ - Pós incremento
		// ++x - Pré incremento
		// Estamos mechendo em 2 variaveis aqui
		int x = 10;
		int y = x++; // x == 11 e y == 10, pois ele vai incrementar depois
		
		int a = 10;
		int b = ++x; // a == 11 e b == 11, pois ele vai realizar um pré incremento 

	}
}
