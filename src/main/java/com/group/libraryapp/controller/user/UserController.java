package com.group.libraryapp.controller.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.group.libraryapp.domain.user.User;
import com.group.libraryapp.dto.user.request.UserCreateRequest;


@RestController
public class UserController {

    private final List<User> users = new ArrayList<>();
    
    @PostMapping("/user") //user path로 진입 시 아래 함수 실행
    public void saveUser(@RequestBody UserCreateRequest request) {
        //TODO: process POST request
    }
    
}
