package org.example.validatedata;

import javax.swing.*;

public interface IValidateNumberPhone {
    default int validPhone(){

        int num = 0;
        do {
            try {
                String data = JOptionPane.showInputDialog(null, "What is the number phone of the employee");
                num = Integer.parseInt(data);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Type only numbers, no letters");
                num = 0;
            }
        } while (num <= 0);
        return num;
    }
}
