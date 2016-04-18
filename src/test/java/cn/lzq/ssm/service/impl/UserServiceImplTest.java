package cn.lzq.ssm.service.impl;

import cn.lzq.ssm.po.User;
import cn.lzq.ssm.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by liuzhiqi on 2016/4/16.
 */
public class UserServiceImplTest {
    private ApplicationContext context;

    private UserService userService;

    @Before
    public void setUp(){
        context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");

        userService = (UserService)context.getBean("userService");
    }

    @Test
    public void testFindUserById() throws Exception {
        User user = userService.findUserById(1);
        assertNotNull(user);
    }

    @Test
    public void testFindAllUser() throws Exception {
        List<User> allUser = userService.findAllUser();
        assertNotNull(allUser);
    }
}