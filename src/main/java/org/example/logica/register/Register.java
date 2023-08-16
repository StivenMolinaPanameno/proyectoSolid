package org.example.logica.register;

import java.util.List;
import javax.swing.*;
import org.example.validatedata.IValidateHoursWorked;
import org.example.validatedata.IValidateID;
import org.example.validatedata.IValidateHourlyRate;
import org.example.validatedata.IValidateNumberPhone;
import org.example.entity.AdministrativeStaff;
import org.example.logica.principalmenu.IEmpleadoAction;

public class Register implements IEmpleadoAction{

  private final IValidateID validateID;
  private final IValidateNumberPhone validatePhone;
  private final IValidateHoursWorked validateHours;
  private final IValidateHourlyRate validateRate;


  public Register(IValidateID validateID, IValidateNumberPhone validatePhone,
                  IValidateHoursWorked validateHours, IValidateHourlyRate validateRate) {
    this.validateID = validateID;
    this.validatePhone = validatePhone;
    this.validateHours = validateHours;
    this.validateRate = validateRate;
  }


  @Override
  public void execute(List<AdministrativeStaff> employees) {
    AdministrativeStaff employee = new AdministrativeStaff();

    employee.setIdEmpleado(validateID.validID());
    employee.setSex(showInputDialog("sex"));
    employee.setName(showInputDialog("name"));
    employee.setAdress(showInputDialog("address"));
    employee.setEmail(showInputDialog("email"));
    employee.setCel(validatePhone.validPhone());
    employee.setPosition(showInputDialog("Role"));
    employee.setHoursWorked(validateHours.validHourlyWorked());
    employee.setHourlyRate(validateRate.validHourlyRate());
    employee.setSalaryTotal(employee.getHoursWorked() * employee.getHourlyRate());

    employees.add(employee);
    showMessageDialog("Registered employee");
  }

  public String showInputDialog(String message) {
    return JOptionPane.showInputDialog(null, "Enter " + message + " of the employee");
  }

  public void showMessageDialog(String message) {
    JOptionPane.showMessageDialog(null, message);
  }
}
