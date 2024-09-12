package aula4;

import java.util.Scanner;
// https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
public class Exercicio7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, c;
		double delta, x, y;
		System.out.println("Informe A:");
		a = in.nextInt();
		System.out.println("Informe B:");
		b = in.nextInt();
		System.out.println("Informe C:");
		c = in.nextInt();
		delta = (Math.pow(b, 2) - 4) * a * c;
		x = (-b + Math.sqrt(delta)) / 2 * a;
		y = (-b - Math.sqrt(delta)) / 2 * a;
		System.out.println("Delta: " + delta);
		System.out.println("X:" + x);
		System.out.println("Y:" + y);
		in.close();
	}
}
