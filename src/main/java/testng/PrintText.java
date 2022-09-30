package testng;

import org.testng.annotations.Test;

import static utils.TestSuiteUtils.REGRESSION;
import static utils.TestSuiteUtils.SMOKE;

public class PrintText {

    @Test(groups = {SMOKE, REGRESSION})
    public void printConcole() {
        System.out.println("Hello Automation");
    }
}
