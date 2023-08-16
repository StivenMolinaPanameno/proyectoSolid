package org.example.logica.update;

import javax.swing.*;
import org.example.entity.AdministrativeStaff;
import org.example.validatedata.IvalidOption;

public class MenuUpdate implements IvalidOption {
  public int menuOption(AdministrativeStaff employee) {
    int option = 0;
    String data = input(employee);
    option = validOption(data);
    return option;
  }

  public String input(AdministrativeStaff employee){

    String data =
            JOptionPane.showInputDialog(
                    null,
                    "What is the element of the employee you want to modify"
                            + "\n1. Name: "
                            + employee.getName()
                            + "\n2. Email: "
                            + employee.getEmail()
                            + "\n3. Sex: "
                            + employee.getSex()
                            + "\n4. Rol: "
                            + employee.getPosition()
                            + "\n5. Address: "
                            + employee.getAdress()
                            + "\n6. Hourly Rate: "
                            + employee.getHourlyRate()
                            + "\n7. Don't modify more/ "
                            + "If you want to exit, press 7");
    return data;
  }
}
