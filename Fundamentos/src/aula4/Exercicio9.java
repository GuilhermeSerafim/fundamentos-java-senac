package aula4;

import java.util.Scanner;

/*
 * Sabe-se que 1 𝑝é = 12 𝑝𝑜𝑙𝑒𝑔𝑎𝑑𝑎𝑠, 1 𝑗𝑎𝑟𝑑𝑎 = 3 𝑝é𝑠, 1 𝑚𝑖𝑙ℎ𝑎 = 1760 𝑗𝑎𝑟𝑑𝑎𝑠 .
	Crie um algoritmo que receba uma medida em pés, faça as conversões e
	mostre os resultados em:
	a) Polegadas;
	b) Jardas;
	c) Milhas. 
 * */
public class Exercicio9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int qtdPes, qtdJardas, qtdMilhas, polegadas;
		System.out.println("Digite a medida em pés");
		qtdPes = in.nextInt();
		polegadas = qtdPes *  12; // 1 𝑝é = 12 𝑝𝑜𝑙𝑒𝑔𝑎𝑑𝑎𝑠
		qtdJardas = qtdPes / 3; // 3 𝑝é𝑠 = 1 𝑗𝑎𝑟𝑑𝑎
		qtdMilhas = qtdJardas / 1760; // 1 𝑚𝑖𝑙ℎ𝑎 = 1760 𝑗𝑎𝑟𝑑𝑎𝑠
		System.out.printf("Polegadas: %d", polegadas);
		System.out.printf("Jardas: %d", qtdJardas);		
		System.out.printf("Milhas: %d", qtdMilhas);		
		in.close();
	}
}
