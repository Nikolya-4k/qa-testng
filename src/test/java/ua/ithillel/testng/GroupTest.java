package ua.ithillel.testng;

import org.testng.annotations.Test;

import static utils.TestSuiteUtils.REGRESSION;
import static utils.TestSuiteUtils.SMOKE;

public class GroupTest {

    @Test(groups = {SMOKE})
    public void testOne() {
        System.out.println("Test one");
    }

    @Test(groups = {REGRESSION})
    public void testSecond() {
        System.out.println("Test two");;
    }

    @Test(groups = {SMOKE, REGRESSION})
    public void printConsole() {
        System.out.println("Hello automation");
    }
}
