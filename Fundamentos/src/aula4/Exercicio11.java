package aula4;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		int vl1, vl2, temp; // Precisamos de uma variavel temporária para mover o valor enquanto, armazena na temp.
		Scanner in = new Scanner(System.in);
		System.out.println("Digite os valores de A e B sequencialmente");
		vl1 = in.nextInt();
		vl2 = in.nextInt();
		// Troca de valores:
		temp = vl1;
		vl1 = vl2;
		vl2 = temp;
		System.out.printf("Novo conteúdo da variável A %d e B %d", vl1, vl2);
		in.close();
	}
}
