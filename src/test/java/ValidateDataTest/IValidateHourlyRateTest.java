package ValidateDataTest;
import org.example.entity.AdministrativeStaff;
import org.example.logica.update.UpdateHourlyRate;
import org.example.logica.update.UpdateSex;
import org.example.validatedata.IValidateHourlyRate;
import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import javax.swing.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class IValidateHourlyRateTest {
    @Test
    public void testValidHourlyRateWithValidInput() {
        IValidateHourlyRate hourlyRateValidator = new IValidateHourlyRate() {};
        try (MockedStatic<JOptionPane> mockedJOptionPane = mockStatic(JOptionPane.class)) {
            // Simulate user input and return valid hourly rate
            mockedJOptionPane.when(() -> JOptionPane.showInputDialog(null, "What is the hourly Rate of the employee?"))
                    .thenReturn("15.0");



            double hourlyRate = hourlyRateValidator.validHourlyRate();

            assertEquals(15.0, hourlyRate, 0.01);
        }
    }

    @Test
    public void testValidHourlyRateWithInvalidInput() {
        IValidateHourlyRate hourlyRateValidator = new IValidateHourlyRate() {};
        try (MockedStatic<JOptionPane> mockedJOptionPane = mockStatic(JOptionPane.class)) {
            // Simulate user input and return invalid input first, then valid hourly rate
            mockedJOptionPane.when(() -> JOptionPane.showInputDialog(null, "What is the hourly Rate of the employee?"))
                    .thenReturn("invalid", "12.0");

            double hourlyRate = hourlyRateValidator.validHourlyRate();

            assertEquals(12.0, hourlyRate, 0.01);
        }
    }


}
