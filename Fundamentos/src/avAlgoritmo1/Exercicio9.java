package avAlgoritmo1;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int opcao;
		double num1, num2, resultado;

		System.out.println("**** Menu de Opções *****");
		System.out.println("1. Somar dois números");
		System.out.println("2. Raiz quadrada de um número");
		System.out.println("3. Elevar um número a uma potência");
		System.out.println("**** Digite a opção desejada ****");

		opcao = in.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Digite o primeiro número: ");
			num1 = in.nextDouble();
			System.out.println("Digite o segundo número: ");
			num2 = in.nextDouble();
			resultado = num1 + num2;
			System.out.printf("Resultado: %.2f%n", resultado);
			break;
		case 2:
			System.out.println("Digite o número: ");
			num1 = in.nextDouble();
			resultado = Math.sqrt(num1);
			System.out.printf("Resultado: %.2f%n", resultado);
			break;
		case 3:
			System.out.println("Digite a base: ");
			num1 = in.nextDouble();
			System.out.println("Digite o expoente: ");
			num2 = in.nextDouble();
			resultado = Math.pow(num1, num2);
			System.out.printf("Resultado: %.2f%n", resultado);
			break;
		default:
			System.out.println("Opção inválida.");
			break;
		}

		in.close();
	}
}
