package com.xworkz.beans;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class FormData {
    public FormData() {
        System.out.println("Created formData....!!!!!!!!!!!!!!!");

    }

    @PostMapping("/data")
    public String getData(DataDTO dataDTO){
        System.out.println("Running getData....");
        System.out.println("Input data: "+dataDTO);
        return "success.jsp";
    }
}
