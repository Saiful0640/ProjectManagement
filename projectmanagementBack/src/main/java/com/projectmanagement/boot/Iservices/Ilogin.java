package com.projectmanagement.boot.Iservices;

import com.projectmanagement.boot.models.User;
import org.springframework.stereotype.Service;

@Service
public interface Ilogin {
    User findByusernameAndPassword(String username , String password );
}
