package avAlgoritmo1;

import java.util.Scanner;

//	Crie um algoritmo que receba a hora de início e a hora de término de um jogo
//	(cada hora é composta por duas variáveis hora e minuto). Calcule e mostre a
//	duração do jogo (horas e minutos), sabendo-se que o tempo máximo da
//	duração do jogo é de 24 horas e que ele pode iniciar-se em um dia e terminar
//	no dia seguinte. 
public class Exercicio10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int inicioEmHoras, inicioEmMinutos, terminoEmMinutos, terminoEmHoras, duracaoDoJogoEmHoras = 0, duracaoDoJogoEmMinutos = 0;
		System.out.println("\u001B[31mEm horas:\u001B[0m");
		System.out.println("Digite quando começou o jogo");
		inicioEmHoras = in.nextInt();
		System.out.println("Digite quando terminou esse jogo");
		terminoEmHoras = in.nextInt();
		System.out.println("\u001B[31mEm minutos:\u001B[0m");
		System.out.println("Digite quando terminou esse jogo");
		inicioEmMinutos = in.nextInt();
		System.out.println("Digite quando terminou esse jogo");
		terminoEmMinutos = in.nextInt();
		
		// Normalmente para descobrir a duração de algo, diminuimos o maior pelo menor
		// Como estamos lidando com horas
		// Quando ele passar uma hora depois do dia acabar, há conflito
		// Trataremos nessa condição
		if(terminoEmHoras < inicioEmHoras) {
			duracaoDoJogoEmHoras = 24 * 60; 
		}
		
		// O tempo máximo da duração do jogo é de 24 horas

		in.close();
	}
}
