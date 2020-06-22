package com.hzt.mapper;




import com.hzt.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> userList();

    void insertUser(User user);

    void edit(User user);

    void delete(Integer id);


    User findById(Integer id);

    User findUser(Integer id);
}
