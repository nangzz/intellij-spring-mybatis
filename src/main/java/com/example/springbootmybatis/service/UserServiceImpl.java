package com.example.springbootmybatis.service;

import com.example.springbootmybatis.entity.Users;
import com.example.springbootmybatis.repository.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// 비즈니스 로직 구현
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserMapper mapper;

    @Override
    public List<Users> getAllUsers() {
        return mapper.selectAllUsers();
    }

    @Override
    public Users getUserById(String id) {
        return mapper.selectUserById(id);
    }

    @Override
    public int createUser(Users user) {
        return mapper.insertUser(user);
    }

    @Override
    public int modifyUser(Users user) {
        return mapper.updateUser(user);

        /* 만약 update 쿼리를 안만들어놓고 다른 방법을 사용하면?
           delete > insert
          이런게 비즈니스 로직이고 비즈니스 로직은 주로 서비스 구현 클래스에서 정의!

            mapper.deleteUser(user.getId());
            mapper.insertUser(user);
            return 1;
         */
    }

    @Override
    public int removeUser(String id) {
        return mapper.deleteUser(id);
    }
}
