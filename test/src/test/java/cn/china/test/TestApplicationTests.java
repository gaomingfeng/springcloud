package cn.china.test;

import cn.china.client.client.UserClient;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {
	private Logger logger = LoggerFactory.getLogger(TestApplicationTests.class);
	//@Autowired
	//private LoadBalancerClient loadBalanced;

	//@Autowired
	//private RestTemplate restTemplate;

	@Autowired
	private UserClient userClient;
	@Test
	public void contextLoads() {
		//restTemplate 第一种方式
//		RestTemplate template = new RestTemplate();
//		String url = "http://localhost:8081/selectUser";
//		Map<String, Object> user = template.getForObject(url, Map.class);
//		logger.info("user: {}",user);

		//第二种restTemplate
		/*
		RestTemplate template = new RestTemplate();
		ServiceInstance serviceInstance = loadBalanced.choose("EUREKA-CLIENT");
		String url = String.format("http://%s:%s",serviceInstance.getHost(), serviceInstance.getPort()+"/selectUser");
		Map<String, Object> user = template.getForObject(url, Map.class);*/

		//restTemplate 第三种
		/*Map<String, Object> user = restTemplate.getForObject("http://EUREKA-CLIENT/selectUser", Map.class);
		logger.info("user: {}",user);*/

		Map<String, Object> user = userClient.selectUser();
		logger.info("user: {}",user);

	}

}
