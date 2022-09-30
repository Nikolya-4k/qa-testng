package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import static utils.TestSuiteUtils.SMOKE;

public class SecondTest {
    @Test(groups = {SMOKE})
    public void testSecond(){
        Assert.assertTrue(false);
    }
}
