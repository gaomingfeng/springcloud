package cn.china.server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
@RefreshScope
public class UserController {
    @Value("${env}")
    private String name;

    @GetMapping("/selectUser")
   public Map<String ,Object> selectUser(){
        Map<String ,Object> user = new HashMap<>(2);
        user.put("name", "张三11");
        user.put("age", 120);
        return user;
   }

   @GetMapping("/test")
   public String select(){
        return name;
   }
}
