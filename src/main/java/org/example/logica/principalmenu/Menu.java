package org.example.logica.principalmenu;

import com.itextpdf.text.DocumentException;
import java.io.FileNotFoundException;
import java.util.List;
import javax.swing.*;
import org.example.entity.AdministrativeStaff;
import org.example.validatedata.IvalidOption;


public class Menu extends EmpleadoActionHandler implements IvalidOption {
  private int option;

  public Menu(IEmpleadoAction[] action) {
    super(action);
  }

  public void PrincipalMenu(List<AdministrativeStaff> employees) throws DocumentException, FileNotFoundException {
    do {
      String input = showMenuOptions();
      option = validOption(input);
      crudImplementation(employees, option);
    } while (option != 7);
  }

  public String showMenuOptions() {
    return JOptionPane.showInputDialog(
            null,
            "Choose one of the options: \n"
                    + "      1. Register employee\n"
                    + "      2. Show all employees\n"
                    + "      3. Modify some employee\n"
                    + "      4. Delete employees\n"
                    + "      5. Search employees\n"
                    + "      6. Create PDF employees\n"
                    + "      7. Exit",
            "MENU PRINCIPAL",
            JOptionPane.PLAIN_MESSAGE);
  }

}
