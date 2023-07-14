package org.example.logica.update;

import org.example.AdministrativeStaff;
import org.example.ValidateData.IValidateSalary;

import javax.swing.*;

public class UpdateSalary implements IUpdateSalary, IValidateSalary {

    @Override
    public void updateSalary(AdministrativeStaff employee) {
        double salary;
        salary = validSalary();
        employee.setSalary(salary);
    }
}
