
import java.util.ArrayList;
import java.util.List;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import org.example.entity.AdministrativeStaff;
import org.example.logica.createpdf.CreateTableImplement;
import org.example.logica.createpdf.ICreateTable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class CreateTableImplementTest {
    @Test
    public void createTableShouldReturnPdfPTableWithCorrectData() throws DocumentException {
        // Given
        ICreateTable tableCreator = new CreateTableImplement();
        List<AdministrativeStaff> employees = new ArrayList<>();
        // Agrega algunos datos ficticios de empleados para las pruebas
        employees.add(new AdministrativeStaff("Stiven", "Male", 34134134, "Male", "john@example.com", "MANAGER", 200.0, (short) 40, 2, (double) (200*40)));
        // ... agrega más empleados si es necesario
        // When
        PdfPTable resultTable = tableCreator.createTable(employees);

        // Then
        assertNotNull(resultTable);
        assertEquals(10, resultTable.getNumberOfColumns()); // Verifica que haya 10 columnas + 1 columna adicional por defecto


        // Verifica el contenido de la cabecera
        List<PdfPCell> headerCells = List.of(resultTable.getRow(0).getCells());
        assertEquals("[ID]", headerCells.get(0).getPhrase().toString());
        assertEquals("[Sex]", headerCells.get(1).getPhrase().toString());
        assertEquals("[Name]", headerCells.get(2).getPhrase().toString());

        // ... verifica las demás celdas de la cabecera

        // Verifica el contenido del primer empleado
        List<PdfPCell> firstEmployeeCells = List.of(resultTable.getRow(1).getCells());
        assertEquals("[2]", firstEmployeeCells.get(0).getPhrase().toString());
        assertEquals("[Male]", firstEmployeeCells.get(1).getPhrase().toString());
        assertEquals("[Stiven]", firstEmployeeCells.get(2).getPhrase().toString());

    }

}
