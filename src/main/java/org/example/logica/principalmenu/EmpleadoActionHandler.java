package org.example.logica.principalmenu;
import com.itextpdf.text.DocumentException;
import java.io.FileNotFoundException;
import java.util.List;
import org.example.entity.AdministrativeStaff;


public class EmpleadoActionHandler {

  IEmpleadoAction[] actions;

  public EmpleadoActionHandler(IEmpleadoAction[] action) {
    this.actions = action;
  }

  public void crudImplementation(List<AdministrativeStaff> employees, int option) throws DocumentException, FileNotFoundException {
    if (option >= 1 && option <= actions.length) {
      IEmpleadoAction action = actions[option - 1];
      action.execute(employees);
    }
  }
}
