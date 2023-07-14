package org.example.logica.search;

import org.example.AdministrativeStaff;
import org.example.ValidateData.IValidateID;

import javax.swing.*;
import java.util.List;

public class Search extends ShowSearch implements IValidateID {
    public void buscar(List<AdministrativeStaff> employees) {
        boolean search = false;
        String element;
        int id;
        boolean generic;
        //ID del empleado que se desea buscar
        id = validID();

        for (AdministrativeStaff employee : employees) {
            if (employee.getIdEmpleado() == id) {
                showSearch(employee);
            }
        }

    }
}
