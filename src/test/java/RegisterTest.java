import org.example.entity.AdministrativeStaff;
import org.example.logica.register.Register;
import org.example.validatedata.IValidateHourlyRate;
import org.example.validatedata.IValidateHoursWorked;
import org.example.validatedata.IValidateID;
import org.example.validatedata.IValidateNumberPhone;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

import static javax.management.Query.eq;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class RegisterTest {

    @Test
    public void executeShouldRegisterEmployee() {
        try (MockedStatic<JOptionPane> mockedJOptionPane = Mockito.mockStatic(JOptionPane.class)) {
            // Simulate input values
            mockedJOptionPane.when(() -> JOptionPane.showInputDialog(any(), eq("sex")))
                    .thenReturn("Male");
            mockedJOptionPane.when(() -> JOptionPane.showInputDialog(any(), eq("name")))
                    .thenReturn("Test Value");
            mockedJOptionPane.when(() -> JOptionPane.showInputDialog(any(), eq("address")))
                    .thenReturn("Test Value");
            mockedJOptionPane.when(() -> JOptionPane.showInputDialog(any(), eq("email")))
                    .thenReturn("Test Value");
            mockedJOptionPane.when(() -> JOptionPane.showInputDialog(any(), eq("Role")))
                    .thenReturn("Test Value");

            IValidateID mockValidateID = mock(IValidateID.class);
            IValidateNumberPhone mockValidatePhone = mock(IValidateNumberPhone.class);
            IValidateHoursWorked mockValidateHours = mock(IValidateHoursWorked.class);
            IValidateHourlyRate mockValidateRate = mock(IValidateHourlyRate.class);

            Register registerAction = new Register(
                    mockValidateID, mockValidatePhone, mockValidateHours, mockValidateRate);

            // Simulate validation results
            when(mockValidateID.validID()).thenReturn(1);
            when(mockValidatePhone.validPhone()).thenReturn(1234567890);
            when(mockValidateHours.validHourlyWorked()).thenReturn((short) 40);
            when(mockValidateRate.validHourlyRate()).thenReturn(10.0);
            when(registerAction.showInputDialog("sex")).thenReturn("Male");
            when(registerAction.showInputDialog("name")).thenReturn("Test Value");
            when(registerAction.showInputDialog("address")).thenReturn("Test Value");
            when(registerAction.showInputDialog("email")).thenReturn("Test Value");
            when(registerAction.showInputDialog("Role")).thenReturn("Test Value");
            List<AdministrativeStaff> employees = new ArrayList<>();
            // When
            registerAction.execute(employees);

            // Then
            assertEquals(1, employees.size()); // Verifica que se haya registrado un empleado
            AdministrativeStaff registeredEmployee = employees.get(0);
            // Verifica los valores simulados
            assertEquals(1, registeredEmployee.getIdEmpleado());
            assertEquals("Male", registeredEmployee.getSex());
            assertEquals("Test Value", registeredEmployee.getName());
            assertEquals("Test Value", registeredEmployee.getAdress());
            assertEquals("Test Value", registeredEmployee.getEmail());
            assertEquals(1234567890, registeredEmployee.getCel());
            assertEquals("Test Value", registeredEmployee.getPosition());
            assertEquals(40, registeredEmployee.getHoursWorked());
            assertEquals(10.0, registeredEmployee.getHourlyRate(), 001);
            assertEquals(400.0, registeredEmployee.getSalaryTotal(), 001);
        }
    }
}