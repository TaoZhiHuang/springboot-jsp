package com.hzt.service;

import com.hzt.entity.User;
import com.hzt.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> userList(){
        return userMapper.userList();
    }

    public void insertUser(User user){
           userMapper.insertUser(user);
    }

    public void edit(User user){
        userMapper.edit(user);
    }

    public void delete(Integer id){
        userMapper.delete(id);
    }

    public User findById(Integer id){
        return userMapper.findById(id);
    }

    public User findUser(Integer id){
        return userMapper.findUser(id);
    }

}
