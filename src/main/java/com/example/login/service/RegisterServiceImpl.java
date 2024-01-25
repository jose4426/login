package com.example.login.service;

import com.example.login.dto.RegisterRequest;
import com.example.login.dto.RegistersResponse;
import com.example.login.entity.User;
import com.example.login.mapper.RegisterMapper;
import com.example.login.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class RegisterServiceImpl implements RegistersService{
    private final UserRepository repository;
    private final RegisterMapper mapper;

    @Override
    public List<RegistersResponse>  findAll() {
        List<User> users= new ArrayList<>();

        users= repository.findAll();

        return mapper.entityToResponse(users);
    }
}
