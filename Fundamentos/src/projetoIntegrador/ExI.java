package projetoIntegrador;

import java.util.Scanner;

public class ExI {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		System.out.println("Informe um texto");
		String msg = in.nextLine();
		String nvMsg = "";
		
		for(int i = 0; i < msg.length(); i++) {
			nvMsg = msg.charAt(i) + nvMsg;
		}
		System.out.println(nvMsg);
	}
}
