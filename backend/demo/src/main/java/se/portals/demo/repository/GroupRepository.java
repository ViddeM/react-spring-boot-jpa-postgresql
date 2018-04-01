package se.portals.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import se.portals.demo.entity.Group;

public interface GroupRepository extends PagingAndSortingRepository<Group, String>{
}
