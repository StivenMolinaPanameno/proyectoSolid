package org.example.logica.update;

import java.util.List;
import javax.swing.*;
import org.example.validatedata.IValidateID;
import org.example.entity.AdministrativeStaff;
import org.example.logica.principalmenu.IEmpleadoAction;
import org.example.validatedata.IvalidOption;

public class Update extends MenuUpdate implements IEmpleadoAction, IValidateID{

  private UpdateAtributeHandler updateHandler = InjectionDependency.injection();

  @Override
  public void execute(List<AdministrativeStaff> employees) {

    AdministrativeStaff employee = getEmployee(employees);
    int option = menuOption(employee);
    if(employee != null){
      updateHandler.updateAttribute(employee, option);
      JOptionPane.showMessageDialog(null, "Update succefull");
    }else {
      JOptionPane.showMessageDialog(null, "Employee not found");
    }


  }

  public AdministrativeStaff getEmployee(List<AdministrativeStaff> employees){
    int id = validID();
    for (AdministrativeStaff employee : employees) {
      if (employee.getIdEmpleado() == id) {
        return employee;
      }
    }
    return null;
  }

}
