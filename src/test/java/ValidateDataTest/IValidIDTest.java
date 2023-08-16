package ValidateDataTest;

import org.example.validatedata.IValidateID;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IValidIDTest {
    @Test
    public void testValidID(){
        //Give
        IValidateID validator = mock(IValidateID.class);
        when(validator.validID()).thenReturn(1);

        //When
        int result = validator.validID();

        //Then
        assertEquals(1, result);
    }
}
