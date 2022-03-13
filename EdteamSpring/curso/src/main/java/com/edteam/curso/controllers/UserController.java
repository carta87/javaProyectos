package com.edteam.curso.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController//solo con esta Anotacion(java 8) es con Arquitetura Rest
@RequestMapping("user")//direcion de url que se va consultar
public class UserController {

    @RequestMapping(value = "/holaMundo", method = RequestMethod.GET)
    String holaMundo(){
        return "Hola Mundo con Maven";
    }
}
