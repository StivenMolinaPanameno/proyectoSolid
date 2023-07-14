package org.example;

import lombok.Getter;
import lombok.Setter;

public abstract class Person {
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String adress;
    @Getter @Setter
    private String cel;
    @Getter @Setter
    private String sex;
    @Getter @Setter
    private int age;

    public Person(){

    }

    public Person(String name, String adress, String cel, String sex) {
        this.name = name;
        this.adress = adress;
        this.cel = cel;
        this.sex = sex;

    }
}
