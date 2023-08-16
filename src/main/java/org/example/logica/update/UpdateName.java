package org.example.logica.update;

import javax.swing.*;
import org.example.entity.AdministrativeStaff;

public class UpdateName implements IUpdateExecute {

  @Override
  public void updateExecute(AdministrativeStaff employee) {

    String data = JOptionPane.showInputDialog(null, "what is the new name");
    employee.setName(data);
  }
}
