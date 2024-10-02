package ma.solide.springdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ma.solide.springdatarest.model.User;

import java.util.List;

@RepositoryRestResource(path = "members")
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByFirstName(@Param("firstName") String firstName);

}
