package com.example.demo.Controllers;

import com.example.demo.Service.ItemServiceImpl;
import com.example.demo.Service.MailServiceImpl;
import com.example.demo.Service.UserServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    private UserServiceImpl userService;
    private ItemServiceImpl itemService;
    private MailServiceImpl mailService;

    //Setter Injection
    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void setItemService(ItemServiceImpl itemService) {
        this.itemService = itemService;
    }

    public void setMailService(MailServiceImpl mailService) {
        this.mailService = mailService;
    }



}
