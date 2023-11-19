package cote.controller;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.MediaType;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@MicronautTest
public class PaupuControllerTest {


    @Inject
    @Client("/")
    HttpClient client;


    @Test
    public void testHello() {
        HttpRequest<?> request = HttpRequest.GET("/hello").accept(MediaType.APPLICATION_JSON);
        String body = client.toBlocking().retrieve(request);

        assertNotNull(body);
        assertEquals("Hola Papu", body);
    }

}
