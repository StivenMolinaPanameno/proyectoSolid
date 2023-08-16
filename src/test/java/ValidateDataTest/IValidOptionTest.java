package ValidateDataTest;

import org.example.validatedata.IvalidOption;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IValidOptionTest {
    @Test
    public void testValidOptionWithValidInput() {
        IvalidOption validator = new IvalidOption() {};

        int result = validator.validOption("5");

        assertEquals(5, result);
    }

    @Test
    public void testValidOptionWithInvalidInput() {
        IvalidOption validator = new IvalidOption() {};

        int result = validator.validOption("abc");

        assertEquals(-1, result);
    }
}



