package org.example.ValidateData;

import javax.swing.*;

public interface IValidateSalary {
    default double validSalary(){
        String data;
        double salario;
        do {
            try {
                data = JOptionPane.showInputDialog(null, "What is the salary of the employee?");
                salario = Double.parseDouble(data);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Type only numbers, no letters");
                salario = 0;
            }

        } while (salario <= 0);
        return salario;
    }
}
