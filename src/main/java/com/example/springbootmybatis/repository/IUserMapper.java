package com.example.springbootmybatis.repository;

import com.example.springbootmybatis.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

// repository = dao
// 메소드명과 userMapper.xml의 id값이 같아야 인식함
@Mapper // mapper.xml과 연결될 인터페이스라는 뜻
@Repository // 데이터 관련 클래스라는 뜻
public interface IUserMapper {

    List<Users> selectAllUsers();
    Users selectUserById(String id);
    int insertUser(Users user); // mapper xml에서 resultType 따로 없어도 무조건 숫자 반환
    int updateUser(Users user);
    int deleteUser(String id);
}
