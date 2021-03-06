package edu.mum.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Calculator {
   @NotNull
    private Double firstNumber;
   @NotNull
    private Double secondNumber;
    private Double result;
    private Character operator;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public Character getOperator() {
        return operator;
    }

    public void setOperator(Character operator) {
        this.operator = operator;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }
}
