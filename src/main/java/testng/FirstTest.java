package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import static utils.TestSuiteUtils.REGRESSION;

public class FirstTest {

    @Test(groups = {REGRESSION})
    public void testOne(){
        Assert.assertTrue(true);
    }
}
