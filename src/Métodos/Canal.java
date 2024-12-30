package Métodos;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

import Datos.Monedero;

public class Canal{


    public Monedero crearConsulta(String direccionApi){
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(direccionApi)).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Monedero.class);

        } catch (Exception e) {
            throw new RuntimeException("Ocurrió un error imprevisto");
        }
    
        
    };
}
