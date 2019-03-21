package com.chenc.demo.service.impl;

import com.chenc.demo.dao.UserMapper;
import com.chenc.demo.model.UserDO;
import com.chenc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenc
 * @date 2019-03-22
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserDO> list() {
        return userMapper.list();
    }
}
