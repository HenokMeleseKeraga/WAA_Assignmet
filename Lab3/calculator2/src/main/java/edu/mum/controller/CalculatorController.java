package edu.mum.controller;

import edu.mum.model.Calculator;
import edu.mum.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalculatorController {

    @Autowired
    ICalculatorService calculatorService;

    @RequestMapping("/")
    public String getCalculatorForm(@ModelAttribute("calculator") Calculator calculator){
        return "addForm";
    }

    @RequestMapping(value = "/" ,method = RequestMethod.POST)
    public String calculate(Calculator calculator , Model model){
        calculator.setResult(calculatorService.calculate(calculator));
       model.addAttribute("calculator",calculator);
       return "calculetresult";
    }
}
