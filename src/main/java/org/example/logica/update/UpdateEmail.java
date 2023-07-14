package org.example.logica.update;

import org.example.AdministrativeStaff;

import javax.swing.*;

public class UpdateEmail implements IUpdateEmail{

    @Override
    public void updateEmail(AdministrativeStaff employee) {
        String data= JOptionPane.showInputDialog(null, "what is the new email");
        employee.setEmail(data);
    }
}
