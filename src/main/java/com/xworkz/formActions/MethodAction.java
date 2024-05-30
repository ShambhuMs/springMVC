package com.xworkz.beans;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class MethodAction {
    public MethodAction() {
        System.out.println("Running no arg const in MethodAction.....");
    }
    @PostMapping("/send")
    public String sendMethod(){
        System.out.println("Running send method in MethodAction Class/////////");
        return "index.jsp";
    }
}
