package org.example.logica.update;

import org.example.AdministrativeStaff;

import javax.swing.*;

public class UpdateRol implements IUpdateRol{

    @Override
    public void updateRol(AdministrativeStaff employee) {
        String data = JOptionPane.showInputDialog(null, "What is the new Rol in the company");
        employee.setPosition(data);

    }
}
