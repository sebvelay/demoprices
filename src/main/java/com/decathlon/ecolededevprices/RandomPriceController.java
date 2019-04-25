package com.decathlon.ecolededevprices;


import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RandomPriceController {


    @Cacheable("price")
    @GetMapping("/price/{id}")
    public Integer getPrice(@PathVariable String id){

        int max =70;
        int min = 30;
        Random r = new Random();
        int prix = r.nextInt((max - min) + 1) + min;
        return prix;
    }

}
