package com.example.spring.cloud.feign.client;

//import com.example.spring.cloud.eureka.client.GreetingController;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("spring-cloud-eureka-client")
public interface GreetingClient  {
    @RequestMapping("/greeting")
    String greeting();
}
