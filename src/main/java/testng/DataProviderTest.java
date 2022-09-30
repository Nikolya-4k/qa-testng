package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @DataProvider
    public Object[][] createData() {
        return new Object[][]{
                {"Nikolay", 31},
                {"Alex", 29}
        };
    }

    @Test(dataProvider = "createData")
    public void testData(String name, int age) {
        System.out.println(name + " " + age);
    }

}
