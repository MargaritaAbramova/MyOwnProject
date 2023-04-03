package MyTests;

import jdk.jfr.Description;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class firstTest {
    @Test(groups = {"IMPLEMENTED"})
    @Description("My first test DESCRIPTION")
    public void firstTest() {
        String str = "TestNG is working fine";
        assertEquals("TestNG is working fine", str);
    }
}
