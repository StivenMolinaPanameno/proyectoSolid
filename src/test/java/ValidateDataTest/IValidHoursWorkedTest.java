package ValidateDataTest;

import org.example.validatedata.IValidateHourlyRate;
import org.example.validatedata.IValidateHoursWorked;
import org.junit.Test;
import org.mockito.MockedStatic;

import javax.swing.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mockStatic;

public class IValidHoursWorkedTest {
    @Test
    public void testValidHoursWorkedWithValidInput() {
        IValidateHoursWorked iValidateHoursWorked = new IValidateHoursWorked() {};
        try (MockedStatic<JOptionPane> mockedJOptionPane = mockStatic(JOptionPane.class)) {
            // Simulate user input and return valid hourly rate
            mockedJOptionPane.when(() -> JOptionPane.showInputDialog(null, "How many hours worked by the employee?"))
                    .thenReturn("15");



            short hourlyRate = iValidateHoursWorked.validHourlyWorked();

            assertEquals(15, hourlyRate);
        }
    }

    @Test
    public void testValidHoursWorkedWithInvalidInput() {
        IValidateHoursWorked validateHoursWorked = new IValidateHoursWorked() {
        };
        try (MockedStatic<JOptionPane> mockedJOptionPane = mockStatic(JOptionPane.class)) {
            // Simulate user input and return invalid input first, then valid hourly rate
            mockedJOptionPane.when(() -> JOptionPane.showInputDialog(null, "How many hours worked by the employee?"))
                    .thenReturn("invalid", "12");

            short hoursWorked = validateHoursWorked.validHourlyWorked();

            assertEquals(12, hoursWorked, 0.01);
        }
    }
}
