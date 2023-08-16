package org.example.logica.update;

import org.example.validatedata.IValidateHourlyRate;
import org.example.entity.AdministrativeStaff;

public class UpdateHourlyRate implements IUpdateExecute, IValidateHourlyRate {


  @Override
  public void updateExecute(AdministrativeStaff employee) {
    employee.setHourlyRate(validHourlyRate());
  }
}
