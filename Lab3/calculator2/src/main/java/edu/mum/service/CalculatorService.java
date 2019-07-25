package edu.mum.service;

import edu.mum.model.Calculator;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService {

    public double calculate(Calculator calculator) {
        Double result=0.0;
        switch (calculator.getOperator()){
            case 'A':
                result=calculator.getFirstNumber()+calculator.getSecondNumber();
                break;
            case 'S':
                result=calculator.getFirstNumber()-calculator.getSecondNumber();
            case 'M':
                result=calculator.getFirstNumber()*calculator.getSecondNumber();
            case 'D':
                result =calculator.getFirstNumber()/calculator.getSecondNumber();

        }


        return result;
    }
}
