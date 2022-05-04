import java.io.FileNotFoundException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.time.Duration;

public class postRequest {

    //public static final String urlPost= "https://jsonplaceholder.typicode.com/posts";
    public static final String urlPost = "http://httpbin.org/forms/post";
    public static final String uriFile = "src/pedido.json";


    public static void main(String[] args) throws FileNotFoundException {

        //Cliente
        HttpClient client = HttpClient.newHttpClient();

        //Requisição
        HttpRequest request = HttpRequest.newBuilder()
                //Funciona por default como GET
                //.POST(HttpRequest.BodyPublishers.ofFile(Path.of(uriFile)))
                .timeout(Duration.ofSeconds(10))
                .uri(URI.create(urlPost))
                .build();

        //enviar solicitação
            client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                    .thenApply(HttpResponse::body)
                    .thenAccept(System.out::println)
                    .join();

    }

}