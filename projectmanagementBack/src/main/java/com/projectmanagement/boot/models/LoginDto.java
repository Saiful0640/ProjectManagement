package com.projectmanagement.boot.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class LoginDto {
    String username;
    String password;
}
