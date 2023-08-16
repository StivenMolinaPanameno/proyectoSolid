package org.example.logica.update;

import javax.swing.*;
import org.example.entity.AdministrativeStaff;

public class UpdateSex implements IUpdateExecute {
  @Override
  public void updateExecute(AdministrativeStaff employee) {
    String data = JOptionPane.showInputDialog(null, "What is the sex of the employee");
    employee.setSex(data);
  }
}
