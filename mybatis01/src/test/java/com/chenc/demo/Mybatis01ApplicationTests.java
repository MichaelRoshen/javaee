package com.chenc.demo;

import com.chenc.demo.dao.UserMapper;
import com.chenc.demo.model.UserDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Mybatis01ApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void testQuery() throws Exception {
		List<UserDO> users = userMapper.list();
		System.out.println(users.toString());
	}

}
