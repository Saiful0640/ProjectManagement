package com.projectmanagement.boot.Iservices;

import com.projectmanagement.boot.models.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IUserService {

    boolean registerUser(User user);


}
