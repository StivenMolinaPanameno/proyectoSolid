package org.example.logica.update;

import javax.swing.*;
import org.example.entity.AdministrativeStaff;

public class UpdateAdress implements IUpdateExecute {


  @Override
  public void updateExecute(AdministrativeStaff employee) {
    String data = JOptionPane.showInputDialog(null, "What is the new Address");
    employee.setAdress(data);
  }
}
