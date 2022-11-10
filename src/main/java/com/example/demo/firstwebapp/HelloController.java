package com.example.demo.firstwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String sayHello(){

        return "Hello world!!";
    }
    @GetMapping("/hellohtml")
    @ResponseBody
    public String sayHellohtml(){

        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> First html page</title>");
        sb.append("</head>");
        sb.append("<body> Hello world from html </body>");
        sb.append("<html>");

        return sb.toString();
    }

    @RequestMapping("/helloJSP")
    public String sayHelloJSP(){
        return "sayHello";
    }
}
