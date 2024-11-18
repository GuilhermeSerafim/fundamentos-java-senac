package projetoIntegradorB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ADOB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o CEP (somente números): ");
        String cep = scanner.nextLine();

        if (cep.matches("\\d{8}")) { // Verifica se o CEP tem exatamente 8 dígitos
            String url = "https://viacep.com.br/ws/" + cep + "/json/";

            try {
                // Realiza a requisição HTTP
                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                connection.setRequestMethod("GET");
                connection.setRequestProperty("Accept", "application/json");

                int responseCode = connection.getResponseCode();

                if (responseCode == 200) { // Verifica se a resposta é OK
                    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    StringBuilder response = new StringBuilder();
                    String line;

                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                    }
                    reader.close();

                    // Processa manualmente o JSON (sem bibliotecas externas)
                    String jsonResponse = response.toString();

                    if (jsonResponse.contains("\"erro\": true")) {
                        System.out.println("CEP não encontrado.");
                    } else {
                        // Extrai informações diretamente do JSON usando strings
                        String logradouro = extractValue(jsonResponse, "logradouro");
                        String complemento = extractValue(jsonResponse, "complemento");
                        String bairro = extractValue(jsonResponse, "bairro");
                        String localidade = extractValue(jsonResponse, "localidade");
                        String uf = extractValue(jsonResponse, "uf");

                        System.out.println("Informações do CEP:");
                        System.out.println("Logradouro: " + logradouro);
                        System.out.println("Complemento: " + complemento);
                        System.out.println("Bairro: " + bairro);
                        System.out.println("Cidade: " + localidade);
                        System.out.println("Estado: " + uf);
                    }
                } else {
                    System.out.println("Erro ao consultar o CEP. Código de resposta: " + responseCode);
                }

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } else {
            System.out.println("CEP inválido. Certifique-se de inserir 8 dígitos.");
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
