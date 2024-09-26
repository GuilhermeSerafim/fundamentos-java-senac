package aula5;

import java.util.Scanner;

public class classifTriangulo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double ladoA, ladoB, ladoC;
		System.out.println("Digite as medidas A, B e C de um trinagulo");
		ladoA = in.nextDouble();
		ladoB = in.nextDouble();
		ladoC = in.nextDouble();
		var classificacaoTriangulo = classificaTriangulo(ladoA, ladoB, ladoC);
		System.out.println(classificacaoTriangulo);
	}

	private static String classificaTriangulo(double ladoA, double ladoB, double ladoC) {
		String verificacao = 
				ladoA < ladoB + ladoC
				&& ladoB < ladoA + ladoC
				&& ladoC < ladoB + ladoA ? 
					// Igualdade transitiva
					ladoA == ladoB && ladoB == ladoC ? "Triângulo equilátero" :
					ladoA == ladoB || ladoB == ladoC || ladoC == ladoA ? "Triangulo isósceles" :
					"Triângulo escaleno"					
				: "Os valores não formam um triângulo.";
		
		return verificacao;
	}
}
