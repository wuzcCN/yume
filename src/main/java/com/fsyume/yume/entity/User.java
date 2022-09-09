package com.fsyume.yume.entity;

import lombok.Data;

@Data
public class User {
    private Long uid;
    private String userName;
    private String userPassword;
    private String userEmail;
}
