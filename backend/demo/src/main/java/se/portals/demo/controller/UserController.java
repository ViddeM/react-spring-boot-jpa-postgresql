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

    @RequestMapping(value="/test")
    public String index(){
        return "Glass";
    }

}
