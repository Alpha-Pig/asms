package com.example.demo.Controller.User;

import com.example.demo.Entity.User.User;
import com.example.demo.Service.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
public class RegisterController {

    @Autowired
    private UserService userService;
    @RequestMapping(value = "/admin/register", method = RequestMethod.POST)
    public Map<String, Object> login(@RequestBody User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        Map<String, Object> map = new HashMap<>();
        try {
            User user1 = new User(username, password);
            User user2 = userService.selectUserByUsername(user1.getUsername());
            if (user2 != null) {
                map.put("message", "用户名已经存在，请更换用户名!");
                map.put("success",false);
            } else
            {
                user1.setShenfen("Stu");
                userService.registerNewUser(user1);
                map.put("message","用户已经注册成功");
                map.put("success",true);
        }
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", false);
            map.put("message", "用户注册失败！");
        }
        return map;
    }
}
