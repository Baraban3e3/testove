package testove.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import testove.models.ERole;
import testove.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
