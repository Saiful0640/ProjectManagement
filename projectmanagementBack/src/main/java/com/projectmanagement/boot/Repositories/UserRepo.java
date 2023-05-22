package com.projectmanagement.boot.Repositories;

import com.projectmanagement.boot.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    @Query("SELECT u From User u " +
            " Where u.username =?1 AND u.password= ?2")
    User findByusernameAndPassword(String username ,String password );
}
