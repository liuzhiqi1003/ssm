package cn.lzq.ssm.mapper;

import cn.lzq.ssm.po.User;

import java.util.List;

/**
 * Created by liuzhiqi on 2016/3/7.
 */
public interface UserMapper {

    public User findUserById(int id) throws Exception;

    public void addUser(User user) throws Exception;

    public List<User> findAllUser() throws Exception;

    public void updateUser(User user) throws Exception;

    public void deleteUser(int id) throws Exception;

}
