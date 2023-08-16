package org.example.logica.delete;

import java.util.Iterator;
import java.util.List;
import javax.swing.*;
import org.example.validatedata.IValidateID;
import org.example.entity.AdministrativeStaff;
import org.example.logica.principalmenu.IEmpleadoAction;

public class Delete implements IValidateID, IEmpleadoAction {
  @Override
  public void execute(List<AdministrativeStaff> employees) {
    int id = validID();
    boolean search=false;

    Iterator<AdministrativeStaff> iterator = employees.iterator();
    while (iterator.hasNext()) {
      AdministrativeStaff element = iterator.next();

      if (element.getIdEmpleado() == id) {
        iterator.remove(); // Eliminar el elemento de forma segura
        JOptionPane.showMessageDialog(null, "Element deleted");
        search = true;

      }
    }
    if (search == false) {
      JOptionPane.showMessageDialog(null, "Employee with id: " + id + "not found for delete");
    }
  }
}
