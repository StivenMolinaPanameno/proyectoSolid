package org.example.logica.search;

import java.util.List;
import javax.swing.*;
import org.example.validatedata.IValidateID;
import org.example.entity.AdministrativeStaff;
import org.example.logica.principalmenu.IEmpleadoAction;

public class Search implements IValidateID, IEmpleadoAction {
  IShowSearch show = new ShowSearchImplement();
  @Override
  public void execute(List<AdministrativeStaff> employees) {
    AdministrativeStaff employee = getEmployee(employees);
    if(employee != null){
      show.showSearch(employee);
    }else {
      JOptionPane.showMessageDialog(null, "Employee not found");

    }

  }

  public AdministrativeStaff getEmployee(List<AdministrativeStaff> employees){
    int id = validID();
    for (AdministrativeStaff employee : employees) {

      if (employee.getIdEmpleado() == id) {
        JOptionPane.showMessageDialog(null, "Employee record found");
        return employee;
      }
    }
    return null;
  }
}
