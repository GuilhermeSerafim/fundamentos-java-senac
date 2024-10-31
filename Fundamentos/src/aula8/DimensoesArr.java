package aula8;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class DimensoesArr {
	static Random r = new Random();
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// ex1();
		// ex2();
		ex3();
	}

	public static void ex1() {
		int[][] idades = new int[5][15];
		// Percorrendo arr bidmensional
		for (int time = 0; time < idades.length; time++) {
			for (int jogador = 0; jogador < idades[time].length; jogador++) {
				System.out.println("Informe a idade");
				idades[time][jogador] = r.nextInt(16, 24);
				System.out.println(idades[time][jogador]);
			}
		}
	}

	public static void ex2() {
		// Campeonato, time e jogador
		int[][][] idades = new int[3][5][15];
		// Percorrendo arr tridimensional
		for (int campeonato = 0; campeonato < idades.length; campeonato++) {
			for (int time = 0; time < idades[campeonato].length; time++) {
				for (int jogador = 0; jogador < idades[campeonato][time].length; jogador++) {
					System.out.println("Informe a idade");
					idades[campeonato][time][jogador] = r.nextInt(16, 24);
				}
			}
		}
		// int[][][] idades = new int[3] -> [5][15]; -> Tenho que percorrer esse arr
		// bidimensional, pois é oq está dentro do meu arr tridimensional
		// Se eu quero ler os valores do campeonato, vou ter que declarar o tipo que
		// está dentro dlee
		for (int campeonato[][] : idades) {
			// E dentro time, preciso saber o arr unidimensional (tradicional) para
			// consequentemente depois, eu percorrer os jogadores
			for (int[] time : campeonato) {
				for (int jogadorIdade : time) {
					System.out.println("Idade: " + jogadorIdade);
				}
			}
		}
	}
	public static void ex3() {
		int campeonatos, times, jogadores;
		campeonatos = in.nextInt();
		times = in.nextInt();
		jogadores = in.nextInt();
		int[][][] idades = new int[campeonatos][times][jogadores];
		for (int campeonato = 0; campeonato < idades.length; campeonato++) {
			for (int time = 0; time < idades[campeonato].length; time++) {
				for (int jogador = 0; jogador < idades[campeonato][time].length; jogador++) {
					System.out.println("Informe a idade");
					idades[campeonato][time][jogador] = r.nextInt(16, 24);
				}
			}
		}
		for (int campeonato[][] : idades) {
			for (int[] time : campeonato) {
				for (int jogadorIdade : time) {
					System.out.println("Idade: " + jogadorIdade);
				}
			}
		}
	}
}
