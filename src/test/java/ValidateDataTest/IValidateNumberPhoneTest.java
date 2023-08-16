package ValidateDataTest;

import org.example.validatedata.IValidateHoursWorked;
import org.example.validatedata.IValidateNumberPhone;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.MockedStatic;

import javax.swing.*;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mockStatic;

public class IValidateNumberPhoneTest {
    @Test
    public void testValidateNumberPhone() {
        IValidateNumberPhone validateNumberPhone = new IValidateNumberPhone() {};
        try (MockedStatic<JOptionPane> mockedJOptionPane = mockStatic(JOptionPane.class)) {
            // Simulate user input and return valid hourly rate
            mockedJOptionPane.when(() -> JOptionPane.showInputDialog(null, "What is the number phone of the employee"))
                    .thenReturn("12345678");



            int phone = validateNumberPhone.validPhone();

            Assert.assertEquals(12345678, phone);
        }
    }

    @Test
    public void testValidateNumberPhoneInvalidInput() {
        IValidateNumberPhone validateNumberPhone = new IValidateNumberPhone() {
        };
        try (MockedStatic<JOptionPane> mockedJOptionPane = mockStatic(JOptionPane.class)) {
            // Simulate user input and return invalid input first, then valid hourly rate
            mockedJOptionPane.when(() -> JOptionPane.showInputDialog(null, "What is the number phone of the employee"))
                    .thenReturn("invalid", "12345678");

            int phone = validateNumberPhone.validPhone();

            Assert.assertEquals(12345678, phone);
        }
    }
}
