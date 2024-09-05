package aula3;
import java.util.Scanner;

// Calcular área e perimetro de um circulo
// A=πr^2 e C=πr (circuferência)
public class Exercicico5 {
	public static void main(String[] args) {
		// Math.pow(b, exp) -> Calcular expoente
		// Math.sqrt() -> Pegar raiz quadrada
		// Math.PI
		Scanner in = new Scanner(System.in);
		double raio, area, perimetro;
		System.out.println("Digite o raio de um círculo: ");
		raio = in.nextDouble();
		area = Math.PI * Math.pow(raio, 2);
		perimetro = 2.0 * Math.PI * raio;
		System.out.printf("A área do círculo é ≈ %5.2f cm%nO perimetro do círculo é ≈ %5.2f cm", area, perimetro);
		in.close();
	}
}

