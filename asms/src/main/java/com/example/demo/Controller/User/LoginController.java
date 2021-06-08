package com.example.demo.Controller.User;
import com.example.demo.Service.User.Impl.*;
import com.example.demo.Service.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Entity.User.User;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/admin/Login", method = RequestMethod.POST)
    public Map<String, Object> login(@RequestBody User user) {
        Map<String, Object> map = new HashMap<>();
        String password=user.getPassword();
        String username=user.getUsername();
        try{
        User user1=userService.selectUserByUsername(username);
        if(user)
        }
        catch (Exception e) {
        e.printStackTrace();
        map.put("success", false);
        map.put("message", "用户注册失败！");
    }
    return map;
    }
}
