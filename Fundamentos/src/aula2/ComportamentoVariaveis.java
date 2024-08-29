package aula2;

import java.util.Scanner;

public class ComportamentoVariaveis {
	public static void main(String[] args) {
		String nome; // Posso declarar para atribuir depois
//		var nome1; // Menos váriaveis
		final String nome2;
		Scanner in = new Scanner(System.in);
		System.out.println("Qual é o seu nome?");
		nome = in.next(); // O método next() da classe Scanner em Java lê a próxima "palavra" da entrada
		System.out.println("Olá, " + nome + "!");
//		nome1 = "Gui"; // Não funciona
		nome2 = "Gaby";
		in.close();
	}
}
