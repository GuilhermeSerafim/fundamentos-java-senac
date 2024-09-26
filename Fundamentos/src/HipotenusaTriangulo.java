import java.util.Scanner;

public class HipotenusaTriangulo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double ladoA, ladoB, hipotenusa;
		System.out.println("Digite o lado A e B para calcular a hipotenusa de um triângulo retangulo:");
		ladoA = in.nextDouble();
		ladoB = in.nextDouble();
		hipotenusa = calcularHipotenusa(ladoA, ladoB);
		System.out.printf("A Hipotenusa deste triângulo retangulo é %.2f", hipotenusa);
		in.close();
	}

	private static double calcularHipotenusa(double ladoA, double ladoB) {
		return Math.sqrt((ladoA * ladoA) + (ladoB * ladoB));
	}
}
