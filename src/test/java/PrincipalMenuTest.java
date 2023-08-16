import com.itextpdf.text.DocumentException;
import org.example.entity.AdministrativeStaff;
import org.example.logica.createpdf.CreatePDF;
import org.example.logica.delete.Delete;
import org.example.logica.principalmenu.IEmpleadoAction;
import org.example.logica.principalmenu.Menu;
import org.example.logica.search.Search;
import org.example.logica.show.ShowEmployees;
import org.example.logica.update.InjectionDependency;
import org.example.logica.update.MenuUpdate;
import org.example.logica.update.Update;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.*;

public class PrincipalMenuTest {


    @Test
    public void showMenuOptionsTest() {


        try (MockedStatic<JOptionPane> mockedJOptionPane = Mockito.mockStatic(JOptionPane.class)) {
            mockedJOptionPane.when(() -> JOptionPane.showInputDialog(any(), any()))
                    .thenReturn("2");
            List<AdministrativeStaff> employees = new ArrayList<>();
            AdministrativeStaff employee = mock(AdministrativeStaff.class);
            employees.add(employee);
            IEmpleadoAction[] actions = {
                    InjectionDependency.IRegisterInjection(), new ShowEmployees(), new Update(), new Delete(), new Search(), new CreatePDF()
            };



            Menu menuService = new Menu(actions); // Or your actual class that contains menuOption()
            when(menuService.showMenuOptions()).thenReturn("2");
            String result = menuService.showMenuOptions();

            Assert.assertEquals("2", result); // Verify that the correct option is returned
        }
    }


    @Test
    public void testMenuPrincipal() throws DocumentException, FileNotFoundException {
        List<AdministrativeStaff> employees = new ArrayList<>();
        AdministrativeStaff employee = mock(AdministrativeStaff.class);
        employees.add(employee);
        IEmpleadoAction[] actions = {
                InjectionDependency.IRegisterInjection(), new ShowEmployees(), new Update(), new Delete(), new Search(), new CreatePDF()
        };

        Menu menu = new Menu(actions);

        // Simulate user input of "1" (Name)
        String input = "7";
        int option = menu.validOption(input);
        menu.crudImplementation(employees, option);

        Assert.assertEquals(7, option);;
    }
}

