package com.way2automation.dataprovider;

import com.way2automation.info.InfoBuilder;
import com.way2automation.pages.enums.OperatorEnum;
import org.testng.annotations.DataProvider;

public class CalculatorDataProvider {
    @DataProvider
    public Object[][] validNumberWithAddOperData() {
        return new Object[][]{
                {new InfoBuilder()
                        .enterFirstNum("1")
                        .enterOperator(OperatorEnum.ADDITION)
                        .enterSecondNum("1")
                        .enterResult("2")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("1")
                        .enterOperator(OperatorEnum.ADDITION)
                        .enterSecondNum("10")
                        .enterResult("11")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("10")
                        .enterOperator(OperatorEnum.ADDITION)
                        .enterSecondNum("1")
                        .enterResult("11")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("1000000000000000000000000000000000000")
                        .enterOperator(OperatorEnum.ADDITION)
                        .enterSecondNum("100000000000000000000000000000000000")
                        .enterResult("1.1e+36")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("1")
                        .enterOperator(OperatorEnum.ADDITION)
                        .enterSecondNum("0")
                        .enterResult("1")
                        .build()}

        };
    }

    @DataProvider
    public Object[][] validNumberWithDivOperData() {
        return new Object[][]{
                {new InfoBuilder()
                        .enterFirstNum("1")
                        .enterOperator(OperatorEnum.DIVISION)
                        .enterSecondNum("1")
                        .enterResult("1")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("1")
                        .enterOperator(OperatorEnum.DIVISION)
                        .enterSecondNum("10")
                        .enterResult("0.1")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("10")
                        .enterOperator(OperatorEnum.DIVISION)
                        .enterSecondNum("1")
                        .enterResult("10")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("100000")
                        .enterOperator(OperatorEnum.DIVISION)
                        .enterSecondNum("2000")
                        .enterResult("50")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("10")
                        .enterOperator(OperatorEnum.DIVISION)
                        .enterSecondNum("2")
                        .enterResult("5")
                        .build()}

        };
    }

    @DataProvider
    public Object[][] validNumberWithModOperData() {
        return new Object[][]{
                {new InfoBuilder()
                        .enterFirstNum("1")
                        .enterOperator(OperatorEnum.MODULO)
                        .enterSecondNum("1")
                        .enterResult("0")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("1")
                        .enterOperator(OperatorEnum.MODULO)
                        .enterSecondNum("10")
                        .enterResult("1")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("10")
                        .enterOperator(OperatorEnum.MODULO)
                        .enterSecondNum("1")
                        .enterResult("0")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("1000000")
                        .enterOperator(OperatorEnum.MODULO)
                        .enterSecondNum("2000")
                        .enterResult("0")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("1000000")
                        .enterOperator(OperatorEnum.MODULO)
                        .enterSecondNum("28757")
                        .enterResult("22262")
                        .build()}

        };
    }

    @DataProvider
    public Object[][] validNumberWithMultOperData() {
        return new Object[][]{
                {new InfoBuilder()
                        .enterFirstNum("1")
                        .enterOperator(OperatorEnum.MULTIPLICATION)
                        .enterSecondNum("1")
                        .enterResult("1")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("1")
                        .enterOperator(OperatorEnum.MULTIPLICATION)
                        .enterSecondNum("10")
                        .enterResult("10")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("10")
                        .enterOperator(OperatorEnum.MULTIPLICATION)
                        .enterSecondNum("1")
                        .enterResult("10")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("1000000")
                        .enterOperator(OperatorEnum.MULTIPLICATION)
                        .enterSecondNum("2000")
                        .enterResult("2000000000")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("10")
                        .enterOperator(OperatorEnum.MULTIPLICATION)
                        .enterSecondNum("0")
                        .enterResult("0")
                        .build()}

        };
    }
    @DataProvider
    public Object[][] validNumberWithSubOperData() {
        return new Object[][]{
                {new InfoBuilder()
                        .enterFirstNum("1")
                        .enterOperator(OperatorEnum.SUBTRACTION)
                        .enterSecondNum("1")
                        .enterResult("0")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("1")
                        .enterOperator(OperatorEnum.SUBTRACTION)
                        .enterSecondNum("10")
                        .enterResult("-9")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("10")
                        .enterOperator(OperatorEnum.SUBTRACTION)
                        .enterSecondNum("1")
                        .enterResult("9")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("1000000")
                        .enterOperator(OperatorEnum.SUBTRACTION)
                        .enterSecondNum("2000")
                        .enterResult("998000")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("10")
                        .enterOperator(OperatorEnum.SUBTRACTION)
                        .enterSecondNum("0")
                        .enterResult("10")
                        .build()}

        };
    }

    @DataProvider
    public Object[][] invalidNumberWithAddOperData() {
        return new Object[][]{
                {new InfoBuilder()
                        .enterFirstNum("1s")
                        .enterOperator(OperatorEnum.ADDITION)
                        .enterSecondNum("1")
                        .enterResult("NaN")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("1")
                        .enterOperator(OperatorEnum.ADDITION)
                        .enterSecondNum("10s")
                        .enterResult("NaN")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("jgds11")
                        .enterOperator(OperatorEnum.ADDITION)
                        .enterSecondNum("1")
                        .enterResult("NaN")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("kjgfd")
                        .enterOperator(OperatorEnum.ADDITION)
                        .enterSecondNum("kjgkh")
                        .enterResult("NaN")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("1")
                        .enterOperator(OperatorEnum.ADDITION)
                        .enterSecondNum("kjjg11")
                        .enterResult("NaN")
                        .build()}

        };
    }

