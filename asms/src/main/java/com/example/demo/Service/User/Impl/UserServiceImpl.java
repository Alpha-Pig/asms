package com.example.demo.Service.User.Impl;

import com.example.demo.Entity.User.User;
import com.example.demo.Service.User.UserService;
import com.example.demo.Dao.User.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public User selectUserByUsername(String name){return userDao.selectUserByUsername(name);}
    public void registerNewUser(User user)
    {
        userDao.registerNewUser(user);
    }

}
