package com.chenc.demo.controller;

import com.chenc.demo.model.UserDO;
import com.chenc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chenc
 * @date 2019-03-22
 */

@RestController
public class UserController {

    @Autowired(required = false)
    private UserService userService;

    @GetMapping(name = "users")
    private List<UserDO> userList(){
        return userService.list();
    }
}
