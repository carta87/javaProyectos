package com.edteam.curso.models;

import java.util.Date;

public class User {
    private long id;
    private String name;
    private String apellido;
    private String email;
    private String telefono;
    private Date fechaNac;

    public  User(){
    }

    public User(long id, String name, String apellido, String email, String telefono, Date fechaNac) {
        this.id = id;
        this.name = name;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.fechaNac = fechaNac;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
}
