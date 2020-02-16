package org.macicame.springmvcdemo.controller;

import org.macicame.springmvcdemo.model.User;
import org.macicame.springmvcdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String userForm(Locale locale, Model model) {
        model.addAttribute("users", userService.list());
        return "editUsers";
    }

    @ModelAttribute("user")
    public User formBackingObject() {
        return new User();
    }

    @PostMapping("/addUser")
    public String saveUser(@ModelAttribute("user") @Valid User user, BindingResult result, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("users", userService.list());
            return "editUsers";
        }

        userService.save(user);
        return "redirect:/";
    }
    
    @GetMapping("/teste")
    public String teste(){
        return "teste_view";
    }
    
    @GetMapping("/list")
    public String getAll(Model model){
        List<String> names =  new ArrayList<>();
        names.add("Abel");
        names.add("Marquel");
        names.add("Azarias");
        names.add("Gefted");
        model.addAttribute("list", names);
        model.addAttribute("teste", "Qualquer coisa");
        return "show_view";
    }
}
