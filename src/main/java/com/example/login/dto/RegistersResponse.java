package com.example.login.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class RegistersResponse {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
