package com.neo4j.service;

import com.neo4j.model.Coder;
import com.neo4j.model.UserNode;
import com.neo4j.repository.CoderRepository;
import com.neo4j.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kaka on 2018-11-12.
 */
@Service
public class CoderService {

    @Autowired
    CoderRepository coderRepository;

    public Coder findByName(String name){
        return coderRepository.findByName(name) ;
    }

    public Coder save(Coder coder){
        return coderRepository.save(coder) ;
    }
}
