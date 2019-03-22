package com.chenc.demo.service;


import com.chenc.demo.model.UserDO;

import java.util.List;

public interface UserService {

    List<UserDO> list();

    void insert(UserDO userDO);

    UserDO get(Long userId);
}
