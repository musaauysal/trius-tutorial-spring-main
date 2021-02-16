package trius.springframework.repositories;
import org.springframework.stereotype.Repository;

import trius.springframework.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
}
