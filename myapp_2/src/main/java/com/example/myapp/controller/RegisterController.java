package com.example.myapp.controller;

import com.example.myapp.model.User;
import com.example.myapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showRegisterPage() {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam("id") String id, 
                               @RequestParam("pw") String pw, 
                               @RequestParam("email") String email, 
                               Model model) {
        if (userService.isUserExists(id)) {
            model.addAttribute("message", "등록된 ID입니다!");
            return "register";
        } else {
            userService.saveUser(new User(id, pw, email));
            model.addAttribute("message", "회원가입완료!");
            return "redirect:/login";
        }
    }
}

