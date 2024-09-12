package aula4;

public class Exercicio6 {
	public static void main(String[] args) {
		int a = 1, b = 5, c = 6;
		double delta, x, y;
		delta = (Math.pow(b, 2) - 4) * a * c;
		x = (-b + Math.sqrt(delta)) / 2 * a;
		y = (-b - Math.sqrt(delta)) / 2 * a;
		System.out.println("Delta: " + delta);
		System.out.println("X:" + x);
		System.out.println("Y:" + y);
	}
}
