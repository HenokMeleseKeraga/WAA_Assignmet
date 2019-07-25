package edu.mum.controller;

import edu.mum.data.DataFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class AdviceController {
    @Autowired
    DataFacade data;
    @RequestMapping("/advice")
    public String getAdviceForm(HttpServletRequest request){
        Map< String, String > roastMap = new HashMap<String, String>();

        roastMap.put("Light", "light");
        roastMap.put("Medium", "medium");
        roastMap.put("Dark", "dark");

        request.setAttribute("roasts", roastMap);
        return "advice";
    }
    @RequestMapping(value = "/advice" , method = RequestMethod.POST)
    public  String getAdvice(HttpServletRequest request){

        String roast = request.getParameter("roast");

        List<String> advice = data.getAdvice(roast);

        request.setAttribute("roastList", advice);

        return "display";
    }

}
