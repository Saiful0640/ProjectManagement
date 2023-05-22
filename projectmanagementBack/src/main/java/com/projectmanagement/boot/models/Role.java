package com.projectmanagement.boot.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="role")
@Data
public class Role implements Serializable {

    private static final long serialVersionUID = -3095216484787115605L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="roleId")
    private long roleId;
    @Column(name="role_name")
    private String roleName;




}
