import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Service {
    public static void consultarCep(String cep) {
        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://viacep.com.br/ws/" + cep + "/json/"))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            ObjectMapper mapper = new ObjectMapper();
            JsonNode json = mapper.readTree(response.body());

            if (json.has("erro")) {
                System.out.println("Erro: CEP inválido.");
                return;
            }

            // String logradouro = json.get("logradouro").asText();
            // String bairro = json.get("bairro").asText();
            // String localidade = json.get("localidade").asText();
            // String uf = json.get("uf").asText();
            // String cepResult = json.get("cep").asText();

            System.out.println("Cep: " + json.get("cep").asText());
            System.out.println("Logradouro: " + json.get("logradouro").asText());
            System.out.println("Bairro: " + json.get("bairro").asText());
            System.out.println("Município: " + json.get("localidade").asText());
            System.out.println("Estado: " + json.get("uf").asText());

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
