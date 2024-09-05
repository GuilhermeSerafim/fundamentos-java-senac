package aula3;
import java.util.Scanner;

// Calcule a média ponderada
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double n1, n2, n3, p1, p2, p3, mediaPonderada;
		System.out.println("Digite as 3 notas");
		n1 = in.nextDouble();
		n2 = in.nextDouble();
		n3 = in.nextDouble();
		System.out.println("Digite os 3 pesos");
		p1 = in.nextDouble();
		p2 = in.nextDouble();
		p3 = in.nextDouble();
		mediaPonderada = ((n1 * p1) + (n2 * p2) + (n3 * p3)) / (p1 + p2 + p3);
		System.out.printf(
				"Nota 1: %4.1f | Peso 1: %2f %n Nota 2: %4.1f | Peso 2: %2f %n Nota 3: %4.1 Peso 3: %2f %n Média: %4.1f",
				n1, p1, n2, p2, n3, p3, mediaPonderada);
		in.close();
	}

}
