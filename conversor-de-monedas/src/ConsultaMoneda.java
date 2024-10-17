import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    public double buscaDivisas(String monedaBase, String monedaDeDestino, double valor){
        URI direccion = URI.
                create("https://v6.exchangerate-api.com/v6/7143ae90b8683b47ba231fb8/pair/"+ monedaBase+"/"+monedaDeDestino+"/"+valor);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {

                Divisas divisa = new Gson().fromJson(response.body(), Divisas.class);

                return valor * divisa.conversion_rate();
            } else {
                throw new ApiException("Error en la API: " + response.statusCode());
            }
        } catch (Exception e) {
            throw new ApiException("Conversión no disponible", e);
        }
    }
}
