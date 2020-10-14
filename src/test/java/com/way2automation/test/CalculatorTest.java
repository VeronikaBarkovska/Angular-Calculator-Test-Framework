package com.way2automation.test;

import com.way2automation.dataprovider.CalculatorDataProvider;
import com.way2automation.info.InfoBuilder;
import com.way2automation.pages.CalculatorPage;
import com.way2automation.utils.TestHelper;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CalculatorTest extends BaseTest {
    private CalculatorPage calculatorPage;
    private TestHelper testHelper;

    @BeforeMethod
    public void initPages(){
        calculatorPage = new CalculatorPage(driver);
        testHelper =new TestHelper(driver);
    }

    @Test(dataProvider = "validNumberWithAddOperData", dataProviderClass = CalculatorDataProvider.class)
    @Description("Test Description: Additional test with valid data. With DataProvider")
    public void testAddOperatorWithValidData(InfoBuilder infoBuilder){
        calculatorPage.enterData(infoBuilder);
        calculatorPage.clickGoBtn();
        testHelper.waitForLoadResult(3,2000);
        Assert.assertEquals(calculatorPage.getResult(),infoBuilder.getResult(),"Verify that calculator is worked with add operator and valid data");
    }

    @Test(dataProvider = "validNumberWithDivOperData", dataProviderClass = CalculatorDataProvider.class)
    @Description("Test Description: Division test with valid data. With DataProvider")
    public void testDivOperatorWithValidData(InfoBuilder infoBuilder){
        calculatorPage.enterData(infoBuilder);
        calculatorPage.clickGoBtn();
        testHelper.waitForLoadResult(3,2000);
        Assert.assertEquals(calculatorPage.getResult(),infoBuilder.getResult(),"Verify that calculator is worked with div operator and valid data");
    }
    @Test(dataProvider = "validNumberWithModOperData", dataProviderClass = CalculatorDataProvider.class)
    @Description("Test Description: Module test with valid data. With DataProvider")
    public void testModOperatorWithValidData(InfoBuilder infoBuilder){
        calculatorPage.enterData(infoBuilder);
        calculatorPage.clickGoBtn();
        testHelper.waitForLoadResult(3,2000);
        Assert.assertEquals(calculatorPage.getResult(),infoBuilder.getResult(),"Verify that calculator is worked with mod operator and valid data");
    }
    @Test(dataProvider = "validNumberWithMultOperData", dataProviderClass = CalculatorDataProvider.class)
    @Description("Test Description: Multiplication test with valid data. With DataProvider")
    public void testMultOperatorWithValidData(InfoBuilder infoBuilder){
        calculatorPage.enterData(infoBuilder);
        calculatorPage.clickGoBtn();
        testHelper.waitForLoadResult(3,2000);
        Assert.assertEquals(calculatorPage.getResult(),infoBuilder.getResult(),"Verify that calculator is worked with mult operator and valid data");
    }
    @Test(dataProvider = "validNumberWithSubOperData", dataProviderClass = CalculatorDataProvider.class)
    @Description("Test Description: Subtraction test with valid data. With DataProvider")
    public void testSubOperatorWithValidData(InfoBuilder infoBuilder){
        calculatorPage.enterData(infoBuilder);
        calculatorPage.clickGoBtn();
        testHelper.waitForLoadResult(3,2000);
        Assert.assertEquals(calculatorPage.getResult(),infoBuilder.getResult(),"Verify that calculator is worked with sub operator and valid data");
    }

    @Test(dataProvider = "invalidNumberWithAddOperData", dataProviderClass = CalculatorDataProvider.class)
    @Description("Test Description: Additional test with invalid data. With DataProvider")
    public void testAddOperatorWithInvalidData(InfoBuilder infoBuilder){
        calculatorPage.enterData(infoBuilder);
        calculatorPage.clickGoBtn();
        testHelper.waitForLoadResult(3,2000);
        Assert.assertEquals(calculatorPage.getResult(),infoBuilder.getResult(),"Verify that calculator is worked with add operator and invalid data");
    }

    @Test(dataProvider = "invalidNumberWithDivOperData", dataProviderClass = CalculatorDataProvider.class)
    @Description("Test Description: Division test with invalid data. With DataProvider")
    public void testDivOperatorWithInvalidData(InfoBuilder infoBuilder){
        calculatorPage.enterData(infoBuilder);
        calculatorPage.clickGoBtn();
        testHelper.waitForLoadResult(3,2000);
        Assert.assertEquals(calculatorPage.getResult(),infoBuilder.getResult(),"Verify that calculator is worked with div operator and invalid data");
    }
    @Test(dataProvider = "invalidNumberWithModOperData", dataProviderClass = CalculatorDataProvider.class)
    @Description("Test Description: Module test with invalid data. With DataProvider")
    public void testModOperatorWithInvalidData(InfoBuilder infoBuilder){
        calculatorPage.enterData(infoBuilder);
        calculatorPage.clickGoBtn();
        testHelper.waitForLoadResult(3,2000);
        Assert.assertEquals(calculatorPage.getResult(),infoBuilder.getResult(),"Verify that calculator is worked with mod operator and invalid data");
    }
    @Test(dataProvider = "invalidNumberWithMultOperData", dataProviderClass = CalculatorDataProvider.class)
    @Description("Test Description: Multiplication test with invalid data. With DataProvider")
    public void testMultOperatorWithInvalidData(InfoBuilder infoBuilder){
        calculatorPage.enterData(infoBuilder);
        calculatorPage.clickGoBtn();
        testHelper.waitForLoadResult(3,2000);
        Assert.assertEquals(calculatorPage.getResult(),infoBuilder.getResult(),"Verify that calculator is worked with mult operator and invalid data");
    }
    @Test(dataProvider = "invalidNumberWithSubOperData", dataProviderClass = CalculatorDataProvider.class)
    @Description("Test Description: Subtraction test with valid data. With DataProvider")
    public void testSubOperatorWithInvalidData(InfoBuilder infoBuilder){
        calculatorPage.enterData(infoBuilder);
        calculatorPage.clickGoBtn();
        testHelper.waitForLoadResult(3,2000);
        Assert.assertEquals(calculatorPage.getResult(),infoBuilder.getResult(),"Verify that calculator is worked with sub operator and invalid data");
    }

    @Test(dataProvider = "validNumberDataForHistory", dataProviderClass = CalculatorDataProvider.class)
    @Description("Test Description: Verification test with time data from History Block. With DataProvider")
    public void verifyThatHistoryTimeIsDisplayedCorrect(InfoBuilder infoBuilder){
        calculatorPage.enterData(infoBuilder);
        calculatorPage.clickGoBtn();
        testHelper.waitForLoadResult(3,2000);
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("h:mm:ss a");
        Assert.assertEquals(calculatorPage.getHistoryTime1Fld(),formatForDateNow.format(dateNow),"Verify that date is correct in history block");
    }

    @Test(dataProvider = "validNumberDataForHistory", dataProviderClass = CalculatorDataProvider.class)
    @Description("Test Description: Verification test with expression data from History Block. With DataProvider")
    public void verifyThatHistoryExpressionIsDisplayedCorrect(InfoBuilder infoBuilder){
        calculatorPage.enterData(infoBuilder);
        calculatorPage.clickGoBtn();
        testHelper.waitForLoadResult(3,2000);
        String expected= infoBuilder.getFirstNum() + " " + infoBuilder.getOperator().getName() + " " + infoBuilder.getSecondNum();
        String actual= calculatorPage.getHistoryFirstNumExpression1Fld() + " " + calculatorPage.getHistoryOperatorExpression1Fld() + " " + calculatorPage.getHistorySecondNumExpression1Fld();
        Assert.assertEquals(actual,expected,"Verify that expression is correct in history block");
    }

    @Test(dataProvider = "validNumberDataForHistory", dataProviderClass = CalculatorDataProvider.class)
    @Description("Test Description: Verification test with result data from History Block. With DataProvider")
    public void verifyThatHistoryResultIsDisplayedCorrect(InfoBuilder infoBuilder){
        calculatorPage.enterData(infoBuilder);
        calculatorPage.clickGoBtn();
        testHelper.waitForLoadResult(3,2000);
        String expected= infoBuilder.getResult();
        String actual= calculatorPage.getHistoryResult1Fld();
        Assert.assertEquals(actual,expected,"Verify that result is correct in history block");
    }

}