    @DataProvider
    public Object[][] invalidNumberWithDivOperData() {
        return new Object[][]{
                {new InfoBuilder()
                        .enterFirstNum("1")
                        .enterOperator(OperatorEnum.DIVISION)
                        .enterSecondNum("0")
                        .enterResult("Infinity")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("0")
                        .enterOperator(OperatorEnum.DIVISION)
                        .enterSecondNum("10ll")
                        .enterResult("NaN")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("10ll")
                        .enterOperator(OperatorEnum.DIVISION)
                        .enterSecondNum("1")
                        .enterResult("NaN")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("kkk")
                        .enterOperator(OperatorEnum.DIVISION)
                        .enterSecondNum("lll")
                        .enterResult("NaN")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("lkj22")
                        .enterOperator(OperatorEnum.DIVISION)
                        .enterSecondNum("2")
                        .enterResult("NaN")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("2")
                        .enterOperator(OperatorEnum.DIVISION)
                        .enterSecondNum("lkh22")
                        .enterResult("NaN")
                        .build()}

        };
    }

    @DataProvider
    public Object[][] invalidNumberWithModOperData() {
        return new Object[][]{
                {new InfoBuilder()
                        .enterFirstNum("0")
                        .enterOperator(OperatorEnum.MODULO)
                        .enterSecondNum("0")
                        .enterResult("NaN")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("1")
                        .enterOperator(OperatorEnum.MODULO)
                        .enterSecondNum("10ll")
                        .enterResult("NaN")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("10ll")
                        .enterOperator(OperatorEnum.MODULO)
                        .enterSecondNum("1")
                        .enterResult("NaN")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("lll22")
                        .enterOperator(OperatorEnum.MODULO)
                        .enterSecondNum("0")
                        .enterResult("NaN")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("10000000")
                        .enterOperator(OperatorEnum.MODULO)
                        .enterSecondNum("lll22")
                        .enterResult("NaN")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("lll")
                        .enterOperator(OperatorEnum.MODULO)
                        .enterSecondNum("lll")
                        .enterResult("NaN")
                        .build()}

        };
    }

    @DataProvider
    public Object[][] invalidNumberWithMultOperData() {
        return new Object[][]{
                {new InfoBuilder()
                        .enterFirstNum("1l")
                        .enterOperator(OperatorEnum.MULTIPLICATION)
                        .enterSecondNum("1l")
                        .enterResult("NaN")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("1")
                        .enterOperator(OperatorEnum.MULTIPLICATION)
                        .enterSecondNum("10ll")
                        .enterResult("NaN")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("10ll")
                        .enterOperator(OperatorEnum.MULTIPLICATION)
                        .enterSecondNum("1")
                        .enterResult("NaN")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("kkk")
                        .enterOperator(OperatorEnum.MULTIPLICATION)
                        .enterSecondNum("kkk")
                        .enterResult("NaN")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("lll22")
                        .enterOperator(OperatorEnum.MULTIPLICATION)
                        .enterSecondNum("0")
                        .enterResult("NaN")
                        .build()}

        };
    }
    @DataProvider
    public Object[][] invalidNumberWithSubOperData() {
        return new Object[][]{
                {new InfoBuilder()
                        .enterFirstNum("1ll")
                        .enterOperator(OperatorEnum.SUBTRACTION)
                        .enterSecondNum("1")
                        .enterResult("NaN")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("1")
                        .enterOperator(OperatorEnum.SUBTRACTION)
                        .enterSecondNum("10lll")
                        .enterResult("NaN")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("lll22")
                        .enterOperator(OperatorEnum.SUBTRACTION)
                        .enterSecondNum("0")
                        .enterResult("NaN")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("kkk")
                        .enterOperator(OperatorEnum.SUBTRACTION)
                        .enterSecondNum("kkk")
                        .enterResult("NaN")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("0")
                        .enterOperator(OperatorEnum.SUBTRACTION)
                        .enterSecondNum("lll22")
                        .enterResult("NaN")
                        .build()}

        };
    }

    @DataProvider
    public Object[][] validNumberDataForHistory() {
        return new Object[][]{
                {new InfoBuilder()
                        .enterFirstNum("2")
                        .enterOperator(OperatorEnum.ADDITION)
                        .enterSecondNum("1")
                        .enterResult("3")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("6")
                        .enterOperator(OperatorEnum.DIVISION)
                        .enterSecondNum("2")
                        .enterResult("3")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("6")
                        .enterOperator(OperatorEnum.MODULO)
                        .enterSecondNum("3")
                        .enterResult("0")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("6")
                        .enterOperator(OperatorEnum.MULTIPLICATION)
                        .enterSecondNum("2")
                        .enterResult("12")
                        .build()},
                {new InfoBuilder()
                        .enterFirstNum("6")
                        .enterOperator(OperatorEnum.SUBTRACTION)
                        .enterSecondNum("2")
                        .enterResult("4")
                        .build()}

        };
    }
}
