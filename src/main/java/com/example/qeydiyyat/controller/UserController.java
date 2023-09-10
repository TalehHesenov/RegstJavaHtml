package com.example.qeydiyyat.controller;

import com.example.qeydiyyat.model.User;
import com.example.qeydiyyat.repository.UserRepository;
import com.example.qeydiyyat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller

public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository repository;

    @GetMapping("/")
    public String register (Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "register";

    }


    @PostMapping("/registerUser")

    public String registerUser(@ModelAttribute("user") User user){
        String result = "error";
        System.out.println(user);
        if(user.getPassword().equals(user.getCpassword())){
            try {
                userService.registerUser(user);
                result="home";
            }
            catch (Exception exception){
                result="error";
            }
        }
        return result;
    }

    @PostMapping("/userLogin")

    public String loginUser(@ModelAttribute("user") User user){

        int userId=(int)user.getId();
        Optional<User> userdata=repository.findById(userId);
     if (user.getPassword().equals(userdata.get().getPassword())){
         return "girish";
     }else{
         return "error";
     }

    }
}
