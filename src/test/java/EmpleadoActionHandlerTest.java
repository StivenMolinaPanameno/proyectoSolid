import com.itextpdf.text.DocumentException;
import org.example.entity.AdministrativeStaff;
import org.example.logica.createpdf.CreatePDF;
import org.example.logica.delete.Delete;
import org.example.logica.principalmenu.EmpleadoActionHandler;
import org.example.logica.principalmenu.IEmpleadoAction;
import org.example.logica.register.Register;
import org.example.logica.search.Search;
import org.example.logica.show.ShowEmployees;
import org.example.logica.update.IUpdateExecute;
import org.example.logica.update.Update;
import org.example.logica.update.UpdateAtributeHandler;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.verification.VerificationMode;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class EmpleadoActionHandlerTest {

    @Test
    public void crudImplementationShouldExecuteSelectedAction() throws DocumentException, FileNotFoundException {

        IEmpleadoAction[] actionEmployee = new IEmpleadoAction[]{
                mock(IEmpleadoAction.class),
                mock(IEmpleadoAction.class)
        };
        List<AdministrativeStaff> employee = mock(List.class);
        EmpleadoActionHandler handler = new EmpleadoActionHandler(actionEmployee);

        // Call the method being tested
        handler.crudImplementation(employee,    1);

        // Verify that the appropriate updateExecute method was called
        verify(actionEmployee[0]).execute(employee);
        verify(actionEmployee[1], never()).execute(any());

        // Reset the mocks for further verifications
        reset(actionEmployee);

        // Call the method with an out-of-range option
        handler.crudImplementation(employee, 3);

        // Verify that no updateExecute methods were called
        verifyNoInteractions(actionEmployee);

    }
}
