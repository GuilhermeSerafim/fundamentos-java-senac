package projetoIntegrador;

import java.util.Scanner;

public class ExJ {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um texto:");
		String texto = in.nextLine()
				.replaceAll(" ", "")
				.toLowerCase();

		boolean ehPalindromo = true;
		for(int i = 0; i < texto.length() / 2; i++) {
			var x = texto.charAt(i);
			// O `- i` é o ajuste para andar da direita para a esquerda ao longo do loop.
			var y = texto.charAt(texto.length() - 1 - i);
			if (x != y) {
                ehPalindromo = false;
                break;
            }
		}

        if (ehPalindromo) {
            System.out.println("O texto é um palíndromo.");
        } else {
            System.out.println("O texto não é um palíndromo.");
        }
	}
}
