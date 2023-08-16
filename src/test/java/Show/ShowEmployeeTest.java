package Show;

import org.example.entity.AdministrativeStaff;
import org.example.logica.show.ShowEmployees;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertSame;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;

public class ShowEmployeeTest {
    @Test
    public void testExecute() {
        List<AdministrativeStaff> mockEmployees = new ArrayList<>();
        mockEmployees.add(new AdministrativeStaff("Santos", "Dubai", 23123123, "Male", "john@example.com", "Hacker", (double) 200.0, (short) 40, 1, 200*40));

        ShowEmployees showEmployees = new ShowEmployees();

        // Mock JOptionPane methods
        try (MockedStatic<JOptionPane> mockedJOptionPane = Mockito.mockStatic(JOptionPane.class)) {
            mockedJOptionPane.when(() -> JOptionPane.showMessageDialog(any(), any(), any(), anyInt()))
                    .thenAnswer(invocation -> {
                        JScrollPane scrollPane = invocation.getArgument(1);
                        JTable table = (JTable) ((JViewport) scrollPane.getComponent(0)).getView();
                        DefaultTableModel model = (DefaultTableModel) table.getModel();

                        assertEquals(1, model.getRowCount()); // Verify that there's one row
                        assertEquals("Santos", model.getValueAt(0, 2));// Verify the value in the table
                        assertEquals("Dubai", model.getValueAt(0, 3));
                        assertEquals("john@example.com", model.getValueAt(0, 4));
                        assertEquals(23123123, model.getValueAt(0, 5));
                        assertEquals("Hacker", model.getValueAt(0, 6));
                        assertEquals((short) 40, model.getValueAt(0, 7));
                        assertEquals((double) 200, model.getValueAt(0, 8));
                        assertEquals(8000.0, model.getValueAt(0, 9));
                        return null;
                    });

            showEmployees.execute(mockEmployees);
        }
    }
}
