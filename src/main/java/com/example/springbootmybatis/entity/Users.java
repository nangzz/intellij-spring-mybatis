package com.example.springbootmybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    private String id;
    private String name;
    private String email;
    private Date createAt;

    // 사용자 생성 시 createAt은 입력 필요없으니까

    public Users(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
