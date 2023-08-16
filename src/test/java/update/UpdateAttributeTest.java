package update;

import org.example.entity.AdministrativeStaff;
import org.example.logica.update.IUpdateExecute;
import org.example.logica.update.UpdateAtributeHandler;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class UpdateAttributeTest {
    @Test
    public void testUpdateAttribute() {
        // Mocks
        IUpdateExecute[] actionUpdate = new IUpdateExecute[]{
                mock(IUpdateExecute.class),
                mock(IUpdateExecute.class)
        };
        AdministrativeStaff employee = mock(AdministrativeStaff.class);
        UpdateAtributeHandler handler = new UpdateAtributeHandler(actionUpdate);

        // Call the method being tested
        handler.updateAttribute(employee, 1);

        // Verify that the appropriate updateExecute method was called
        verify(actionUpdate[0]).updateExecute(employee);
        verify(actionUpdate[1], never()).updateExecute(any());

        // Reset the mocks for further verifications
        reset(actionUpdate);

        // Call the method with an out-of-range option
        handler.updateAttribute(employee, 3);

        // Verify that no updateExecute methods were called
        verifyNoInteractions(actionUpdate);
    }

}
