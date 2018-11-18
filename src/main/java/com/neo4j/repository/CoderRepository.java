package com.neo4j.repository;

import com.neo4j.model.Coder;
import com.neo4j.model.UserNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by kaka on 2018-11-8.
 */

@Repository
public interface CoderRepository extends Neo4jRepository<Coder,Long> {

    Coder findByName(@Param("name") String name);
}
