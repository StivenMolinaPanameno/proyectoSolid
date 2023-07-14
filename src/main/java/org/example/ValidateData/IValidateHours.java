package org.example.ValidateData;

import javax.swing.*;

public interface IValidateHours {
     default short validHours() {
          String data;
          short hours;
          do {
               try {
                    data = JOptionPane.showInputDialog(null, "How many hours worked by the employee?");
                    hours = Short.parseShort(data);

               } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Type only numbers, no letters");
                    hours = 0;
               }

          } while (hours <= 0);
          return hours;
     }
}
