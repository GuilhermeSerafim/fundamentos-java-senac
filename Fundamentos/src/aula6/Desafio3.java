package aula6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Desafio3 {
	public static void main(String[] args) {
		try {
			gerarTxt("C:/teste/arquivo.txt", 1000);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void gerarTxt(String caminho, int qtdCaracteres) throws IOException {
		File file = new File(caminho);
		Random rand = new Random();
		FileWriter fw = new FileWriter(file);
		for (int i = 0; i < qtdCaracteres; i++) {
			char c = (char) rand.nextInt(33, 127);
			fw.write(c);
		}
		fw.close();
	}
}
