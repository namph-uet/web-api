package web.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.service.user.model.Role;
import web.service.user.model.User;

import java.util.Set;

@RestController
public class FrontController {

    @RequestMapping("/hello")
    public User createUser(){
        return new User("asd","asdda","dasda","asda","dsda", (Set<Role>) new Role(0,"admin"));
    }

}
