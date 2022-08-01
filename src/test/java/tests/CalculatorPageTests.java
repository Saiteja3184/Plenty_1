package tests;

import org.testng.annotations.Test;

public class CalculatorPageTests extends BaseTest{
    @Test
    public void checkInformationInVmClassString() throws InterruptedException {
        calculatorPage.openCloudPage();
        calculatorPage.goToGoogleCloudPlatformPricingCalculatorPage(
                "Google Cloud Platform Pricing Calculator");

        calculatorPage.sendKeyInToNumberOfInstancesField("4");
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

    }
}