// Crie um algoritmo que receba o nome e o salário de um funcionário.
// E calcule seu novo salário com aumento de 25%
// Mostrea frase com o nome, o valor do aumento e o novo salário

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite seu nome ");
		String nome = in.nextLine();
		System.out.println("Digite seu salário ");
		double salario = in.nextDouble();
		double aumento = salario * 0.25;
		double nvSalario = aumento + salario;
		System.out.printf("O funcionário %s recebeu um aumento de 25%% - %7.2f, seu novo salário é de %7.2f", nome,
				aumento, nvSalario);
		in.close();

	}

}
