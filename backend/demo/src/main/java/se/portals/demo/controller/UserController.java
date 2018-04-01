package se.portals.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.portals.demo.DemoApplication;
import se.portals.demo.entity.User;
import se.portals.demo.repository.UserRepository;

import javax.validation.Valid;

@RestController
@RequestMapping(value="/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    /*@RequestMapping(value="/users", method=RequestMethod.POST)
    public void addUser(@RequestBody User user){
        log.debug("help");
        userRepository.save(user);
    }*/

   /* @GetMapping(value="/users")
    public Iterable<User> getUsers(){
        return userRepository.findAll();
    }


    @PostMapping(value="/users/add")
    public User addUser(@Valid @RequestBody User user){
        log.debug("Test123");
        return userRepository.save(user);
    }
*/
   private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);
    @RequestMapping(value="/test")
    public String index(){
        log.info("Info");
        log.debug("Debug");
        return "Glass";
    }

    /*@RequestMapping(value="/error")
    public String error(){
        return "nope";
    }*/

}
