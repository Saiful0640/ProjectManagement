package com.projectmanagement.boot.serviceImplement;

import com.projectmanagement.boot.Iservices.IUserService;
import com.projectmanagement.boot.Repositories.RoleAssginRepo;
import com.projectmanagement.boot.Repositories.RoleRepo;
import com.projectmanagement.boot.Repositories.UserRepo;
import com.projectmanagement.boot.models.Role;
import com.projectmanagement.boot.models.RoleAssgin;
import com.projectmanagement.boot.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class UserServiceImplement implements IUserService {
    @Autowired
    UserRepo userRepo;

    @Autowired
    RoleAssginRepo roleAssginRepo;

    @Autowired
    RoleRepo roleRepo;

    @Override

    public boolean registerUser(User user) {

        /*User registerResponse = userRepo.save(user);
        boolean isSuccess = registerResponse.getUserId() >0 ;
        return isSuccess;*/

          //Add user in User Table . Value get from user
         /* User newUser = new User();
          newUser.setUsername(user.getUsername());
          newUser.setPassword(user.getPassword());
          newUser.setEmail(user.getEmail());*/
          User user1 = userRepo.save(user);

          Role role = roleRepo.findByroleName("User");
          //Add RoleAssgin Table. get value According to logic
          RoleAssgin roleAssgin = new RoleAssgin();
          roleAssgin.setRoleId(role.getRoleId());
          roleAssgin.setUserId(user1.getUserId());
          RoleAssgin roleAssgin1 = roleAssginRepo.save(roleAssgin);
          boolean iSsuccess = roleAssgin1.getId()>0;
          return iSsuccess;
    }





   /* @Override
    public User findByusername(String username) {
        return userRepo.findByusername(username);
    }*/


}
