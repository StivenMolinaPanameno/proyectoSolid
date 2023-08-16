package org.example.logica.update;

import org.example.logica.register.Register;
import org.example.validatedata.IValidateHourlyRate;
import org.example.validatedata.IValidateHoursWorked;
import org.example.validatedata.IValidateID;
import org.example.validatedata.IValidateNumberPhone;

public class InjectionDependency {
  public static UpdateAtributeHandler injection() {
     IUpdateExecute[] injection = {
      new UpdateName(),
      new UpdateEmail(),
      new UpdateSex(),
      new UpdateRol(),
      new UpdateAdress(),
      new UpdateHourlyRate()
    };
    return new UpdateAtributeHandler(injection);
  }
  public static Register IRegisterInjection(){
    IValidateID validateID = new IValidateID(){};
    IValidateNumberPhone validatePhone = new IValidateNumberPhone() {};
    IValidateHoursWorked validateHours = new IValidateHoursWorked() {};
    IValidateHourlyRate validateRate = new IValidateHourlyRate() {};
    Register register = new Register(validateID, validatePhone, validateHours, validateRate);
    return register;
  }

}
