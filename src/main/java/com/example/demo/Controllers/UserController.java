package com.example.demo.Controllers;

import com.example.demo.Service.ItemServiceImpl;
import com.example.demo.Service.MailServiceImpl;
import com.example.demo.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    //Field Injection
    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private ItemServiceImpl itemService;

    @Autowired
    private MailServiceImpl mailService;



}
