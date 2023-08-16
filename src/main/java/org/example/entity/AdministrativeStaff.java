package org.example.entity;

import lombok.Getter;
import lombok.Setter;


public class AdministrativeStaff extends Person {
  @Getter @Setter private int idEmpleado;
  @Getter @Setter private String email;
  @Getter @Setter private String position;
  @Getter @Setter private double hourlyRate;
  @Getter @Setter private short hoursWorked;
  @Getter @Setter private double salaryTotal;

  public AdministrativeStaff(String name, String adress, int cel, String sex, String email, String position, double salary, short hours, int id, double salaryTotal) {

    super(name, adress, cel, sex);
    this.email = email;
    this.position = position;
    this.hourlyRate = salary;
    this.hoursWorked = hours;
    this.idEmpleado = id;
    this.salaryTotal = salaryTotal;
  }

  public AdministrativeStaff() {
  }


}
