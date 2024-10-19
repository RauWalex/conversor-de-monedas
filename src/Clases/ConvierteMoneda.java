package Clases;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConvierteMoneda {

    public ConsultaMoneda convierteMoneda (String moneda1, String moneda2, double cantidadAConvertir) throws IOException, InterruptedException {
        String direccion = "https://v6.exchangerate-api.com/v6/6931958f66b6ac684aa37ee2/pair/"+moneda1+"/"+moneda2+"/"+cantidadAConvertir;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        Gson gson = new Gson().newBuilder().setPrettyPrinting().create();
        return gson.fromJson(response.body(),ConsultaMoneda.class);

    }
}
