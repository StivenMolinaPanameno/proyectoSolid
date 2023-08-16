package org.example;

import com.itextpdf.text.DocumentException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import org.example.entity.AdministrativeStaff;
import org.example.logica.createpdf.CreatePDF;
import org.example.logica.delete.Delete;
import org.example.logica.principalmenu.EmpleadoActionHandler;
import org.example.logica.principalmenu.IEmpleadoAction;
import org.example.logica.principalmenu.Menu;
import org.example.logica.register.Register;
import org.example.logica.search.Search;
import org.example.logica.show.ShowEmployees;
import org.example.logica.update.InjectionDependency;
import org.example.logica.update.Update;

public class Main {
  public static void main(String[] args) throws DocumentException, FileNotFoundException {
    IEmpleadoAction[] actions = {
            InjectionDependency.IRegisterInjection(), new ShowEmployees(), new Update(), new Delete(), new Search(), new CreatePDF()
    };
    new EmpleadoActionHandler(actions);
    List<AdministrativeStaff> empty = new ArrayList<>();
    List<AdministrativeStaff> employees;
    AddedEmployees add = new AddedEmployees();
    employees = add.empleadosAgregados(empty);

    Menu menu = new Menu(actions);
    menu.PrincipalMenu(employees);
  }
}
