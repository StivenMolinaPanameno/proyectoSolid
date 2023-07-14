package org.example.logica.update;

import org.example.AdministrativeStaff;

import javax.swing.*;

public class UpdateName implements IUpdateName{

    @Override
    public void updateName(AdministrativeStaff employee) {

            String data= JOptionPane.showInputDialog(null, "what is the new name");
            employee.setName(data);

    }
}
