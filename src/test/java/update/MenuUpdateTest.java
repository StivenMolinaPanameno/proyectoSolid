package update;

import org.example.entity.AdministrativeStaff;
import org.example.logica.update.MenuUpdate;
import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.verification.VerificationMode;

import javax.swing.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class MenuUpdateTest {
    @Test
    public void testMenuOption() {
        AdministrativeStaff mockEmployee = mock(AdministrativeStaff.class);
        when(mockEmployee.getName()).thenReturn("John Doe");
        when(mockEmployee.getEmail()).thenReturn("john@example.com");
        when(mockEmployee.getSex()).thenReturn("Male");
        when(mockEmployee.getPosition()).thenReturn("Manager");
        when(mockEmployee.getAdress()).thenReturn("123 Main St");
        when(mockEmployee.getHourlyRate()).thenReturn(25.0);

        MenuUpdate menuUpdate = new MenuUpdate();

        // Simulate user input of "1" (Name)
        String input = "1";
        int option = menuUpdate.validOption(input);

        assertEquals(1, option);;
    }
    @Test
    public void testMenuOption2() {
        AdministrativeStaff mockEmployee = mock(AdministrativeStaff.class);
        when(mockEmployee.getName()).thenReturn("John Doe");
        when(mockEmployee.getEmail()).thenReturn("john@example.com");
        when(mockEmployee.getSex()).thenReturn("Male");
        when(mockEmployee.getPosition()).thenReturn("Manager");
        when(mockEmployee.getAdress()).thenReturn("123 Main St");
        when(mockEmployee.getHourlyRate()).thenReturn(25.0);

        MenuUpdate menuUpdate = new MenuUpdate();

        // Simulate user input of "1" (Name)
        String input = "2";
        int option = menuUpdate.validOption(input);

        assertEquals(2, option);;
    }

    @Test
    public void testInput() {


        try (MockedStatic<JOptionPane> mockedJOptionPane = Mockito.mockStatic(JOptionPane.class)) {
            mockedJOptionPane.when(() -> JOptionPane.showInputDialog(any(), any()))
                    .thenReturn("2");
            AdministrativeStaff employee = mock(AdministrativeStaff.class);

            MenuUpdate menuService = new MenuUpdate(); // Or your actual class that contains menuOption()

            String result = menuService.input(employee);

            assertEquals("2", result); // Verify that the correct option is returned
        }
    }

    @Test
    public void testMenuOption4(){
        AdministrativeStaff mockEmployee = mock(AdministrativeStaff.class);

        // Simulate input value and option
        String inputValue = "2"; // Assuming option 2 is a valid option
        when(mockEmployee.getName()).thenReturn("Test Employee");

        try (MockedStatic<JOptionPane> mockedJOptionPane = Mockito.mockStatic(JOptionPane.class)) {
            mockedJOptionPane.when(() -> JOptionPane.showInputDialog(any(), any()))
                    .thenReturn(inputValue);

            MenuUpdate menuService = new MenuUpdate(); // Or your actual class that contains menuOption()

            int result = menuService.menuOption(mockEmployee);

            assertEquals(2, result); // Verify that the correct option is returned
        }
    }
}
