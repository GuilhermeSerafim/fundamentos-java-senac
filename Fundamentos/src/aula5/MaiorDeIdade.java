package aula5;

import java.util.Scanner;

public class MaiorDeIdade {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade;
		System.out.println("Digite sua idade");
		idade = in.nextInt();
		var verificacao = verificaIdade(idade);
		System.out.println(verificacao);
		in.close();
	}
	
	public static String verificaIdade(int idade) {
		String verificacao = idade >= 18 ? "Maior de idade"
				: "Não é maior de idade";
		return verificacao;
	}
}
