package com.vominh.rest;

import com.vominh.dto.Hero;
import com.vominh.service.JsonServices;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;


@Path("/hero")
public class SuperHeroController {

    // Access via localhost:8080/rest/hero
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getAll() {
        List<Hero> heros = new ArrayList();
        heros.add(new Hero("Spiderman", 16));
        heros.add(new Hero("Superman", 35));
        heros.add(new Hero("Flash", 26));

        JsonArrayBuilder list = Json.createArrayBuilder();
        return JsonServices.toJson(heros);
    }

}
