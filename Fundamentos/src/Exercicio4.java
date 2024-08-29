import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		double base, altura, area;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a base do triângulo: ");
		base = in.nextDouble();
		System.out.println("Digite a altura do triângulo: ");
		altura = in.nextDouble();
		area = (base * altura) / 2;
		System.out.println("A área do triângulo é: " + area);
		in.close();
	}
}
