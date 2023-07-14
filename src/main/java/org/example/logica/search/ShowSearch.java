package org.example.logica.search;

import org.example.AdministrativeStaff;
import org.example.logica.search.IShowSearch;

import javax.swing.*;

public class ShowSearch implements IShowSearch {

    @Override
    public void showSearch(AdministrativeStaff employee) {
        JOptionPane.showMessageDialog(null, "Data's Employee \nName: "+employee.getName()+
                "\nEmail: "+employee.getEmail()+
                "\nSex: "+employee.getSex()+
                "\nRol: "+employee.getPosition()+
                "\nfAdress: "+employee.getAdress());
    }
}
