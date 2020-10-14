package com.way2automation.pages;

import com.way2automation.info.InfoBuilder;
import com.way2automation.utils.Log;
import com.way2automation.utils.TestHelper;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class CalculatorPage {
    private WebDriver driver;

    @FindBy(xpath = "//input[@ng-model='first']")
    private WebElement firstNumFld;

    @FindBy(xpath = "//input[@ng-model='second']")
    private WebElement secondNumFld;

    @FindBy(xpath = "//button[@id='gobutton']")
    private WebElement goBtn;

    @FindBy(xpath = "//select[@ng-model='operator']")
    private WebElement operatorDropDownList;

    @FindBy(xpath = "//h2[@class='ng-binding']")
    private WebElement result;

    @FindBy(xpath = "(//table/tbody/tr/td[contains(text(),'PM')])[1]")
    private WebElement historyTime1Fld;

    @FindBy(xpath = "(//table/tbody/tr/td/span)[1]")
    private WebElement historyFirstNumExpression1Fld;

    @FindBy(xpath = "(//table/tbody/tr/td/span)[2]")
    private WebElement historyOperatorExpression1Fld;

    @FindBy(xpath = "(//table/tbody/tr/td/span)[3]")
    private WebElement historySecondNumExpression1Fld;

    @FindBy(xpath = "(//table/tbody/tr/td)[3]")
    private WebElement historyResult1Fld;


    public CalculatorPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String getResult() {
        Log.getInstance().info("Get Result");
        return new TestHelper(driver).waitUntilElementIsDisplayed(result).getText();
    }

    public String getHistoryTime1Fld() {
        Log.getInstance().info("Get Time from History block");
        return historyTime1Fld.getText();
    }

    public String getHistoryFirstNumExpression1Fld() {
        Log.getInstance().info("Get First Number from History block");
        return new TestHelper(driver).waitUntilElementIsDisplayed(historyFirstNumExpression1Fld).getText();
    }

    public String getHistoryOperatorExpression1Fld() {
        Log.getInstance().info("Get Operator from History block");
        String resultText = historyOperatorExpression1Fld.getText();
        return resultText;
    }

    public String getHistorySecondNumExpression1Fld() {
        Log.getInstance().info("Get Second Number from History block");
        return new TestHelper(driver).waitUntilElementIsDisplayed(historySecondNumExpression1Fld).getText();
    }

    public String getHistoryResult1Fld() {
        Log.getInstance().info("Get Result from History block");
        return new TestHelper(driver).waitUntilElementIsDisplayed(historyResult1Fld).getText();
    }
    @Step("Write data to calculator form")
    public void enterData(InfoBuilder info){
        Log.getInstance().info("Enter Data to calculator");
        new TestHelper(driver).waitUntilElementWillBeClickable(firstNumFld).sendKeys(info.getFirstNum());
        new TestHelper(driver).waitUntilElementWillBeClickable(secondNumFld).sendKeys(info.getSecondNum());
        Select value = new Select(operatorDropDownList);
        value.selectByVisibleText(info.getOperator().getName());
    }
    @Step("Click button in calculator form")
    public CalculatorPage clickGoBtn(){
        Log.getInstance().info("Clicking 'Go' button ");
        new TestHelper(driver).waitUntilElementWillBeClickable(goBtn).click();
        return new CalculatorPage(driver);
    }


}
