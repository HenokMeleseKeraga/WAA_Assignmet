package mum.controller;


import mum.domain.Calculator;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.Controller;
import mum.edu.framework.annotation.RequestMapping;
import mum.validator.CalculatorValidator;


import javax.servlet.http.HttpServletRequest;

@Controller
public class CalculatorController  {
@AutoWired
    CalculatorValidator validator;

@RequestMapping(value = {"/"})
public String inputNumber(){
    return "/WEB-INF/jsps/calculator.jsp";
}
@RequestMapping(value = {"/calc"} )
public String result(Calculator calculator, HttpServletRequest request){

    String add1 = request.getParameter("add1").trim() ;
    String add2 = request.getParameter("add2").trim();
    String mult1 = request.getParameter("mult1").trim();
    String mult2 = request.getParameter("mult2").trim();

    String sum = "";
    String product = "";
    Calculator calculator1=null;
    Calculator calculator2=null;
    // Check for valid inputs....
    try {
        Integer a1 = Integer.parseInt(add1);
        Integer a2 = Integer.parseInt(add2);
        calculator1=new Calculator(a1,a2);
        sum = "" + (a1+a2);
    } catch(NumberFormatException e) {
        if (add1.isEmpty()) add1 = "''";
        if (add2.isEmpty()) add2 = "''";
        sum = "''";
    }

    /*
     * Integer.parseInt(str) throws NumberFormatException
     * if the string cannot be converted to an integer.
     */

    try {
        Integer m1 = Integer.parseInt(mult1);
        Integer m2 = Integer.parseInt(mult2);
        calculator2=new Calculator(m1,m2);
        product = "" + (m1 * m2);
    } catch(NumberFormatException e) {
        if (mult1.isEmpty()) mult1 = "''";
        if (mult2.isEmpty()) mult2 = "''";
        product = "''";
    }

    request.setAttribute("sum",sum);
    request.setAttribute("product",product);
    request.setAttribute("calculator1", calculator1);
    request.setAttribute("calculator2", calculator2);
    return "/WEB-INF/jsps/result.jsp";
}


}
