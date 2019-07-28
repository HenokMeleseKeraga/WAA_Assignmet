package edu.mum.controller;

import edu.mum.model.Calculator;
import edu.mum.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class CalculatorController {

    @Autowired
    ICalculatorService calculatorService;

    @RequestMapping("/")
    public String getCalculatorForm(@ModelAttribute("calculator") Calculator calculator){
        return "addForm";
    }

    @RequestMapping(value = "/" ,method = RequestMethod.POST)
    public String calculate(@Valid Calculator calculator , Model model, RedirectAttributes attributes){
        calculator.setResult(calculatorService.calculate(calculator));
        attributes.addFlashAttribute("calculator",calculator);
        attributes.addAttribute("geeting all");
       return "redirect:/result";
    }
    @RequestMapping(value = "/result",method = RequestMethod.GET)
    public String calculatorresult(){
        return "calculetresult";
    }
}
