package org.example.logica.update;

import org.example.AdministrativeStaff;

import javax.swing.*;

public class UpdateAdress implements IUpdateAdress{
    @Override
    public void updateAddress(AdministrativeStaff employee){
        String data = JOptionPane.showInputDialog(null, "What is the new Adress");
        employee.setAdress(data);

    }
}
