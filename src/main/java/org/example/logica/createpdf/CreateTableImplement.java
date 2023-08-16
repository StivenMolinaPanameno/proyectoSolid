package org.example.logica.createpdf;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import java.util.List;
import org.example.entity.AdministrativeStaff;

public class CreateTableImplement implements ICreateTable {
  @Override
  public PdfPTable createTable(List<AdministrativeStaff> employees) throws DocumentException {
    // Crear una tabla con 10 columnas
    PdfPTable table = new PdfPTable(10);

    table.setWidthPercentage(100);
    float[] columnWidths = {0.3f,1f,1f,1f,1f,1f,1f,1f,1f,1f};
    table.setWidths(columnWidths);

    Font headerFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
    PdfPCell headerCell1 = new PdfPCell(new Phrase("ID", headerFont));
    PdfPCell headerCell2 = new PdfPCell(new Phrase("Sex", headerFont));
    PdfPCell headerCell3 = new PdfPCell(new Phrase("Name", headerFont));
    PdfPCell headerCell4 = new PdfPCell(new Phrase("Address", headerFont));
    PdfPCell headerCell5 = new PdfPCell(new Phrase("Email", headerFont));
    PdfPCell headerCell6 = new PdfPCell(new Phrase("Phone", headerFont));
    PdfPCell headerCell7 = new PdfPCell(new Phrase("Rol", headerFont));
    PdfPCell headerCell8 = new PdfPCell(new Phrase("Hours Worked", headerFont));
    PdfPCell headerCell9 = new PdfPCell(new Phrase("Hourly Rate", headerFont));
    PdfPCell headerCell10 = new PdfPCell(new Phrase("Total Salary", headerFont));

    headerCell1.setHorizontalAlignment(Element.ALIGN_CENTER);
    headerCell2.setHorizontalAlignment(Element.ALIGN_CENTER);
    headerCell3.setHorizontalAlignment(Element.ALIGN_CENTER);
    headerCell4.setHorizontalAlignment(Element.ALIGN_CENTER);
    headerCell5.setHorizontalAlignment(Element.ALIGN_CENTER);
    headerCell6.setHorizontalAlignment(Element.ALIGN_CENTER);
    headerCell7.setHorizontalAlignment(Element.ALIGN_CENTER);
    headerCell8.setHorizontalAlignment(Element.ALIGN_CENTER);
    headerCell9.setHorizontalAlignment(Element.ALIGN_CENTER);
    headerCell10.setHorizontalAlignment(Element.ALIGN_CENTER);

    table.addCell(headerCell1);
    table.addCell(headerCell2);
    table.addCell(headerCell3);
    table.addCell(headerCell4);
    table.addCell(headerCell5);
    table.addCell(headerCell6);
    table.addCell(headerCell7);
    table.addCell(headerCell8);
    table.addCell(headerCell9);
    table.addCell(headerCell10);

    for (AdministrativeStaff employee : employees) {
      table.addCell(String.valueOf(employee.getIdEmpleado()));
      table.addCell(employee.getSex());
      table.addCell(employee.getName());
      table.addCell(employee.getAdress());
      table.addCell(employee.getEmail());
      table.addCell(String.valueOf(employee.getCel()));
      table.addCell(employee.getPosition());
      table.addCell(String.valueOf(employee.getHoursWorked()));
      table.addCell(String.valueOf(employee.getHourlyRate()));
      table.addCell(String.valueOf(employee.getSalaryTotal()));
    }

    return table;
  }
}
