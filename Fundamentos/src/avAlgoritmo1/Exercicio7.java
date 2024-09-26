package avAlgoritmo1;

import java.util.Scanner;

public class Exercicio7 {
	// Códigos ANSI para cores
	public static final String BLACK = "\033[0;30m";
	public static final String RED = "\033[0;31m";
	public static final String GREEN = "\033[0;32m";
	public static final String YELLOW = "\033[0;33m";
	public static final String BLUE = "\033[0;34m";
	public static final String PURPLE = "\033[0;35m";
	public static final String CYAN = "\033[0;36m";
	public static final String WHITE = "\033[0;37m";
	public static final String RESET = "\033[0m";

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double peso, altura, imc;
		System.out.println("Digite sua altura em m: ");
		altura = in.nextDouble();
		System.out.println("Digite seu peso em kg: ");
		peso = in.nextDouble();
		imc = peso / (altura * altura);
		
		  if (imc <= 16) {
	            System.out.println(BLACK + "Classificação do IMC: Magreza Severa" + RESET);
	        } else if (imc > 16 && imc <= 17) {
	            System.out.println(PURPLE + "Classificação do IMC: Magreza Moderada" + RESET);
	        } else if (imc > 17 && imc <= 18.5) {
	            System.out.println(CYAN + "Classificação do IMC: Magreza Leve" + RESET);
	        } else if (imc > 18.5 && imc <= 25) {
	            System.out.println(GREEN + "Classificação do IMC: Normal" + RESET);
	        } else if (imc > 25 && imc <= 30) {
	            System.out.println(YELLOW + "Classificação do IMC: Obesidade Leve" + RESET);
	        } else if (imc > 30 && imc <= 40) {
	            System.out.println(BLUE + "Classificação do IMC: Obesidade Severa" + RESET);
	        } else {
	            System.out.println(RED + "Classificação do IMC: Obesidade Mórbida" + RESET);
	        }
		
		in.close();
	}
}
