package com.forsun.fifa;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepo extends MongoRepository<Country, ObjectId> {
}
