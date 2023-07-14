package org.example.logica;

import org.example.AdministrativeStaff;

import java.util.List;

public class EmpleadosAgregados {
    public void empleadosAgregados(List<AdministrativeStaff> employees) {
        employees.add(new AdministrativeStaff("Carlos", "Call Poniente", "9449023-3","Masculino","antfadf@gamil.com","Contaduria",
                (double) 342.3,(short) 34, 1));
        employees.add(new AdministrativeStaff("Marcos", "Calle sur", "9424023","Masculino","anadf@gamil.com","roquero",
                (double) 242.4,(short) 54, 2));
        employees.add(new AdministrativeStaff("Marta", "Norte", "234240233","Femenina","antfadf@gamil.com","RRHH",
                (double) 423.2,(short) 56, 3));
    }
}
