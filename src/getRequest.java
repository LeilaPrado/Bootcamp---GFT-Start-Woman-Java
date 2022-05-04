import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class getRequest {

    //public static final String urlGET= "https://jsonplaceholder.typicode.com/posts";
    public static final String urlGET = "http://httpbin.org/get";

    public static void main(String[] args) throws IOException, InterruptedException {

        //Cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        //Requisição
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .timeout(Duration.ofSeconds(10))
                .uri(URI.create(urlGET))
                .build();

        //Enviar solicitação
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        //Imprimir o conteúdo recebido
        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}

