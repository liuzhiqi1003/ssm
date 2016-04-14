package cn.lzq.ssm.service.impl;

import cn.lzq.ssm.mapper.UserMapper;
import cn.lzq.ssm.po.User;
import cn.lzq.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by liuzhiqi on 2016/4/9.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User findUserById(int id) throws Exception {

        User user = userMapper.findUserById(id);

        return user;
    }

    public void addUser(User user) throws Exception {
        userMapper.addUser(user);
    }
}
