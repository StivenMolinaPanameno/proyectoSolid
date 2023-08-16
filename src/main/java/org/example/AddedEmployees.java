package org.example;

import java.util.List;
import org.example.entity.AdministrativeStaff;

public class AddedEmployees {
  public List<AdministrativeStaff> empleadosAgregados(List<AdministrativeStaff> employees) {
    employees.add(
        new AdministrativeStaff(
            "Carlos",
            "Call Poniente",
            23434234,
            "Masculino",
            "antfadf@gamil.com",
            "Contaduria",
             342.3,
            (short) 34,
            1,
            (342.3 * 34)));
    employees.add(
        new AdministrativeStaff(
            "Marcos",
            "Calle sur",
            423423423,
            "Masculino",
            "anadf@gamil.com",
            "roquero",
             242.4,
            (short) 54,
            2,
             (242.4 * 54)));
    employees.add(
        new AdministrativeStaff(
            "Marta",
            "Norte",
            234234324,
            "Femenina",
            "antfadf@gamil.com",
            "RRHH",
                423.2,
            (short) 56,
            3,
             (423.2 * 56)));

    return employees;
  }
}
