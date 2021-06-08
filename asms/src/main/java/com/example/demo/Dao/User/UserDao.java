package com.example.demo.Dao.User;
import com.example.demo.Entity.User.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    public User selectUserByUsername(String name);
    public void registerNewUser(User user);
}

