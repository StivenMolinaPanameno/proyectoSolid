package org.example.entity;

import lombok.Getter;
import lombok.Setter;

public abstract class Person {
  @Getter @Setter private String name;
  @Getter @Setter private String adress;
  @Getter @Setter private int cel;
  @Getter @Setter private String sex;


  protected Person() {}

  protected Person(String name, String address, int cel, String sex) {
    this.name = name;
    this.adress = address;
    this.cel = cel;
    this.sex = sex;
  }
}
