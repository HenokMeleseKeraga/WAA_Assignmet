package edu.mum.controller;

import edu.mum.data.DataFacade;
import edu.mum.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthenticationController {
    @Autowired
    DataFacade data;
    @RequestMapping("/")
    public String loginForm(){
        return "login";
    }
    @RequestMapping(value = "/" , method = RequestMethod.POST)
    public String authenticateUser(User user){


        String password = user.getPassword();

        String expectedPassword = data.findPassword(user.getName());
        if(expectedPassword == null || !expectedPassword.equals(password)) {
            return "login";
        }

        return "LoginSuccessful";
    }
}
