package com.example.demo.Service.User;
import com.example.demo.Entity.User.User;

public interface UserService {
    public User selectUserByUsername(String name);

    public void registerNewUser(User user);
}
