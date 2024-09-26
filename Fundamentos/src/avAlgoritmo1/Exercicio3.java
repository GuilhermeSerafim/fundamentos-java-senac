package avAlgoritmo1;
import java.util.Scanner;

// Crie um algoritmo que leia o nome do aluno, suas 4 notas, calcule a média e
//classifique o resultado conforme a tabela abaixo. 
// Ao final, deverão ser exibidos o nome do aluno, suas 4 notas, sua média e sua classificação. 
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nomeAluno;
		int nota1, nota2, nota3, nota4, media;
		System.out.println("Informe o nome do aluno: ");
		nomeAluno = in.nextLine();

		System.out.println("Informe as notas [0 à 100]: ");
		nota1 = in.nextInt();
		nota2 = in.nextInt();
		nota3 = in.nextInt();
		nota4 = in.nextInt();
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.printf("Notas e media do aluno %s%n", nomeAluno);
		System.out.printf("Notas: %d, %d, %d e %d%n", nota1, nota2, nota3, nota4);
		System.out.printf("Média: %d%n", media);
		if (media <= 20) {
			System.out.printf("Classificação: Péssimo");
		} else if (media <= 40) {
			System.out.printf("Classificação: Ruim");
		} else if (media <= 60) {
			System.out.printf("Classificação: Regular");
		} else if (media <= 80) {
			System.out.printf("Classificação: Bom");
		} else {
			System.out.printf("Classificação: Ótimo");
		}
		in.close();
	}
}
