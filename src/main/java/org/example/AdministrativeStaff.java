package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class AdministrativeStaff extends Person {
    @Getter @Setter
    private long dui;
    @Getter @Setter
    private String email;
    @Getter @Setter
    private Date dateAdmision;
    @Getter @Setter
    private String position;
    @Getter @Setter
    private String salary;
    @Getter @Setter
    private short hours;
//Mensaje de prueba

    public AdministrativeStaff(long dui, String email, Date dateAdmision, String position, String salary, short hours) {
        this.dui = dui;
        this.email = email;
        this.dateAdmision = dateAdmision;
        this.position = position;
        this.salary = salary;
        this.hours = hours;
    }

    public AdministrativeStaff() {

    }
}
