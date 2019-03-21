package com.chenc.demo.dao;

import com.chenc.demo.model.UserDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author chenc
 * @date 2019-03-22
 */

@Mapper
public interface UserMapper {

    List<UserDO> list();

}
