package web.api.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import web.service.user.model.UserDto;

@RestController
public class Registration {

    @RequestMapping(value = "/user/registration", method = RequestMethod.POST)
    public String registration(WebRequest request, Model model){
        UserDto userDto = new UserDto();
        model.addAttribute("user", userDto);
        return "registration";
    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    public String admin(){
        return "admin";
    }

    @RequestMapping("/403")
    public String accessDenied(){
        return "403";
    }

    @RequestMapping("/login")
    public String getLogin(){
        return "login";
    }

    @RequestMapping("/logout")
    public String logout(){
        return "log out";
    }
}
