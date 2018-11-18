package com.neo4j.repository;

import com.neo4j.model.Coder;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by kaka on 2018-11-18.
 */
@Repository
public interface ExampleRepository extends Neo4jRepository<Coder,Long> {

    Coder findByName(@Param("name") String name);

    @Query("match (n) return count(n)")
    int getNodeCount() ;

    @Query("match (n) return n")
    List<Map> getNodes() ;
}
