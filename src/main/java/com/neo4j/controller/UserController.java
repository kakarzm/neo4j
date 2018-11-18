package com.neo4j.controller;

import com.neo4j.model.UserNode;
import com.neo4j.repository.UserRepository;
import com.neo4j.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kaka on 2018-11-6.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;
    @Autowired
    UserService userService;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public UserNode findByName(@PathVariable String name) {

        UserNode userNode = userService.findByName(name);
        System.out.println(userNode.toString()) ;
        return userNode ;
    }
    @RequestMapping(path = "/addUserNode", method = RequestMethod.GET)
    public String addUserNode() {
        int i = 0;
        do {
            UserNode user = new UserNode();
            user.setName("Fredia" + i);
            UserNode save = userRepository.save(user);
            System.out.println(save.toString()) ;
            i += 1;
        } while (i < 400);

        return "ok";
    }

}
