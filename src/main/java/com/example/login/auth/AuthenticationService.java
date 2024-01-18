package com.example.login.auth;

import com.example.login.dto.JwtAuthenticationResponse;
import com.example.login.dto.SignUpRequest;
import com.example.login.dto.SigninRequest;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}
