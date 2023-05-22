package com.projectmanagement.boot.Repositories;

import com.projectmanagement.boot.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role,Long> {
   // Role findByName(String name);

    Role findByroleName(String rolename);
    //   Role findRoleByName(String name);
}
