package cn.lzq.ssm.mapper;

import cn.lzq.ssm.po.User;

/**
 * Created by liuzhiqi on 2016/3/7.
 */
public interface UserMapper {

    public User findUserById(int id) throws Exception;


}
