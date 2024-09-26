package avAlgoritmo1;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char sexo;
		double altura, pesoIdeal;
		System.out.println("Informe o sexo da pessoa, M - Masculino | F - Feminino: ");
		sexo = in.next().charAt(0);
		System.out.println("Informe a altura em centímetros: ");
		altura = in.nextDouble();
		
		if(sexo == 'F')
		{
			pesoIdeal =  52 + (0.75 * (altura - 152.4));
			System.out.printf("Peso ideal: %.2f", pesoIdeal);
		} else 
		{
			pesoIdeal = 52 + (0.67 * (altura - 152.4));
			System.out.printf("Peso ideal: %.2f", pesoIdeal);
		}
		in.close();
	}
}
