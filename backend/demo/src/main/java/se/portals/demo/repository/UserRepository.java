package se.portals.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import se.portals.demo.entity.User;

public interface UserRepository extends PagingAndSortingRepository<User, String> {

}
