package com.vominh.rest;

import com.vominh.dto.Hero;
import com.vominh.service.JsonServices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/hero")
public class SuperHeroController {

    // Access via localhost:8080/hero
    @ResponseBody
    @RequestMapping( method = RequestMethod.GET, produces = "application/json")
    public String welcome() {
        List<Hero> heros = new ArrayList();
        heros.add(new Hero("Spiderman", 16));
        heros.add(new Hero("Superman", 35));
        heros.add(new Hero("Flash", 26));

        return JsonServices.toJson(heros);
    }
}
