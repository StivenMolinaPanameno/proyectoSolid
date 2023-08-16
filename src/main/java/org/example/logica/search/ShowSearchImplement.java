package org.example.logica.search;

import javax.swing.*;
import org.example.entity.AdministrativeStaff;

public class ShowSearchImplement implements IShowSearch {

  @Override
  public void showSearch(AdministrativeStaff employee) {
    JOptionPane.showMessageDialog(
        null,
        "Data's Employee \nName: "
            + employee.getName()
            + "\nEmail: "
            + employee.getEmail()
            + "\nID employee: "
            + employee.getIdEmpleado()
            + "\nPhone: "
            + employee.getCel()
            + "\nSex: "
            + employee.getSex()
            + "\nRol: "
            + employee.getPosition()
            + "\nAdress: "
            + employee.getAdress());
  }
}
