package com.projectmanagement.boot.controllers;

import com.projectmanagement.boot.Iservices.IUserService;
import com.projectmanagement.boot.Iservices.Ilogin;
import com.projectmanagement.boot.models.LoginDto;
import com.projectmanagement.boot.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.jnlp.ClipboardService;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    IUserService userRegisterService;

    @Autowired
    Ilogin ilogin;

    @PostMapping("/login")
    public ResponseEntity<Boolean> registerUser(@RequestBody LoginDto loginDto){

        User user = ilogin.findByusernameAndPassword(loginDto.getUsername(), loginDto.getPassword());
        boolean isSuccess=user.getUserId()>0;
        return  ResponseEntity.ok(isSuccess);
        /*return ResponseEntity .ok().header(isSuccess)
                .body(user);*/
    }

    @PostMapping("/registerUser")
    public ResponseEntity<Boolean> registerUser(@RequestBody User user){
       boolean isSuccess = userRegisterService.registerUser(user);
        return  ResponseEntity.ok(isSuccess);
    }


   /* @GetMapping("/username/{username}")
    public ResponseEntity<User> findByusername(@PathVariable String username){

        User userList = userRegisterService.findByusername(username);
        return ResponseEntity.ok(userList);
    }*/
}
