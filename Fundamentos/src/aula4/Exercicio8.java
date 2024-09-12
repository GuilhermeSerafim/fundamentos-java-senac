package aula4;

import java.util.Scanner;

//Pedro comprou um saco de ração com peso em Kg. Ele possui dois gatos,
//para os quais fornece a quantidade de ração em gramas. A quantidade diária
//de ração fornecida para cada gato é sempre a mesma. Crie um algoritmo que
//receba o peso do saco de ração e a quantidade de ração fornecida para cada
//gato, calcule e mostre quanto restará de ração no saco após cinco dias. 
public class Exercicio8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double pesoSacoRacaoKg, distribuicaoDaRacaoParaCadaGatosEmGramas, racaoQuesRestouApos5Dias, consumoDeAcaoApos5DiasEmKg;
		int qtdGatos = 2, qtdDias = 5;
		System.out.println("Informe o peso do saco de ração em KG:");
		pesoSacoRacaoKg = in.nextDouble();
		System.out.println("Informe a distribuição de ração para cada gato em gramas POR DIA");
		distribuicaoDaRacaoParaCadaGatosEmGramas = in.nextDouble();
		consumoDeAcaoApos5DiasEmKg = ((distribuicaoDaRacaoParaCadaGatosEmGramas * qtdGatos) * qtdDias) / 1000;  // 1000 -> Conversão para Kilo
		racaoQuesRestouApos5Dias = pesoSacoRacaoKg - consumoDeAcaoApos5DiasEmKg;
		System.out.printf("Apos 5 dias restará %.2f KG de ração", racaoQuesRestouApos5Dias);
		in.close();
	}
}
