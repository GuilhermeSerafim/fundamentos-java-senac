package projetoIntegradorB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.awt.Desktop;
import java.util.Scanner;

public class ADOC {

	public static void main(String[] args) {
		final String API_KEY = "5c8765e3"; // Substitua pela sua API key do OMDB
		Scanner scanner = new Scanner(System.in);

		try {
			// Etapa 1: Solicita o nome do filme ao usuário
			System.out.println("Informe o nome do filme:");
			String nomeFilme = scanner.nextLine();

			// Etapa 2: Consulta à API OMDB para buscar filmes
			String urlBusca = "https://www.omdbapi.com/?s=" + nomeFilme.replace(" ", "+") + "&apikey=" + API_KEY;
			HttpURLConnection connection = (HttpURLConnection) new URL(urlBusca).openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Accept", "application/json");

			int responseCode = connection.getResponseCode();
			if (responseCode == 200) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				StringBuilder response = new StringBuilder();
				String line;
				while ((line = reader.readLine()) != null) {
					response.append(line);
				}
				reader.close();

				// Processar a resposta JSON
				String jsonResponse = response.toString();

				if (jsonResponse.contains("\"Response\":\"False\"")) {
					System.out.println("Nenhum filme encontrado com o nome informado.");
				} else {
					// Exibir lista de filmes
					System.out.println("Lista de filmes encontrados:");
					String[] filmes = jsonResponse.split("\\{");
					for (String filme : filmes) {
						if (filme.contains("\"imdbID\"")) {
							String titulo = extractValue(filme, "Title");
							String ano = extractValue(filme, "Year");
							String imdbID = extractValue(filme, "imdbID");
							System.out.println("Título: " + titulo);
							System.out.println("Ano: " + ano);
							System.out.println("ID: " + imdbID);
							System.out.println("-------------------");
						}
					}

					// Etapa 3: Solicitar o ID do filme ao usuário
					System.out.println("Informe o ID (imdbID) de um filme para abrir o poster:");
					String imdbIDSelecionado = scanner.nextLine();

					// Etapa 4: Consulta à API para obter detalhes do filme
					String urlDetalhes = "https://www.omdbapi.com/?i=" + imdbIDSelecionado + "&apikey=" + API_KEY;
					connection = (HttpURLConnection) new URL(urlDetalhes).openConnection();
					connection.setRequestMethod("GET");
					connection.setRequestProperty("Accept", "application/json");

					responseCode = connection.getResponseCode();
					if (responseCode == 200) {
						reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
						response = new StringBuilder();
						while ((line = reader.readLine()) != null) {
							response.append(line);
						}
						reader.close();

						// Abrir o poster no navegador
						String posterURL = extractValue(response.toString(), "Poster");
						if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
							Desktop.getDesktop().browse(new URI(posterURL));
						} else {
							System.out.println("Não foi possível abrir o navegador automaticamente.");
							System.out.println("Link do poster: " + posterURL);
						}
					} else {
						System.out.println("Erro ao buscar detalhes do filme.");
					}
				}
			} else {
				System.out.println("Erro ao conectar à API OMDB. Código de resposta: " + responseCode);
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

		scanner.close();
	}

	// Método para extrair valores do JSON manualmente
	private static String extractValue(String json, String key) {
		String searchKey = "\"" + key + "\":";
		int startIndex = json.indexOf(searchKey);

		if (startIndex == -1) {
			return ""; // Retorna vazio se a chave não for encontrada
		}

		startIndex += searchKey.length();
		char firstChar = json.charAt(startIndex);

		if (firstChar == '\"') { // Valor é uma string
			int endIndex = json.indexOf("\"", startIndex + 1);
			return json.substring(startIndex + 1, endIndex);
		} else { // Valor não é uma string (ex.: números ou nulo)
			int endIndex = json.indexOf(",", startIndex);
			if (endIndex == -1) {
				endIndex = json.indexOf("}", startIndex); // Último valor do JSON
			}
			return json.substring(startIndex, endIndex).trim();
		}
	}
}
