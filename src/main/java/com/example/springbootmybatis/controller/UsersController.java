package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.entity.Users;
import com.example.springbootmybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    IUserService service;

    // 사용자 전체 조회
    @GetMapping("/users")
    public List<Users> getAllUsers() {
        List<Users> list = service.getAllUsers();

        return list;
    }

    // 사용자 1명 조회
    @GetMapping("/users/{id}")
    public Users getUserById(@PathVariable String id) {
        Users user = service.getUserById(id);

        if(user == null) {
//            throw new UserNotFoundException();
        }

        return user;
    }

    // 사용자 등록
    @PostMapping("/users")
    public int createUser(@RequestBody Users user) {
        int create = service.createUser(user);
        return create;
    }

    // 사용자 삭제
    @DeleteMapping("/users/{id}")
    public int removeUser(@PathVariable String id) {
        int remove = service.removeUser(id);
        return remove;
    }

    // 사용자 수정
    @PutMapping("/users")
    public int updateUser(@RequestBody Users user) {
        int update = service.modifyUser(user);
        return update;
    }
}
