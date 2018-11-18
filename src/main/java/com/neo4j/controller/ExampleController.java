package com.neo4j.controller;


import com.neo4j.model.Coder;
import com.neo4j.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kaka on 2018-11-18.
 */
@RestController
@RequestMapping("/example")
public class ExampleController {

    @Autowired
    ExampleService exampleService ;

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public Map getCount() {
        Map<String,String> m = new HashMap() ;
        m.put("nodeCount",exampleService.getNodeCount() + "") ;
        return m ;
    }

    @RequestMapping(value = "/nodes", method = RequestMethod.GET)
    public List<Map> getNodes() {

        return exampleService.getNodes() ;
    }
}
