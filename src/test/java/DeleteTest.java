import org.example.entity.AdministrativeStaff;
import org.example.logica.delete.Delete;
import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;

public class DeleteTest {
    @Test
    public void executeShouldDeleteEmployee() {
       // Given
        Delete deleteEmployeeAction = new Delete();

        List<AdministrativeStaff> employees = new ArrayList<>();
        AdministrativeStaff employeeToDelete = new AdministrativeStaff("Santos", "Dubai", 23123123, "Male", "john@example.com", "Hacker", (double) 200.0, (short) 40, 1, 200 * 40);
        employees.add(employeeToDelete);
        employees.add(new AdministrativeStaff("Santos", "Dubai", 23123123, "Male", "john@example.com", "Hacker", (double) 200.0, (short) 40, 3, 200 * 40));
        // ... agrega más empleados si es necesario

        // Mock JOptionPane to do nothing
        try (MockedStatic<JOptionPane> mockedJOptionPane = Mockito.mockStatic(JOptionPane.class)) {
            mockedJOptionPane.when(() -> JOptionPane.showInputDialog(any(), any()))
                    .thenAnswer(invocation -> "1"); // Simulate user input of valid ID

            // When
            deleteEmployeeAction.execute(employees);

            // Then
            assertEquals(1, employees.size()); // Verifica que solo quede 1 empleado después de eliminar uno
            assertFalse(employees.contains(employeeToDelete)); // Verifica que el empleado eliminado ya no esté en la lista
        }
    }


}
