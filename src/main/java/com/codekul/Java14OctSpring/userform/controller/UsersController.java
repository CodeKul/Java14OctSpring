package com.codekul.Java14OctSpring.userform.controller;

import com.codekul.Java14OctSpring.ApiResponse;
import com.codekul.Java14OctSpring.userform.domain.Users;
import com.codekul.Java14OctSpring.userform.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @PostMapping("saveUsers")
    public ResponseEntity<?> saveUsers(@RequestBody Users users){
        ApiResponse<Users> apiResponse = new ApiResponse<>();
        Users users1 = usersRepository.save(users);
        apiResponse.setMessage("User saved");
        apiResponse.setStatusCode(HttpStatus.OK.value());
        apiResponse.setResult(users1);

         return new ResponseEntity<>(apiResponse,HttpStatus.CREATED);
    }
}
