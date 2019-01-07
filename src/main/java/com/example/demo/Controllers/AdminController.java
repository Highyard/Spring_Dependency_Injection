package com.example.demo.Controllers;

import com.example.demo.Service.ItemServiceImpl;
import com.example.demo.Service.MailServiceImpl;
import com.example.demo.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AdminController {

    private final
    UserServiceImpl userService;
    private final
    ItemServiceImpl itemService;
    private final
    MailServiceImpl mailService;



    //Constructor Injection
    @Autowired
    AdminController (UserServiceImpl userService, ItemServiceImpl itemService, MailServiceImpl mailService) {
        this.userService = userService;
        this.itemService = itemService;
        this.mailService = mailService;
    }



}
