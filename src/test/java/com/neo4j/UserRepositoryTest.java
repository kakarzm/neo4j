package com.neo4j;

import com.neo4j.model.UserNode;
import com.neo4j.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by kaka on 2018-11-8.
 */
@Component
public class UserRepositoryTest extends Neo4jApplicationTests{

   // Logger logger = LoggerFactory.getLogger(UserRepositoryTest.class);

    @Autowired
    UserRepository userRepository;

    @Test
    public void createUserNode(){
        System.out.println(userRepository);
        UserNode userNode = new UserNode();
        userNode.setName("liudehua");
        userNode.setUserId("007");
        UserNode save = userRepository.save(userNode);
        System.out.println(save.toString()) ;
       // logger.info(save.toString());
        Assert.assertTrue(save!=null);
    }

    @Test
    public void delAll(){
        userRepository.deleteById(new Long(4));

    }


}
