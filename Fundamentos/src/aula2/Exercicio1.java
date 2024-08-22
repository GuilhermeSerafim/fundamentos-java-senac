package aula2;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		String aluno;
		int  n1, n2, n3, n4, media;
		double mediaDouble;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome: ");
		aluno = sc.nextLine();
		System.out.println("Informe as 4 notas: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		media = (n1 + n2 +n3 + n4) / 4;
		// Como a conta é em inteiro [5 números int], o resultado vai ignorar o resto, e vai atribuir à variavel
		mediaDouble = (n1 + n2 + n3 + n4) / 4;
		double mediaDouble2 = (n1 + n2 +n3 + n4) / 4.0; // Resultado em double
		System.out.printf("A média do aluno %s em int é %d\n", aluno, media);
		System.out.printf("A média do aluno %s com a conta feita em inteiro e armazenado em double é %05.2f\n", aluno, mediaDouble);
		System.out.printf("A média do aluno %30s em double2 é %05.2f\n", aluno, mediaDouble2);
		
		// Podemos usar tanto o prinf para formatação, quanto String.format
	}
}
