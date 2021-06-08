package com.example.demo.Controller.User;
import com.example.demo.Service.User.Impl.*;
import com.example.demo.Service.User.UserService;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Entity.User.User;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {
    private UserService userService;
    @RequestMapping(value = "/admin/Login", method = RequestMethod.POST)
    public Map<String, Object> login(@RequestBody User user) {
        Map<String, Object> map = new HashMap<>();
        String password=user.getPassword();
        String username=user.getUsername();
        if (user.getUsername().equals("admin") && user.getPassword().equals("123456")) {
            map.put("message", "密码错误");
            return map;
        }
        else {
            map.put("message", "密码错误");
            return map;
        }
    }
}
