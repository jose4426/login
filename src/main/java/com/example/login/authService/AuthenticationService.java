package com.example.login.authService;

import com.example.login.dto.JwtAuthenticationResponse;
import com.example.login.dto.RegisterRequest;
import com.example.login.dto.LoginRequest;

public interface AuthenticationService {
    JwtAuthenticationResponse register(RegisterRequest request);

    JwtAuthenticationResponse login(LoginRequest request);
}
