package org.example;

import org.example.ValidateData.IValidateHours;
import org.example.ValidateData.IValidateID;
import org.example.ValidateData.IValidateSalary;

import javax.swing.*;
import java.util.List;

public class Register implements IValidateHours, IValidateSalary, IValidateID {

     public void Data(List<AdministrativeStaff> employees){
        short num = 0;
        double salary = 0;
        int generic;

            String data;
            AdministrativeStaff employee = new AdministrativeStaff();
            generic = validID();
            employee.setIdEmpleado(generic);
            data = JOptionPane.showInputDialog(null, "What is the sex of the employee");
            employee.setSex(data);
            data = JOptionPane.showInputDialog(null, "What is the name of the employee");
            employee.setName(data);;
            data = JOptionPane.showInputDialog(null, "What is the adress of the employee");
            employee.setAdress(data);
            data = JOptionPane.showInputDialog(null, "What is the email of the employee");
            employee.setEmail(data);
            data = JOptionPane.showInputDialog(null, "What is the cel of the employee");
            employee.setCel(data);
            data = JOptionPane.showInputDialog(null, "What is the rol in the company");
            employee.setPosition(data);
            num = validHours();
            employee.setHours(num);
            salary = validSalary();
            employee.setSalary(salary);

            employees.add(employee);
            JOptionPane.showMessageDialog(null, "Registered employee");

    }
}
