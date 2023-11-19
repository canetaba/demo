package cote.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

import javax.print.attribute.standard.Media;

@Controller("/hello")
public class PapuController {

    @Get
    @Produces(MediaType.APPLICATION_JSON)
    public String index() {
        return "Hola Papu";
    }
}
