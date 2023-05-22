package com.projectmanagement.boot.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="roleassgin")
public class RoleAssgin {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="role_Id")
    private long roleId;
    @Column(name="user_id")
    private long userId;


}
