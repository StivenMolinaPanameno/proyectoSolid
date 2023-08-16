package org.example.logica.createpdf;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import java.util.List;
import javax.swing.*;
import org.example.entity.AdministrativeStaff;

public interface ICreateTable {
  PdfPTable createTable(List<AdministrativeStaff> employees) throws DocumentException;
}
