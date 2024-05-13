package com.group.libraryapp.controller.user;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.group.libraryapp.domain.user.User;
import com.group.libraryapp.dto.user.request.UserCreateRequest;
import com.group.libraryapp.dto.user.response.UserResponse;




@RestController
public class UserController {

    private final List<User> users = new ArrayList<>();
    
    @PostMapping("/user") //user path로 "진입 시" 아래 함수 실행
    public void saveUser(@RequestBody UserCreateRequest request) {
        users.add(new User(request.getName(), request.getAge())); //POST/user 호출 시 arraylist에 추가
        //해당 함수가 잘 마무리되면 200 OK 반환
    }
    
    @GetMapping("/user")
    public List<UserResponse> getUsers( ) {
        List<UserResponse> responses = new ArrayList();
        for (int i = 0 ; i < users.size() ; i++ )
        {
            responses.add(new UserResponse(i + 1, users.get(i)));
        }

        return responses;
    }
    

}
