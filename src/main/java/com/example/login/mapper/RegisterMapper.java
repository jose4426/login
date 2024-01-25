package com.example.login.mapper;

import com.example.login.dto.RegistersResponse;
import com.example.login.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RegisterMapper {

    List<RegistersResponse> entityToResponse(List<User> users);

}
