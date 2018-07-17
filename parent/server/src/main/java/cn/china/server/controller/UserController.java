package cn.china.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/selectUser")
   public Map<String ,Object> selectUser(){
        Map<String ,Object> user = new HashMap<>(2);
        user.put("name", "张三11");
        user.put("age", 120);
        return user;
   }
}
