package org.example.logica.update;

import org.example.AdministrativeStaff;

import javax.swing.*;

public class UpdateSex implements IUpdateSex{
    @Override
    public void updateSex(AdministrativeStaff employee) {
        String data = JOptionPane.showInputDialog(null, "What is the sex of the employee");
        employee.setSex(data);
    }
}
