package aula4;

import java.util.Scanner;

/*
	Crie um algoritmo que receba como entrada o valor do saque a ser realizado
	pelo cliente de um banco e retorne quantas notas de cada valor serão
	necessárias para atender ao saque com a menor quantidade de notas
	possível. Serão utilizadas notas de 100, 50, 20, 10 e 5 reais. 
	Dica ➔ lembrese do operador de resto da divisão de inteiros (%). Considere que os valores
	informados para saque serão sempre múltiplos de 5.
*/
public class Exercicio12 {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        System.out.println("Digite a entrada do valor do saque a ser realizado [nx5]");
        int valor = in.nextInt();
        int notas_100 = valor / 100;
        valor = valor % 100;
        int notas_50 = valor / 50;
        valor = valor % 50;
        int notas_20 = valor / 20;
        valor = valor % 20;
        int notas_10 = valor / 10;
        valor = valor % 10;
        int notas_5 = valor / 5;
        valor = valor % 5;
        System.out.println("Notas de 100: " + notas_100);
        System.out.println("Notas de 50: " + notas_50);
        System.out.println("Notas de 20: " + notas_20);
        System.out.println("Notas de 10: " + notas_10);
        System.out.println("Notas de 5: " + notas_5);
        in.close();
	}
}
