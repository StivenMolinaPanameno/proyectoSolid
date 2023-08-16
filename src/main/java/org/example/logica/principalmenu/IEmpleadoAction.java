package org.example.logica.principalmenu;

import com.itextpdf.text.DocumentException;
import java.io.FileNotFoundException;
import java.util.List;
import org.example.entity.AdministrativeStaff;

public interface IEmpleadoAction {
  void execute(List<AdministrativeStaff> employees) throws FileNotFoundException, DocumentException;
}
