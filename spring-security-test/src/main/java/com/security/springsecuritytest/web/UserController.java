package com.security.springsecuritytest.web;

import com.security.springsecuritytest.service.UserService;
import com.security.springsecuritytest.web.dto.UserInfoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserService userService;

    @PostMapping("/user") // signup api
    public String signup(UserInfoDto infoDto) {
        userService.save(infoDto);
        return "login";
    }

}
