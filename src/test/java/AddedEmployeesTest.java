import org.example.AddedEmployees;
import org.example.entity.AdministrativeStaff;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class AddedEmployeesTest {

    @Test
    public void testEmpleadosAgregados() {

        List<AdministrativeStaff> employees = new ArrayList<>();
        List<AdministrativeStaff> employeesAdded;
        List<AdministrativeStaff> expected = new ArrayList<>();
        // Arrange
        AddedEmployees addedEmployees = new AddedEmployees();
        employeesAdded = addedEmployees.empleadosAgregados(employees);
        expected.add(
                new AdministrativeStaff(
                        "Carlos",
                        "Call Poniente",
                        23434234,
                        "Masculino",
                        "antfadf@gamil.com",
                        "Contaduria",
                        342.3,
                        (short) 34,
                        1,
                        (342.3 * 34)));
        expected.add(
                new AdministrativeStaff(
                        "Marcos",
                        "Calle sur",
                        423423423,
                        "Masculino",
                        "anadf@gamil.com",
                        "roquero",
                        242.4,
                        (short) 54,
                        2,
                        (242.4 * 54)));
        expected.add(
                new AdministrativeStaff(
                        "Marta",
                        "Norte",
                        234234324,
                        "Femenina",
                        "antfadf@gamil.com",
                        "RRHH",
                        423.2,
                        (short) 56,
                        3,
                        (423.2 * 56)));

        assertEquals(expected.size(), employeesAdded.size());
    }
}
