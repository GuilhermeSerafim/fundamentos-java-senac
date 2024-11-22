package avaliacao2;

import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {
	static Scanner in = new Scanner(System.in);
	static Random r = new Random();

	public static void main(String[] args) {
		// Quantidades e percentuais
		int qtdAlunosPesquisa, accMatutino = 0, accVespertino = 0, accNoturno = 0, acc24Anos = 0, acc2AnoGraduacao = 0,
				accEmpregados = 0, qtdAlunosComBolsaDeEstudos = 0,somaPcBolsaEstudos = 0, somaIdade = 0, mediaIdade, mediaDosDescontosDaBolsa;
		double pcEmpregados, pcBolsaEstudos;
		System.out.println("Quantos estudantes vão responder a pesquisa? ");
		qtdAlunosPesquisa = in.nextInt();

		for (int i = 0; i < qtdAlunosPesquisa; i++) {
			int periodo, idade, anoGraduacao, ehEmpregado, temBolsa;
			double pcBolsa;
			System.out.println("Qual periodo você é? Digite 1 para matutino, 2 para vespertino e 3 para noturno:");

			do {
				periodo = r.nextInt(-2, 9);
				if (periodo < 0 || periodo > 3)
					System.out.println("Informe um periodo válido");
			} while (periodo < 0 || periodo > 3);
			if (periodo == 1)
				accMatutino++;
			if (periodo == 2)
				accVespertino++;
			if (periodo == 3)
				accNoturno++;

			System.out.println("Digite sua idade: ");
			do {
				idade = r.nextInt(-2, 150);
				if (idade < 0 || idade > 100)
					System.out.println("Informe uma idade válida");
			} while (idade < 0 || idade > 100);
			if (idade <= 24) {
				acc24Anos++;
				somaIdade += idade;
			}

			System.out.println("Informe o ano da sua graduação: ");
			do {
				anoGraduacao = r.nextInt(-2, 10);
				if (anoGraduacao < 0 || anoGraduacao > 4)
					System.out.println("Informe um ano válido");
			} while (anoGraduacao < 0 || anoGraduacao > 4);
			if (anoGraduacao == 2)
				acc2AnoGraduacao++;

			System.out.println("Está empregado? Digite [1], se não, digite [0]");
			do {
				ehEmpregado = r.nextInt(-2, 4);
				if (ehEmpregado < 0 || ehEmpregado > 1)
					System.out.println("Informe um valor correto");
			} while (ehEmpregado < 0 || ehEmpregado > 1);
			if (ehEmpregado == 1)
				accEmpregados++;

			System.out.println("Possui bolsa de estudos? Digite [1], se não, digite [0]");
			do {
				temBolsa = r.nextInt(-2, 4);
				if (temBolsa < 0 || temBolsa > 4)
					System.out.println("Informe um valor correto");
			} while (temBolsa < 0 || temBolsa > 4);
			if (temBolsa == 1) {
				qtdAlunosComBolsaDeEstudos++;
				System.out.println("Informe o percentual do desconto concendido da sua bolsa");
				do {
					pcBolsa = r.nextInt(-5, 101);
					if (pcBolsa < 0)
						System.out.println("Informe um valor válido");
				} while (pcBolsa < 0);
				somaPcBolsaEstudos += pcBolsa;
			}
		}
		mediaIdade = qtdAlunosPesquisa / somaIdade;
		mediaDosDescontosDaBolsa = somaPcBolsaEstudos / qtdAlunosComBolsaDeEstudos;
		pcEmpregados = (double) (qtdAlunosPesquisa / accEmpregados) * 100;
		pcBolsaEstudos = (double) (qtdAlunosPesquisa / qtdAlunosComBolsaDeEstudos) * 100;

		System.out.printf("-------------------------%n");
		System.out.printf("|			ITEM	 		|		VALOR		|%n");
		System.out.printf("|Alunos do periodo matutino  |		%3d			|%n", accMatutino);
		System.out.printf("|Alunos do periodo vespertino|		%3d			|%n", accVespertino);
		System.out.printf("|Alunos do periodo noturno	|		%3d			|%n", accNoturno);
		System.out.printf("|Alunos de 24 anos 			| 		%3d			|%n", acc24Anos);
		System.out.printf("|Média de idades dos alunos 	| 		%3d			|%n", mediaIdade);
		System.out.printf("|Alunos cursando 2º ano		| 		%3d			|%n", acc2AnoGraduacao);
		System.out.printf("|% de alunos empregados		| 		%3.2f%%		|%n", pcEmpregados);
		System.out.printf("|% de alunos empregados		| 		%3.2f%%		|%n", pcBolsaEstudos);
		System.out.printf("|%médio de desconto concedido| 		%3d%%		|%n", mediaDosDescontosDaBolsa);

	}
}
