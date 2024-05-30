package com.xworkz.beans;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ContactFormAction {
    public ContactFormAction() {
        System.out.println("Running no-arg const in ContactFormAction");
    }
    @PostMapping("/contact")
    public String getContactDetails(ContactDTO contactDTO, Model model){
        System.out.println("Running contactDetails method...........");
        System.out.println(contactDTO);
        model.addAttribute("match",contactDTO.getName()+","+"Your details submitted..");
        return "contactDetails.jsp";
    }
}
