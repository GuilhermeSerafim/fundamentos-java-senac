package aula7;

import java.util.Iterator;
import java.util.Scanner;

// Criar um metodo que receba o n de linhas e n de colunas e reproduza o desenho de uma matrix
public class Desafio1 {
	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		System.out.println("Digite a qtd de linhas");
		int qtdLinhas = in.nextInt();
		System.out.println("Digite a qtd de colunas");
		int qtdColunas = in.nextInt();
		imprimeMatrix(qtdLinhas, qtdColunas);
	}
	public static void imprimeMatrix(int linhas, int colunas) {
		int num = 1;
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.printf("%04d ", num++); // Incrementamos para a próxima repetição
			}
			System.out.println(); // Quando acabar a linha, vamos pular uma linha para formar as colunas
		}
	}
}
