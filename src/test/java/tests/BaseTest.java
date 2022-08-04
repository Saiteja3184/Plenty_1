package tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CalculatorPage;
public class BaseTest {
    private WebDriver driver;
    protected CalculatorPage calculatorPage;

    @BeforeMethod
    public void driverSetup(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        calculatorPage = new CalculatorPage(driver);
    }

    @Test
    public void checkInformationInVmClassString() throws InterruptedException {
        calculatorPage.openCloudPage();
        calculatorPage.goToGoogleCloudPlatformPricingCalculatorPage(
                "Google Cloud Platform Pricing Calculator");
        calculatorPage.sendKeyInToNumberOfInstancesField("4");
        calculatorPage.selectOS();
        calculatorPage.selectProvisionModel();
        calculatorPage.selectSeriesOfMachine();
        calculatorPage.selectMachineType();
        calculatorPage.clickAddGpusCheckBox();
        calculatorPage.selectGpuType();
        calculatorPage.selectNumberOfGpus();
        calculatorPage.selectLocalSsd();
        calculatorPage.selectDataCenterLocation();
        calculatorPage.selectCommittedUsage();
        calculatorPage.pushAddToEstimate();
        calculatorPage.checkInformationInVmClassIsRegular();
        calculatorPage.checkInformationInInstanceTypeIncludeN1Standard8();
        calculatorPage.checkRegionIsFrankfurt();
        calculatorPage.checkLocalSsdSpace2x375Gib();
        calculatorPage.checkCommitmentTermOneYear();
        calculatorPage.checkMonthlyAmount();
    }

    /*@AfterTest
    public void closeDriver() {
        driver.close();
    }*/

}