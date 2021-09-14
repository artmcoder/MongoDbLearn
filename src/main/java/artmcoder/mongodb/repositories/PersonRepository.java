package artmcoder.mongodb.repositories;

import artmcoder.mongodb.models.Person;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface PersonRepository extends MongoRepository<Person, ObjectId> {
}
