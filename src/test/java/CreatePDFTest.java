import com.itextpdf.text.DocumentException;
import org.example.entity.AdministrativeStaff;
import org.example.logica.createpdf.CreatePDF;
import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.any;

public class CreatePDFTest {
    @Test
    public void executeShouldGeneratePDFWithTable() throws DocumentException {
        // Given
        CreatePDF pdfCreator = new CreatePDF();
        List<AdministrativeStaff> employees = new ArrayList<>();
        employees.add(new AdministrativeStaff("Santos", "Dubai", 23123123, "Male", "john@example.com", "Hacker", (double) 200.0, (short) 40, 3, 200*40));
        // ... agrega más empleados si es necesario

        // Simula el JOptionPane.showInputDialog para evitar que aparezcan cuadros de diálogo
        try (MockedStatic<JOptionPane> mockedJOptionPane = Mockito.mockStatic(JOptionPane.class)) {
            mockedJOptionPane.when(() -> JOptionPane.showInputDialog(any(), any()))
                    .thenReturn("");
            // When & Then
            try {
                pdfCreator.execute(employees); // Llama al método sin argumentos de ruta de archivo
            } catch (DocumentException | FileNotFoundException e) {
                fail("Exception thrown: " + e.getMessage());
            }

            //Verifica si se ha creado el archivo PDF en el escritorio
            String filePath = System.getProperty("user.home") + File.separator + "Escritorio" + File.separator + "Employees.pdf";
            File pdfFile = new File(filePath);
            assertTrue(pdfFile.exists());
            assertTrue(pdfFile.isFile());
            assertTrue(pdfFile.length() > 0);
        }
    }
}
