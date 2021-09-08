package com.zf.service;


import com.zf.dao.UserMapper;
import com.zf.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{


    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }

    public User getUserByName(String username) {
        return userMapper.getUserByName(username);
    }


}
