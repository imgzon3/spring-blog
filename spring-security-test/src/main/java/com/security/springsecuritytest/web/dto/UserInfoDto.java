package com.security.springsecuritytest.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserInfoDto {

    private String email;
    private String password;
    private String auth;

    public UserInfoDto(String email, String password, String auth) {
        this.email = email;
        this.password = password;
        this.auth = auth;
    }
}
