package com.example.login.controller;

import com.example.login.dto.RegistersResponse;
import com.example.login.service.RegistersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1")

@RequiredArgsConstructor
public class AuthorizationController {
   private final RegistersService service;

    @GetMapping(value = "/resource")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Here is your resource");
    }
    @GetMapping(value = "/registers")
    public ResponseEntity<List<RegistersResponse>> gerAll() {

      List<RegistersResponse> responses =  service.findAll();

        return ResponseEntity.ok(responses);
    }

}
