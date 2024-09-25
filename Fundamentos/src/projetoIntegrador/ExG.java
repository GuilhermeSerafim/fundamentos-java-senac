package projetoIntegrador;

import java.util.Scanner;

public class ExG {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite uma mensagem");
		String msg = in.nextLine();
		String nvMsg = "";
		for(int i = 0; i < msg.length(); i++) {
			nvMsg += msg.charAt(i) + "-";
		}
		System.out.println(nvMsg);
	}
}
