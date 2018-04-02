package se.portals.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import se.portals.demo.repository.OAuth2UserRepository;

@Service("userDetailsService")
public class OAuth2UserService implements UserDetailsService{

    @Autowired
    private OAuth2UserRepository oAuth2UserRepository;

    @Override
    public UserDetails loadUserByUsername(String nick) throws UsernameNotFoundException {
        return oAuth2UserRepository.findOneByNick(nick);
    }
}
