package update;

import org.example.entity.AdministrativeStaff;
import org.example.logica.update.UpdateAdress;
import org.example.logica.update.UpdateSex;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import javax.swing.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class UpdateAddressTest {
    @Test
    void testUpdateExecute() {
        // Simulate user input
        try (MockedStatic<JOptionPane> mockedJOptionPane = Mockito.mockStatic(JOptionPane.class)) {
            mockedJOptionPane.when(() -> JOptionPane.showInputDialog(null, "What is the new Address"))
                    .thenReturn("Street");

            AdministrativeStaff employee = mock(AdministrativeStaff.class);
            UpdateAdress updateAddress = new UpdateAdress();
            updateAddress.updateExecute(employee);

            // Verify that the setSex method was called with the expected value
            verify(employee).setAdress("Street");
        }
    }
}
