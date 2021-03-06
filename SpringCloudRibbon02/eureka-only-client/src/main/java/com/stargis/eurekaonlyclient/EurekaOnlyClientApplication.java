package com.stargis.eurekaonlyclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class EurekaOnlyClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaOnlyClientApplication.class, args);
    }
    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home(@RequestParam String name){
        return "hi "+name+",I'm from port:" +port;
    }
}
