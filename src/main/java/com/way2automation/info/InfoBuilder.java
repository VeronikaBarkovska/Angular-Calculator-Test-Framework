package com.way2automation.info;

import com.way2automation.pages.enums.OperatorEnum;

public class InfoBuilder {
    private String firstNum;
    private OperatorEnum operator;
    private String secondNum;
    private String result;

    public InfoBuilder(){

    }
    public InfoBuilder(String firstNum, String secondNum, OperatorEnum operator, String result){
        this.firstNum =firstNum;
        this.secondNum=secondNum;
        this.operator =operator;
        this.result = result;
    }

    public OperatorEnum getOperator() {
        return operator;
    }

    public void setOperator(OperatorEnum operator) {
        this.operator = operator;
    }

    public String getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(String firstNum) {
        this.firstNum = firstNum;
    }

    public String getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(String secondNum) {
        this.secondNum = secondNum;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public InfoBuilder enterFirstNum(String firstNum){
        this.firstNum = firstNum;
        return this;
    }

    public InfoBuilder enterSecondNum(String secondNum){
        this.secondNum = secondNum;
        return this;
    }

    public InfoBuilder enterOperator(OperatorEnum operator){
        this.operator = operator;
        return this;
    }
    public InfoBuilder enterResult(String result){
        this.result = result;
        return this;
    }

    public InfoBuilder build() {
        return new InfoBuilder(firstNum, secondNum, operator, result);}
}
