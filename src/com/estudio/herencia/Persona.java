package com.estudio.herencia;

public class Persona {

    String nombre;
    String apellido;

    Persona(){


    }

    Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido= apellido;
    }

    public String levantarse(){
        return "Estoy levantado";
    }
}
