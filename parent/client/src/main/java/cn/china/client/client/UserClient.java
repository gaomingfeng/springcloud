package cn.china.client.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@FeignClient(name = "FEGIN-CLIENT")
public interface UserClient {

    @RequestMapping("/user/selectUser")
    public Map<String, Object> selectUser();
}
