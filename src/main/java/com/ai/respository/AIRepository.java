package com.ai.respository;

import com.ai.entity.ObjectDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface AIRepository extends MongoRepository<ObjectDetails,String>, AIRepositoryCustom {

    @Query("{ 'imageId' : ?0 }")
    List<ObjectDetails> getObjectDetailsByImageId(String tag);
}
