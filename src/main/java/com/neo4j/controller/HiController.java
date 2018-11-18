package com.neo4j.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by kaka on 2018-11-17.
 */
@RestController
@RequestMapping("/hi")
public class HiController {

    @Value("${server.port}")
    String port;

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hi")
    public String hi () {
        return "i am neo from port:"+ port;
    }


    @RequestMapping("/neighbor")
    public String neighbor () {

        return restTemplate.getForObject("http://service-neo/hi",String.class);
    }
}
