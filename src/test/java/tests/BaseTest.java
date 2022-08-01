package tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import pages.CalculatorPage;
import java.util.concurrent.TimeUnit;
public class BaseTest {
    private WebDriver driver;
    protected CalculatorPage calculatorPage;
    @BeforeMethod
    public void driverSetup(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        calculatorPage = new CalculatorPage(driver);
    }

   /* @AfterMethod(alwaysRun = true)
    public void closeDriver()
    {

        driver.close();
    }*/
}