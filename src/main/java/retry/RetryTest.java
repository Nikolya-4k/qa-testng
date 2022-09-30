package retry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {

    @Test(retryAnalyzer = MyRetry.class)
    public void testRetry() {
        Assert.assertTrue(false);
    }
}
