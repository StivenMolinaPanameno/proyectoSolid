package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class AdministrativeStaff extends Person {
    @Getter @Setter
    private int idEmpleado;
    @Getter @Setter
    private String email;
    @Getter @Setter
    private String position;
    @Getter @Setter
    private double salary;
    @Getter @Setter
    private short hours;
//Mensaje de prueba
    //Hice otro comentario


    public AdministrativeStaff( String email, String position, double salary, short hours, int id) {

        this.email = email;
        this.position = position;
        this.salary = salary;
        this.hours = hours;
        this.idEmpleado = id;
    }
    public AdministrativeStaff(String name, String adress, String cel, String sex, String email, String position, double salary, short hours, int id) {
        super( name,  adress,  cel,  sex);
        this.email = email;
        this.position = position;
        this.salary = salary;
        this.hours = hours;
        this.idEmpleado = id;
    }

    public AdministrativeStaff() {

    }
}
