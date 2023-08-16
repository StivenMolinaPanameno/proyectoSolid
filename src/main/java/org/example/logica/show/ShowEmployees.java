package org.example.logica.show;

import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.example.entity.AdministrativeStaff;
import org.example.logica.principalmenu.IEmpleadoAction;

public class ShowEmployees implements IEmpleadoAction {

  @Override
  public void execute(List<AdministrativeStaff> employees) {

    DefaultTableModel model = createTableModel(employees);

    JTable table = new JTable(model);
    JScrollPane scrollPane = new JScrollPane(table);

    JOptionPane.showMessageDialog(null, scrollPane, "Employees", JOptionPane.INFORMATION_MESSAGE);
  }
  DefaultTableModel createTableModel(List<AdministrativeStaff> employees) {
    String[] columnNames = {"ID employee", "Sex", "Name", "Adress", "Email", "Phome number", "Rol", "Hours Worked", "Hourly Rate", "Total Salary"};
    DefaultTableModel model = new DefaultTableModel(columnNames, 0);

    for (AdministrativeStaff employee : employees) {
      Object[] rowData = {employee.getIdEmpleado(), employee.getSex(), employee.getName(), employee.getAdress(), employee.getEmail(), employee.getCel(),
              employee.getPosition(),
              employee.getHoursWorked(),
              employee.getHourlyRate(),
              employee.getSalaryTotal()
      };
      model.addRow(rowData);
    }

    return model;
  }
}
