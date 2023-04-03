package MyTests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class secondTest {
    @Test(groups = {"IMPLEMENTED"})
    public void secondTest() {
        String str = "TestNG is working fine again";
        assertEquals("TestNG is working fine again", str);
    }
}
