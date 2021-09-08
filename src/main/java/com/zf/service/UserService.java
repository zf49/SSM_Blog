package com.zf.service;

import com.zf.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {

    List<User> getAllUser();

    int addUser(User user);

    int deleteUser(@Param("id") int id);

    int updateUser(User user);

    User getUserById(@Param("id") int id);

    User getUserByName(@Param("username") String username);



}
