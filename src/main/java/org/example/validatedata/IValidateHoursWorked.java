package org.example.validatedata;

import javax.swing.*;

public interface IValidateHoursWorked {
  default short validHourlyWorked() {
    short hours = 0;

    do {
      try {
        String data = JOptionPane.showInputDialog(null, "How many hours worked by the employee?");
        hours = Short.parseShort(data);

        if (hours <= 0) {
          JOptionPane.showMessageDialog(null, "Please enter a positive number of hours.");
        }
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Please enter a valid number.");
      }
    } while (hours <= 0);

    return hours;
  }
}
