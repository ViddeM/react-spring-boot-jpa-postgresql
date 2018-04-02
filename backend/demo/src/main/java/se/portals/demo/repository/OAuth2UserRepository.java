package se.portals.demo.repository;

import org.springframework.data.repository.Repository;
import se.portals.demo.entity.OAuth2User;

public interface OAuth2UserRepository extends Repository<OAuth2User, String>{

    OAuth2User findOneByNick(String nick);

}
