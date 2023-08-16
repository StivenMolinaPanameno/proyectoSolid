package update;

import org.example.entity.AdministrativeStaff;
import org.example.logica.update.UpdateEmail;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import javax.swing.*;

import static org.mockito.Mockito.*;

public class UpdateEmailTest {
    @Test
    public void testUpdateExecute() {
        // Simulate user input
        try (MockedStatic<JOptionPane> mockedJOptionPane = Mockito.mockStatic(JOptionPane.class)) {
            mockedJOptionPane.when(() -> JOptionPane.showInputDialog(null, "What is the new Email"))
                    .thenReturn("test@example.com");

            AdministrativeStaff mockEmployee = mock(AdministrativeStaff.class);
            UpdateEmail updateEmail = new UpdateEmail();
            updateEmail.updateExecute(mockEmployee);

            // Verify that the setEmail method was called with the expected value
            verify(mockEmployee).setEmail("test@example.com");
        }
    }
}
