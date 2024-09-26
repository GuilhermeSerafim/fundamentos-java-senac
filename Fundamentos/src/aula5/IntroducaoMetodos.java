package aula5;

import java.util.Scanner;

public class IntroducaoMetodos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double n1, n2, resultado;
		char operacao;
		System.out.println("Informe 2 números: ");
		n1 = in.nextDouble();
		n2 = in.nextDouble();
		System.out.println("Qual operação deseja fazer?");
		operacao = in.next().charAt(0);		
		resultado = calcular(n1, n2, operacao);
		System.out.printf("Resultado %d",resultado);
		in.close();
	}
	
	public static int calcular(int n1, int n2, char operacao) {
		return switch (operacao) {
		case '+' -> n1 + n2;
		case '-' -> n1 - n2;
		case '*' -> n1 * n2;
		case '/' -> n1 / n2;
		default -> throw new IllegalArgumentException("Operação inválida: " + operacao);
		};
	}
	
	// Conseguimos criar 2 métodos com o mesmo nome, 
	// mas assinaturas diferentes (assinatura = nome(parametros))
	
	/**
	 * Descrição do que o método faz.
	 *
	 * @param Número 1
	 * @param Número 2
	 * @param Tipo da operação
	 * @return Resultado
	 * @throws IllegalArgumentException Se a operação for inválida
	 */
	public static double calcular(double n1, double n2, char operacao) {
		return switch (operacao) {
		case '^' -> Math.pow(n1, n2);
		case '%' -> n1 % n2;
		default -> throw new IllegalArgumentException("Operação inválida: " + operacao);
		};
	}
}
