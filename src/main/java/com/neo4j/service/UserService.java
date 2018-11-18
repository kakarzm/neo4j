package com.neo4j.service;

import com.neo4j.model.UserNode;
import com.neo4j.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kaka on 2018-11-12.
 */
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserNode findByName(String name){
        return userRepository.findByName(name) ;
    }
}
