package update;

import org.example.entity.AdministrativeStaff;
import org.example.logica.update.UpdateRol;
import org.example.logica.update.UpdateSex;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import javax.swing.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class UpdateRolTest {
    @Test
    void testUpdateExecute() {
        // Simulate user input
        try (MockedStatic<JOptionPane> mockedJOptionPane = Mockito.mockStatic(JOptionPane.class)) {
            mockedJOptionPane.when(() -> JOptionPane.showInputDialog(null, "What is the new Rol in the company"))
                    .thenReturn("Manager");

            AdministrativeStaff employee = mock(AdministrativeStaff.class);
            UpdateRol updateRol = new UpdateRol();
            updateRol.updateExecute(employee);

            // Verify that the setSex method was called with the expected value
            verify(employee).setPosition("Manager");
        }
    }


}
