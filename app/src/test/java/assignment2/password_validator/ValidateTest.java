package assignment2.password_validator;

import org.junit.Test;

import assignment2.password_validator.MainActivity.*;
import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;



/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ValidateTest {
    @Test
    public void validationPasses() throws Exception {
        assertEquals(MainActivity.validate("password"), false);
        assertEquals(MainActivity.validate("PASSWORD"), false);
        assertEquals(MainActivity.validate("PaSsWoRd"), false);
        assertEquals(MainActivity.validate("password1"), true);
        assertEquals(MainActivity.validate("pass"), false);
        assertEquals(MainActivity.validate("ThisIsAPassword"), true);
    }
}