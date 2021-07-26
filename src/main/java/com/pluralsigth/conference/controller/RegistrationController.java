package com.pluralsigth.conference.controller;

import com.pluralsigth.conference.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Map;

@Controller
public class RegistrationController {
    @GetMapping("registrations")
    public String getRestration(@ModelAttribute("reg")Registration registration){
        return "registrations";
    }

    @PostMapping("registrations")
    public String addRestration(@Valid @ModelAttribute("reg")Registration registration,
                                BindingResult result){
        if (result.hasFieldErrors()){
            System.out.println("There were Registration Errors");
            return "registrations";
        }
        System.out.println("Registration" + registration.getName());
        return "redirect:registrations";
    }
}
