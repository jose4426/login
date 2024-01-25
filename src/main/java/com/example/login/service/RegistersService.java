package com.example.login.service;

import com.example.login.dto.RegistersResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RegistersService {
List<RegistersResponse> findAll();

}
