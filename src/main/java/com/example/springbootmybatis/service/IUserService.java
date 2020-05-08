package com.example.springbootmybatis.service;

import com.example.springbootmybatis.entity.Users;

import java.util.List;

public interface IUserService {

    // Mapper.java와 다른 클래스라는 걸 보여주기위해 이름을 수정함
    List<Users> getAllUsers();
    Users getUserById(String id);
    int createUser(Users user);
    int modifyUser(Users user);
    int removeUser(String id);
}
