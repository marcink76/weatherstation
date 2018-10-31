package pl.coni.weatherstation.utils;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class HTTPRequestSender {

    public <Parameters> void httpSender(String ip, Parameters params) throws IOException, InterruptedException {

        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2).build();

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create("http://" + ip + "/" + params)).GET().build();

        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println(httpRequest);
        System.out.println(response);
    }
}

