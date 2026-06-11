package dataproviders;

import org.testng.annotations.DataProvider;

import utilities.CSVUtil;

public class TestDataProvider {

    @DataProvider(name = "registrationData")
    public Object[][] getRegistrationData() {

        return CSVUtil.readCSV("src/test/resources/TestData.csv");
    }
}