package projetoIntegrador;

import java.util.Scanner;

public class ExH {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite uma mensagem");
		String msg = in.nextLine().toUpperCase();
		String nvMsg = "";
		for (int i = 0; i < msg.length(); i++) {
			if (msg.charAt(i) != ' ') {
				nvMsg += msg.charAt(i);
				// Se não for o último caractere da string, adiciona o hífen
				if (i != msg.length() - 1) {
					nvMsg += "-";
				}
			}
		}
		System.out.println(nvMsg);
	}
}
