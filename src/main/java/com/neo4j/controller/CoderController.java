package com.neo4j.controller;

import com.neo4j.model.Coder;
import com.neo4j.model.UserNode;
import com.neo4j.repository.UserRepository;
import com.neo4j.service.CoderService;
import com.neo4j.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

/**
 * Created by kaka on 2018-11-6.
 */
@RestController
@RequestMapping("/coder")
public class CoderController {


    @Autowired
    CoderService coderService;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public Coder findByName(@PathVariable String name) {

        Coder coder = coderService.findByName(name);
        System.out.println(coder.toString()) ;
        return coder ;
    }

    @PostMapping("/save")
    @Transactional
    public Coder Create(@RequestBody Coder coder) throws Exception{

        Coder result  = coderService.save(coder);
        return result ;
    }

}
