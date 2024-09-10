package com.example.myapp.controller;

import com.example.myapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam("id") String id, 
                            @RequestParam("pw") String pw, 
                            @RequestParam("code") String code,
                            Model model) {
        if (userService.isUserValid(id, pw)) {
            String generatedCode = userService.sendVerificationCode(id);
            model.addAttribute("verificationSent", true);
            return "login";
        } else {
            model.addAttribute("message", "존재하지 않는 ID입니다!");
            return "login";
        }
    }

    @PostMapping("/verify")
    public String verifyCode(@RequestParam("code") String code, Model model) {
        if (userService.verifyCode(code)) {
            model.addAttribute("message", "환영합니다!");
            return "redirect:/mypage";
        } else {
            model.addAttribute("message", "인증번호를 확인해주세요!");
            return "login";
        }
    }
}

