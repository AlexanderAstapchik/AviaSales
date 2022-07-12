package com.example.aviasales.controller;

import com.example.aviasales.dto.UserDto;
import com.example.aviasales.entity.User;
import com.example.aviasales.service.UserService;
import com.example.aviasales.validators.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {

    @Autowired
    private UserValidator userValidator;

    @Autowired
    private UserService userService;
   
    
    @GetMapping("/login")
    public String getLoginPage(@RequestParam(value = "error",  required = false) String error,
                               Model model){
        if(error != null){
            model.addAttribute("errorMessage", "error.login");
        }
        return "login";
    }

    @GetMapping("/registration")
    public String getRegistrationPage(Model model) {
        UserDto userDto = new UserDto();
        model.addAttribute("userDto", userDto);
        return "registration";
    }

}
