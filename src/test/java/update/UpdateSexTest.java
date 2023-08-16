package update;

import org.example.entity.AdministrativeStaff;
import org.example.logica.update.UpdateSex;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import javax.swing.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class UpdateSexTest {

    @Test
    void testUpdateExecute() {
        // Simulate user input
        try (MockedStatic<JOptionPane> mockedJOptionPane = Mockito.mockStatic(JOptionPane.class)) {
            mockedJOptionPane.when(() -> JOptionPane.showInputDialog(null, "What is the sex of the employee"))
                    .thenReturn("Male");

            AdministrativeStaff employee = mock(AdministrativeStaff.class);
            UpdateSex updateSex = new UpdateSex();
            updateSex.updateExecute(employee);

            // Verify that the setSex method was called with the expected value
            verify(employee).setSex("Male");
        }
    }
}
