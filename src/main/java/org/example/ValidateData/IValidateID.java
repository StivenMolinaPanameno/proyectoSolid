package org.example.ValidateData;

import javax.swing.*;

public interface IValidateID {
    default int validID(){
        String data;
        int num = 0;
        do{
            try{
                data = JOptionPane.showInputDialog(null, "What is the ID of the employee");
                num = Integer.parseInt(data);
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Type only numbers, no letters");
                num = 0;
            }
        }while(num <= 0);
        return num;
    }
}
