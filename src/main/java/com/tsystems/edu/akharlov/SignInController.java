package com.tsystems.edu.akharlov;

import com.tsystems.edu.akharlov.services.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SignInController {
    @RequestMapping("/login")
    public ModelAndView signIn(@RequestParam("username") String username,
                               @RequestParam("password") String password){

        LoginService loginService = new LoginService();
        String credentials = loginService.generateCredentials(username, password);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");//home.jsp
        modelAndView.addObject("credentials", credentials);

        return modelAndView;
    }
}