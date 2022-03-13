package com.edteam.curso.controllers;


import com.edteam.curso.models.User;
import org.apache.catalina.LifecycleState;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController//solo con esta Anotacion(java 8) es con Arquitetura Rest
@RequestMapping("user")//direcion de url que se va consultar
public class UserController {

    //trae todos los usuarios por defecto en formato JSON
    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<User> getAll(){
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setName("Juan");
        user.setApellido("tafur");
        list.add(user);
        return list;
    }
    //traer los usuarios por id
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    User get(@PathVariable long id){
        User user = new User();
        user.setName("Juan");
        user.setApellido("tafur");
        return user;
    }
    //crear Usuario
    @RequestMapping(value = "/", method = RequestMethod.POST)
    User register(@RequestBody User user){//lo que va devolver es todo el cuepo del formulario
        // TODO: registrarlo en la base de datos
        return user;
    }
    //actaulizar usuario por id
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    User update(@RequestBody User user){
      //TODO: actualizarlo en la base de datos
        return user;
    }

    //eliminar usuario por id
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable long id){
        //TODO: elimanarlo de la base de datos
    }

}

