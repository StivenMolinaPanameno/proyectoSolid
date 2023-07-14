package org.example.logica;

import org.example.AdministrativeStaff;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class ShowEmployees {
    public void showData(List<AdministrativeStaff> employees){

        String[] columnNames = {"ID employee", "Sex", "Name", "Adress", "Email", "Phome number", "Rol",
        "Hours", "Salary"};

        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        for (AdministrativeStaff employee : employees) {
            Object[] rowData = {employee.getIdEmpleado(), employee.getSex(), employee.getName(),
            employee.getAdress(), employee.getEmail(), employee.getCel(), employee.getPosition(), employee.getHours(), employee.getSalary()};
            model.addRow(rowData);
        }

        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        JOptionPane.showMessageDialog(null, scrollPane, "Employees", JOptionPane.INFORMATION_MESSAGE);
    }
}
