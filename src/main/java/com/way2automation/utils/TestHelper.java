package com.way2automation.utils;

import com.way2automation.pages.CalculatorPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestHelper {

    private WebDriver driver;



    public TestHelper(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement waitUntilElementWillBeClickable(WebElement element){
        return new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(element));
    }

    public WebElement waitUntilElementIsDisplayed(WebElement element){
        return new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(element));
    }

    public boolean isPageLoad(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js.executeScript("return document.readyState").equals("complete");
    }

    public void waitForLoadResult(long iteration, long milliseconds){
        for(int i=0; i< iteration;i++) {
            try{
                if ((new CalculatorPage(driver).getResult()).contains("."))
                    break;}catch (NoSuchElementException e){e.printStackTrace();}
        }
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
