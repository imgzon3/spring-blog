package com.security.springsecuritytest.web;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 주소 지정하는 컨트롤러
@RequiredArgsConstructor
@Controller
public class IndexController {

    @GetMapping("/") // 로그인 페이지
    public String loginPage() {
        return "login";
    }

    @GetMapping("/signup") // 회원가입 페이지
    public String signupPage() {
        return "signup";
    }

    @GetMapping("/main") // 유저 페이지
    public String userPage() {
        return "user";
    }

    @GetMapping("/admin") // 어드민 페이지
    public String adminPage() {
        return "admin";
    }
}
