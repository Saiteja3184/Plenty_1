package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculatorPage extends BasePage {
    public CalculatorPage(WebDriver driver) {
        super(driver);
    }

    private By devSiteSearch = By.className("devsite-search-form");
    private By googleSearch = By.xpath("//input[@class='devsite-search-field devsite-search-query']");
    private By switchToCalculator = By.xpath("//div[@class='gs-title']//b[contains(text(),'Google Cloud Pricing Calculator')]");
    private By newFirstFrame = By.xpath("//iframe[contains(@name,'goog_')]");
    private By instancesField = By.name("quantity");
/*    private By operatingSystem = By.id("select_99");
    private By osModel = By.id("select_option_88");*/
    private By seriesOfMachine = By.xpath("//md-select[@name='series']/parent::md-input-container");
    private By seriesOfMachineModel = By.xpath("//md-option[@value='n1']");
    private By machineType = By.xpath("//label[text()='Machine type']/parent::md-input-container");
    private By computeEngine = By.xpath("//md-option[@value='CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8']");
    private By gpusCheckBox = By.xpath("//md-checkbox[@aria-label='Add GPUs']");
    private By gpuType = By.xpath("//md-select[@placeholder='GPU type']");
    private By gpuTypeModel =By.xpath("//md-option[@value='NVIDIA_TESLA_V100']");
    private By numberOfGpus = By.xpath("//md-select[@placeholder='Number of GPUs']");
    private By numberOfGpusModel = By.cssSelector("md-option[value='1'][class='ng-scope md-ink-ripple'][ng-disabled]");
    private By localSsd = By.xpath("//md-select[@placeholder='Local SSD']");
    private By localSsdModel = By.xpath("//md-option[@ng-repeat='item in listingCtrl.dynamicSsd.computeServer'][@value='2']/div[@class='md-text ng-binding']");
    private By dataCenterLocation = By.xpath("//md-select[@placeholder='Datacenter location']");
    private By dataCenterLocationInFrankfurt = By.cssSelector("md-select-menu[class='md-overflow']" + " md-option[value='europe-west3'][ng-repeat*='fullRegionList']");
    private By committedUsage = By.xpath("//md-select[@placeholder='Committed usage']");
    private By oneYearUsage = By.cssSelector("div[class='md-select-menu-container md-active md-clickable']" + " md-option[value='1'][class='md-ink-ripple']");
    private By addToEstimateButton = By.xpath("//button[@aria-label='Add to Estimate']");
    private By informationInVmClassIsRegular = By.xpath("//md-select[@aria-label='VM Class: Regular']");
    private By InformationInInstanceTypeIncludeN1Standard8 = By.xpath("//div[contains (text(),'Instance type: n1-standard-8')]");
    private By regionIsFrankfurt = By.xpath("//div[contains (text(),'Region: Frankfurt')]");

    private By localSsdSpace2x375Gib = By.xpath("//div[@class='md-text'][text()='24x375 GB']");

    private By commitmentTermOneYear = By.xpath("//div[contains (text(),'Commitment term: 1 Year')]");


    public void openCloudPage() {
        driver.get("https://cloud.google.com/");
    }

    public void goToGoogleCloudPlatformPricingCalculatorPage(String keyForCalculatorPageOpening) throws InterruptedException {
        driver.findElement(devSiteSearch).click();
        WebElement textForGoogleSearch = driver.findElement(googleSearch);
        textForGoogleSearch.click();
        textForGoogleSearch.sendKeys(keyForCalculatorPageOpening);
        textForGoogleSearch.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(switchToCalculator).click();
    }

    public void sendKeyInToNumberOfInstancesField(String keyForNumberOfInstances) throws InterruptedException {
        WebElement element = driver.findElement(newFirstFrame);
        driver.switchTo().frame(element);
        driver.switchTo().frame("myFrame");
        Thread.sleep(3000);
        WebElement numberOfInstancesField = driver.findElement(instancesField);
        numberOfInstancesField.sendKeys(keyForNumberOfInstances);
        Thread.sleep(3000);
    }

    public void selectSeriesOfMachine() throws InterruptedException {
        driver.findElement(seriesOfMachine).click();
        Thread.sleep(3000);
        driver.findElement(seriesOfMachineModel).click();
        Thread.sleep(3000);
    }

    public void selectMachineType() throws InterruptedException {
        driver.findElement(machineType).click();
        Thread.sleep(3000);
        driver.findElement(computeEngine).click();
        Thread.sleep(3000);
    }

    public void clickAddGpusCheckBox() throws InterruptedException {
        driver.findElement(gpusCheckBox).click();
        Thread.sleep(3000);
    }

    public void selectGpuType() throws InterruptedException {
        driver.findElement(gpuType).click();
        Thread.sleep(3000);
        driver.findElement(gpuTypeModel).click();
        //Thread.sleep(2000);
    }
    public void selectNumberOfGpus() throws InterruptedException {
        driver.findElement(numberOfGpus).click();
        Thread.sleep(3000);
        driver.findElement(numberOfGpusModel).click();
        Thread.sleep(3000);
    }
    public void selectLocalSsd() throws InterruptedException {
        driver.findElement(localSsd).click();
        Thread.sleep(3000);
        driver.findElement(localSsdModel).click();
        Thread.sleep(3000);
    }

    public void selectDataCenterLocation() throws InterruptedException {
        driver.findElement(dataCenterLocation).click();
        Thread.sleep(3000);
        driver.findElement(dataCenterLocationInFrankfurt).click();
        Thread.sleep(3000);
    }

    public void selectCommittedUsage() throws InterruptedException {
        driver.findElement(committedUsage).click();
        Thread.sleep(3000);
        driver.findElement(oneYearUsage).click();
        Thread.sleep(3000);
    }

    public void pushAddToEstimate() throws InterruptedException {
        driver.findElement(addToEstimateButton).click();
        Thread.sleep(5000);
    }

    public void checkInformationInVmClassIsRegular() {
        driver.findElement(informationInVmClassIsRegular);
    }
    public void checkInformationInInstanceTypeIncludeN1Standard8() {
        driver.findElement(InformationInInstanceTypeIncludeN1Standard8);
    }

    public void checkRegionIsFrankfurt() {
        driver.findElement(regionIsFrankfurt);
    }

    public void checkLocalSsdSpace2x375Gib() {
        driver.findElement(localSsdSpace2x375Gib);
    }

    public void checkCommitmentTermOneYear() {
        driver.findElement(commitmentTermOneYear);
    }
}