package com.projectmanagement.boot.authService;

import com.projectmanagement.boot.Iservices.Ilogin;
import com.projectmanagement.boot.Repositories.UserRepo;
import com.projectmanagement.boot.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Login  implements Ilogin {

    @Autowired
    UserRepo userRepo;


    @Override
    public User findByusernameAndPassword(String username, String password) {

        return   userRepo.findByusernameAndPassword(username, password);
    }
}
