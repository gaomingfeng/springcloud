package cn.china.client.cotroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    @RequestMapping("/selectUser")
    public Map<String, Object> selectUser(){
        Map<String, Object> user = new HashMap<>(2);
        user.put("name", "张三");
        user.put("age", 18);
        return user;
    }
}
