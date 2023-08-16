package update;

import org.example.entity.AdministrativeStaff;
import org.example.logica.update.IUpdateExecute;
import org.example.logica.update.UpdateName;
import org.example.logica.update.UpdateRol;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import javax.swing.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class UpdateNameTest {
    @Test
    void testUpdateExecute() {
        // Simulate user input
        try (MockedStatic<JOptionPane> mockedJOptionPane = Mockito.mockStatic(JOptionPane.class)) {
            mockedJOptionPane.when(() -> JOptionPane.showInputDialog(null, "what is the new name"))
                    .thenReturn("Gerrard");

            AdministrativeStaff employee = mock(AdministrativeStaff.class);
            IUpdateExecute updateName = new UpdateName();
            updateName.updateExecute(employee);

            // Verify that the setPosition method was called with the expected value
            verify(employee).setName("Gerrard");
        }
    }
}
