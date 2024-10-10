package aula6;

import java.util.Random;

public class Desafio2 {
	public static void main(String[] args) {
		String senha = gerarSenha(10);
		System.out.println(senha);
	}
	
	public static String gerarSenha(int tamanho) {
		Random rand = new Random();
		String senha = "";
		for (int i = 0; i < tamanho; i++) {
			char nRandom = (char) rand.nextInt(33, 127);
			senha += nRandom;
		}
		return senha;
	}
}
