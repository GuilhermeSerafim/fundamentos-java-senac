package projetoIntegradorB;

// Usados para ler o conteúdo do arquivo.
import java.io.BufferedReader;
import java.io.FileReader;
// IOException: para tratar possíveis erros ao acessar o arquivo.
import java.io.IOException;
import java.util.Scanner;

public class ADOA {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		String filePath = "C:\\Users\\T600517\\git\\mock.csv";
		System.out.println("Informe um modelo de celular");
		var modeloCelular = in.nextLine();
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String linha;
			// Ler a primeira linha (cabeçalho) e ignorar, se necessário
			String cabecalho = br.readLine();
			System.out.println("Cabeçalho: " + cabecalho);

			// Ler as linhas restantes
			while ((linha = br.readLine()) != null) {
				// Divide a linha pelo delimitador (geralmente ",")
				String[] colunas = linha.split(",");

				// Exemplo de manipulação dos dados (assumindo colunas: id, nome, gênero,
				// celular, carro)
				if(colunas[3].equalsIgnoreCase(modeloCelular)) {
					System.out.println("ID: " + colunas[0]);
					System.out.println("Nome: " + colunas[1]);
					System.out.println("Gênero: " + colunas[2]);
					System.out.println("Celular: " + colunas[3]);
					System.out.println("Carro: " + colunas[4]);
					System.out.println("-------------------");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
