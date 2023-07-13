package org.example;

import lombok.Getter;
import lombok.Setter;

public abstract class Person {
    @Getter @Setter
    private String nombre;
    @Getter @Setter
    private String direccion;
    @Getter @Setter
    private String cel;
    @Getter @Setter
    private String sexo;
    @Getter @Setter
    private String edad;

    public Person(){

    }

    public Person(String nombre, String direccion, String cel, String sexo, String edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cel = cel;
        this.sexo = sexo;
        this.edad = edad;
    }
}
