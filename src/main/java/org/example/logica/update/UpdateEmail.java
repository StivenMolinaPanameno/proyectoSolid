package org.example.logica.update;

import javax.swing.*;
import org.example.entity.AdministrativeStaff;

public class UpdateEmail implements IUpdateExecute {
  @Override
  public void updateExecute(AdministrativeStaff employee) {

    String data = JOptionPane.showInputDialog(null, "What is the new Email");
    employee.setEmail(data);
  }
}
