package com.chenc.demo.controller;

import com.chenc.demo.model.UserDO;
import com.chenc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author chenc
 * @date 2019-03-22
 */

@RestController
@RequestMapping(value = "users")
public class UserController {

    @Autowired(required = false)
    private UserService userService;

    @GetMapping(value = "list")
    public List<UserDO> list(){
        return userService.list();
    }

    @PostMapping(value = "save")
    public Boolean save(@RequestBody UserDO userDO){
        userService.insert(userDO);
        return true;
    }

    @GetMapping(value = "show/{id}")
    public UserDO get(@PathVariable("id") Long userId){
        return userService.get(userId);
    }
}
