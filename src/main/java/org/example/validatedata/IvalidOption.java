package org.example.validatedata;

import javax.swing.*;

public interface IvalidOption {
    default int validOption(String str){
        try {
            int option = Integer.parseInt(str);
            return option;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid option! Please choose a valid option.");
            return -1;
        }
    }
}

