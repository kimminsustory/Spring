package com.example.myapp.controller;

import com.example.myapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    // @GetMapping("/register") 이 메서드 제거
    // public String showRegisterPage() {
    //     return "register"; 
    // }

    @PostMapping("/register")
    public String registerUser(@RequestParam("id") String username,
                               @RequestParam("pw") String password,
                               @RequestParam("email") String email,
                               Model model) {
        String message = userService.registerUser(username, password, email);
        model.addAttribute("message", message);

        if ("회원가입완료!".equals(message)) {
            return "redirect:/login";
        } else {
            return "register";
        }
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    // 기타 메서드...
}

