package cn.lzq.ssm.test;

import cn.lzq.ssm.mapper.UserMapper;
import cn.lzq.ssm.po.User;
import cn.lzq.ssm.service.UserService;
import cn.lzq.ssm.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liuzhiqi on 2016/4/9.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");

        UserService userService = (UserService)context.getBean("userService");

        User user = new User();
        user.setName("杨过");
        user.setAge(30);
        user.setGender("男");
        user.setAddress("钟南山");

        userService.addUser(user);

    }
}
