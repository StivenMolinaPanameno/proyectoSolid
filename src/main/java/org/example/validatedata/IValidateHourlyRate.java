package org.example.validatedata;

import javax.swing.*;

public interface IValidateHourlyRate {
  default double validHourlyRate() {
    String data;
    double salario;
    do {
      try {
        data = JOptionPane.showInputDialog(null, "What is the hourly Rate of the employee?");
        salario = Double.parseDouble(data);

      } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Type only numbers, no letters");
        salario = 0;
      }

    } while (salario <= 0);
    return salario;
  }
}
