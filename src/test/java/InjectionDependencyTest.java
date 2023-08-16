import org.example.entity.AdministrativeStaff;
import org.example.logica.register.Register;
import org.example.logica.update.*;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class InjectionDependencyTest {
    @Test
    public void testInjection() {
        InjectionDependency inject = new InjectionDependency();

        // Act
        UpdateAtributeHandler actualHandler = inject.injection();

        // Assert
        assertNotNull(actualHandler);
    }

    @Test
    public void testIRegisterInjection() {
        Register register = InjectionDependency.IRegisterInjection();

        assertNotNull(register);

    }
}
