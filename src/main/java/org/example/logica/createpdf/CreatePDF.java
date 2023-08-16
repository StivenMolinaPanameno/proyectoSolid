package org.example.logica.createpdf;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import javax.swing.*;
import org.example.entity.AdministrativeStaff;
import org.example.logica.principalmenu.IEmpleadoAction;

public class CreatePDF implements IEmpleadoAction {

  ICreateTable createTable = new CreateTableImplement();

  @Override
  public void execute(List<AdministrativeStaff> employees)
          throws FileNotFoundException, DocumentException {
    Document document = new Document(PageSize.A4.rotate());
    String desktop = System.getProperty("user.home") + File.separator + "Escritorio";
    PdfWriter.getInstance(document, new FileOutputStream(desktop + File.separator + "Employees.pdf"));
    document.open();
    Font boldFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
    Paragraph centerParagraph = new Paragraph("Tabla de empleados",boldFont);
    centerParagraph.setAlignment(Paragraph.ALIGN_CENTER);
    document.add(centerParagraph);
    document.add(Chunk.NEWLINE);
    document.add(createTable.createTable(employees));
    document.close();
    JOptionPane.showMessageDialog(null, "PDF created, check your desktop");
  }
}
