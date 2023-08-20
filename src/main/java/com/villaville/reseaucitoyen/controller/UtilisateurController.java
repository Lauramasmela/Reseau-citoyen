package com.villaville.reseaucitoyen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtilisateurController {

    @GetMapping(path = "/testPage")
    public String helloWorld(){
        return "Hello wooorld !!!";
    }

}
