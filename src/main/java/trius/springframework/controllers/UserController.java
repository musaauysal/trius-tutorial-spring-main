package trius.springframework.controllers;


import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import trius.springframework.commands.ProductForm;
import trius.springframework.commands.UserForm;
import trius.springframework.services.UserService;

import javax.validation.Valid;

@Controller
public class UserController {

    @RequestMapping("/sign")
    public String newUser(Model model){
        model.addAttribute("userForm", new UserForm());
        return "/sign";
    }

    @Autowired
    private UserService userService;
    @RequestMapping(value = "/sign", method = RequestMethod.POST)
    public String saveOrUpdateUser(@Valid UserForm userForm, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "/sign";
        }
        userService.saveOrUpdateUserForm(userForm);

//        return "redirect:/order/show/" + savedOrder.getId();
        return "redirect:/login/";
    }
}
