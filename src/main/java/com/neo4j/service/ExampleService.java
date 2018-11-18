package com.neo4j.service;

import com.neo4j.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by kaka on 2018-11-18.
 */
@Service
public class ExampleService {

    @Autowired
    ExampleRepository exampleRepository ;

    public int getNodeCount() {
        return exampleRepository.getNodeCount() ;
    }

    public List<Map> getNodes() {
        return exampleRepository.getNodes() ;
    }
}
