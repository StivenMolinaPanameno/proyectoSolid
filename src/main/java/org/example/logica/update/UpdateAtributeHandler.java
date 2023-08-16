package org.example.logica.update;

import org.example.entity.AdministrativeStaff;


public class UpdateAtributeHandler {
  IUpdateExecute[] actionUpdate ;

  public UpdateAtributeHandler(IUpdateExecute[] actionUpdate) {
    this.actionUpdate = actionUpdate;
  }

  public void updateAttribute(AdministrativeStaff employee, int option) {
    if (option >= 1 && option <= actionUpdate.length) {
      IUpdateExecute action = actionUpdate[option - 1];
      action.updateExecute(employee);
    }
  }
}


