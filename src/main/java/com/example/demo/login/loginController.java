package com.example.demo.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {

    private AuthenticatorService AuthenticatorService;

    public loginController(com.example.demo.login.AuthenticatorService authenticatorService) {
        AuthenticatorService = authenticatorService;
    }

    @GetMapping("/loginn")
    public String loginn(@RequestParam String name, ModelMap modelMap){
        modelMap.put("name",name);
        return "login";
    }


    @GetMapping("/login")
    public String loginPage(){
        return "loginPage";
    }

    @PostMapping("/login")
    public String WelcomePage(@RequestParam String name, @RequestParam String Password,ModelMap model){

        if (AuthenticatorService.authenticate(name,Password)){

            model.put("name",name);
            return "welcomePage";
        }
        model.put("errormessage","Invalid Credentials  Please try again");
        return "loginPage";
    }
}
