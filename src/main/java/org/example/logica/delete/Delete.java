package org.example.logica.delete;

import org.example.AdministrativeStaff;
import org.example.ValidateData.IValidateID;
import org.example.logica.Menu;

import javax.swing.*;
import java.util.List;

public class Delete implements IValidateID {
    public void deleteData(List<AdministrativeStaff> employees){
        int id = validID();
        boolean search = false;
        for (AdministrativeStaff employee : employees) {
            if (employee.getIdEmpleado() == id) {
                employees.remove(employee);
                JOptionPane.showMessageDialog(null, "Employee deleted");

                search = true;
            }

        }
        if(!search){
            JOptionPane.showMessageDialog(null, "Employee with id: "+id+"not found for delete");
        }

    }

}
