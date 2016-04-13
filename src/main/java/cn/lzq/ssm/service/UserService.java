package cn.lzq.ssm.service;

import cn.lzq.ssm.po.User;

/**
 * Created by liuzhiqi on 2016/4/9.
 */
public interface UserService {

    public User findUserById(int id) throws Exception;
}
